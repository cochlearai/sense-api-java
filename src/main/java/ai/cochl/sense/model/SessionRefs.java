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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * list of session links 
 */
@ApiModel(description = "list of session links ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T09:34:55.860779Z[Etc/UTC]")
public class SessionRefs {
  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_CHUNK_SEQUENCE = "chunk_sequence";
  @SerializedName(SERIALIZED_NAME_CHUNK_SEQUENCE)
  private Integer chunkSequence;


  public SessionRefs sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * session id of the session that can be used to interact with API 
   * @return sessionId
  **/
  @ApiModelProperty(example = "5vlv0r6SBUPYaUju1PFFalGhGVcyg", required = true, value = "session id of the session that can be used to interact with API ")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public SessionRefs chunkSequence(Integer chunkSequence) {
    
    this.chunkSequence = chunkSequence;
    return this;
  }

   /**
   * chunk are uploaded in sequence. This represent the sequence of the next chunk to upload 
   * @return chunkSequence
  **/
  @ApiModelProperty(example = "0", required = true, value = "chunk are uploaded in sequence. This represent the sequence of the next chunk to upload ")

  public Integer getChunkSequence() {
    return chunkSequence;
  }


  public void setChunkSequence(Integer chunkSequence) {
    this.chunkSequence = chunkSequence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionRefs sessionRefs = (SessionRefs) o;
    return Objects.equals(this.sessionId, sessionRefs.sessionId) &&
        Objects.equals(this.chunkSequence, sessionRefs.chunkSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, chunkSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionRefs {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    chunkSequence: ").append(toIndentedString(chunkSequence)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

