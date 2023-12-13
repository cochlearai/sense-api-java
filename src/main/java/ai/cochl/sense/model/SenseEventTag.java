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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains data of the sound recognized by the model 
 */
@ApiModel(description = "Contains data of the sound recognized by the model ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SenseEventTag {
  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Double probability;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SenseEventTag() { 
  }

  public SenseEventTag probability(Double probability) {
    
    this.probability = probability;
    return this;
  }

   /**
   * Probability that the event occurred. 0. means not possible at all and 1. means that it is certain 
   * minimum: 0
   * maximum: 1
   * @return probability
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Probability that the event occurred. 0. means not possible at all and 1. means that it is certain ")

  public Double getProbability() {
    return probability;
  }


  public void setProbability(Double probability) {
    this.probability = probability;
  }


  public SenseEventTag name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the sound recognized during the inference. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Knock", required = true, value = "Name of the sound recognized during the inference. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenseEventTag senseEventTag = (SenseEventTag) o;
    return Objects.equals(this.probability, senseEventTag.probability) &&
        Objects.equals(this.name, senseEventTag.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probability, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenseEventTag {\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

