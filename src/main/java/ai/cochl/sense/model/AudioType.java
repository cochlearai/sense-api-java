/*
 * Cochl. Sense API
 * Cochl. Sense API allows to detect what is contained inside sound. Send audio data over the internet and discover what it contains  That page contains the openapi specification of Cochl. Sense API. Feel free to *download* and use the specification as you wish. For instance,  you could generate any client to interact with our backend by using  [openapi generator](https://openapi-generator.tech/). With `npx` and `java`  installed locally, python client could be generated by running    ``` npx @openapitools/openapi-generator-cli generate -i openapi.json -g python -o python-client ``` 
 *
 * The version of the OpenAPI document: v0.0.1
 * Contact: support@cochl.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.cochl.sense.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * wether the audio that will be sent is a stream or a file 
 */
@JsonAdapter(AudioType.Adapter.class)
public enum AudioType {
  
  STREAM("stream"),
  
  FILE("file");

  private String value;

  AudioType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudioType fromValue(String value) {
    for (AudioType b : AudioType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudioType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudioType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudioType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudioType.fromValue(value);
    }
  }
}

