package example;
// package ai.cochlear.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

import ai.cochl.client.ApiClient;
import ai.cochl.client.Configuration;
import ai.cochl.client.auth.ApiKeyAuth;
import ai.cochl.sense.api.AudioSessionApi;
import ai.cochl.sense.model.*;

public class File {
    public static void main(String[] args) {
        try {
            inference();
        } catch (ai.cochl.client.ApiException e) {
            System.out.println(e.getResponseBody());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void inference() throws ai.cochl.client.ApiException, java.io.IOException {
        String path = "siren.wav";
        String contentType = "audio/wav";
        String key = "Vi4BCU82O1HYA5qhHBFNnYCqwKQyk7/GgxG3Dh3XhlI=";

        byte[] file = Files.readAllBytes(Paths.get(path));

        ApiClient cli = Configuration.getDefaultApiClient();
        ApiKeyAuth API_Key = (ApiKeyAuth) cli.getAuthentication("API_Key");
        API_Key.setApiKey(key);

        AudioSessionApi api = new AudioSessionApi(cli);

        CreateSession create = new CreateSession();
        create.setContentType(contentType);
        create.setType(AudioType.FILE);
        create.setTotalSize(file.length);
        SessionRefs session =  api.createSession(create);

        //upload
        int chunkSize = 1024 * 1024;
        for (int sequence = 0; sequence * chunkSize < file.length; sequence++) {
            System.out.println("uploading");
            byte[] slice = Arrays.copyOfRange(file, sequence * chunkSize, (sequence + 1) * chunkSize);
            
            AudioChunk chunk = new AudioChunk();
            chunk.setData(Base64.getEncoder().encodeToString(slice));
            api.uploadChunk(session.getSessionId(), sequence, chunk);
        }

        //Get result
        String token = null;
        while (true){
            SessionStatus result = api.readStatus(session.getSessionId(), null, null, token);
            token = result.getInference().getPage().getNextToken();
            if (token == null) {
                break;
            }
            for (SenseEvent event : result.getInference().getResults()) {
                System.out.println(event.toString());
            }
        }
    }
}