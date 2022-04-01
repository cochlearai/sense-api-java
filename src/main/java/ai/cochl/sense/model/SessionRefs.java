/*
 * Cochl.Sense API
 * Cochl.Sense API allows to detect what is contained inside sound data. Send audio data over the internet to discover what it contains.  ``` npx @openapitools/openapi-generator-cli generate -i openapi.json -g python -o python-client ``` 
 *
 * The version of the OpenAPI document: v1.0.0
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
 * List of session links 
 */
@ApiModel(description = "List of session links ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SessionRefs {
  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_CHUNK_SEQUENCE = "chunk_sequence";
  @SerializedName(SERIALIZED_NAME_CHUNK_SEQUENCE)
  private Integer chunkSequence;

  public SessionRefs() { 
  }

  public SessionRefs sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Session id of the session that can be used to interact with API 
   * @return sessionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5vlv0r6SBUPYaUju1PFFalGhGVcyg", required = true, value = "Session id of the session that can be used to interact with API ")

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
   * Chunk is uploaded in sequence. This represents the sequence of the next chunk to upload 
   * @return chunkSequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Chunk is uploaded in sequence. This represents the sequence of the next chunk to upload ")

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

