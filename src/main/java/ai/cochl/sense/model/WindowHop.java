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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * If set, it allows to adjust the sensitivity of a given tag [in this list]  The window hop adjustment can be set eith to 0.5s or 1s  By default, this value is set to 0.5s 
 */
@JsonAdapter(WindowHop.Adapter.class)
public enum WindowHop {
  
  _0_5S("0.5s"),
  
  _1S("1s");

  private String value;

  WindowHop(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WindowHop fromValue(String value) {
    for (WindowHop b : WindowHop.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WindowHop> {
    @Override
    public void write(final JsonWriter jsonWriter, final WindowHop enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WindowHop read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WindowHop.fromValue(value);
    }
  }
}

