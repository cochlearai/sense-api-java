/*
 * Cochl.Sense API
 * Cochl.Sense API allows to detect what is contained inside sound data. Send audio data over the internet to discover what it contains.  ``` npx @openapitools/openapi-generator-cli generate -i openapi.json -g python -o python-client ``` 
 *
 * The version of the OpenAPI document: v1.4.0
 * Contact: support@cochl.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.cochl.sense.model;

import java.util.Objects;
import java.util.Arrays;
import ai.cochl.sense.model.SenseEventTag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains data returned by the model 
 */
@ApiModel(description = "Contains data returned by the model ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SenseEvent {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<SenseEventTag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Double startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Double endTime;

  public SenseEvent() { 
  }

  public SenseEvent tags(List<SenseEventTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public SenseEvent addTagsItem(SenseEventTag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Contains results of what has been inferenced at the same time 
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Contains results of what has been inferenced at the same time ")

  public List<SenseEventTag> getTags() {
    return tags;
  }


  public void setTags(List<SenseEventTag> tags) {
    this.tags = tags;
  }


  public SenseEvent startTime(Double startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Represent the start of the window, in the second, where inference was done. *Note that start_time will increase by window_hop on every step* 
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represent the start of the window, in the second, where inference was done. *Note that start_time will increase by window_hop on every step* ")

  public Double getStartTime() {
    return startTime;
  }


  public void setStartTime(Double startTime) {
    this.startTime = startTime;
  }


  public SenseEvent endTime(Double endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Represent the end of the window, in the second where inference was done. *Note that end_time is window_length after start_time* 
   * @return endTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represent the end of the window, in the second where inference was done. *Note that end_time is window_length after start_time* ")

  public Double getEndTime() {
    return endTime;
  }


  public void setEndTime(Double endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenseEvent senseEvent = (SenseEvent) o;
    return Objects.equals(this.tags, senseEvent.tags) &&
        Objects.equals(this.startTime, senseEvent.startTime) &&
        Objects.equals(this.endTime, senseEvent.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenseEvent {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

