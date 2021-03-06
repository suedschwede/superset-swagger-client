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
 * InlineResponse2002ResultValue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class InlineResponse2002ResultValue {
  @SerializedName("database_id")
  private Integer databaseId = null;

  @SerializedName("database_type")
  private String databaseType = null;

  public InlineResponse2002ResultValue databaseId(Integer databaseId) {
    this.databaseId = databaseId;
    return this;
  }

   /**
   * Get databaseId
   * @return databaseId
  **/
  @Schema(description = "")
  public Integer getDatabaseId() {
    return databaseId;
  }

  public void setDatabaseId(Integer databaseId) {
    this.databaseId = databaseId;
  }

  public InlineResponse2002ResultValue databaseType(String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

   /**
   * Get databaseType
   * @return databaseType
  **/
  @Schema(description = "")
  public String getDatabaseType() {
    return databaseType;
  }

  public void setDatabaseType(String databaseType) {
    this.databaseType = databaseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002ResultValue inlineResponse2002ResultValue = (InlineResponse2002ResultValue) o;
    return Objects.equals(this.databaseId, inlineResponse2002ResultValue.databaseId) &&
        Objects.equals(this.databaseType, inlineResponse2002ResultValue.databaseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseId, databaseType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002ResultValue {\n");
    
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
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
