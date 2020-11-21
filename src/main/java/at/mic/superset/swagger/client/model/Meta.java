/*
 * Superset
 * Superset
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package at.mic.superset.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Meta
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class Meta {
  @SerializedName("default_endpoint")
  private String defaultEndpoint = null;

  @SerializedName("table_name")
  private String tableName = null;

  public Meta defaultEndpoint(String defaultEndpoint) {
    this.defaultEndpoint = defaultEndpoint;
    return this;
  }

   /**
   * Get defaultEndpoint
   * @return defaultEndpoint
  **/
  @Schema(description = "")
  public String getDefaultEndpoint() {
    return defaultEndpoint;
  }

  public void setDefaultEndpoint(String defaultEndpoint) {
    this.defaultEndpoint = defaultEndpoint;
  }

  public Meta tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @Schema(required = true, description = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.defaultEndpoint, meta.defaultEndpoint) &&
        Objects.equals(this.tableName, meta.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultEndpoint, tableName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    defaultEndpoint: ").append(toIndentedString(defaultEndpoint)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}