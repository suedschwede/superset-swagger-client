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
import at.mic.superset.swagger.client.model.GetInfoSchemaAddColumns;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * GetInfoSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class GetInfoSchema {
  @SerializedName("add_columns")
  private Map<String, GetInfoSchemaAddColumns> addColumns = null;

  @SerializedName("edit_columns")
  private Map<String, GetInfoSchemaAddColumns> editColumns = null;

  /**
   * Gets or Sets keys
   */
  @JsonAdapter(KeysEnum.Adapter.class)
  public enum KeysEnum {
    ADD_COLUMNS("add_columns"),
    EDIT_COLUMNS("edit_columns"),
    FILTERS("filters"),
    PERMISSIONS("permissions"),
    ADD_TITLE("add_title"),
    EDIT_TITLE("edit_title"),
    NONE("none");

    private String value;

    KeysEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KeysEnum fromValue(String text) {
      for (KeysEnum b : KeysEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KeysEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeysEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeysEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeysEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("keys")
  private List<KeysEnum> keys = null;

  public GetInfoSchema addColumns(Map<String, GetInfoSchemaAddColumns> addColumns) {
    this.addColumns = addColumns;
    return this;
  }

  public GetInfoSchema putAddColumnsItem(String key, GetInfoSchemaAddColumns addColumnsItem) {
    if (this.addColumns == null) {
      this.addColumns = new HashMap<String, GetInfoSchemaAddColumns>();
    }
    this.addColumns.put(key, addColumnsItem);
    return this;
  }

   /**
   * Get addColumns
   * @return addColumns
  **/
  @Schema(description = "")
  public Map<String, GetInfoSchemaAddColumns> getAddColumns() {
    return addColumns;
  }

  public void setAddColumns(Map<String, GetInfoSchemaAddColumns> addColumns) {
    this.addColumns = addColumns;
  }

  public GetInfoSchema editColumns(Map<String, GetInfoSchemaAddColumns> editColumns) {
    this.editColumns = editColumns;
    return this;
  }

  public GetInfoSchema putEditColumnsItem(String key, GetInfoSchemaAddColumns editColumnsItem) {
    if (this.editColumns == null) {
      this.editColumns = new HashMap<String, GetInfoSchemaAddColumns>();
    }
    this.editColumns.put(key, editColumnsItem);
    return this;
  }

   /**
   * Get editColumns
   * @return editColumns
  **/
  @Schema(description = "")
  public Map<String, GetInfoSchemaAddColumns> getEditColumns() {
    return editColumns;
  }

  public void setEditColumns(Map<String, GetInfoSchemaAddColumns> editColumns) {
    this.editColumns = editColumns;
  }

  public GetInfoSchema keys(List<KeysEnum> keys) {
    this.keys = keys;
    return this;
  }

  public GetInfoSchema addKeysItem(KeysEnum keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<KeysEnum>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @Schema(description = "")
  public List<KeysEnum> getKeys() {
    return keys;
  }

  public void setKeys(List<KeysEnum> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInfoSchema getInfoSchema = (GetInfoSchema) o;
    return Objects.equals(this.addColumns, getInfoSchema.addColumns) &&
        Objects.equals(this.editColumns, getInfoSchema.editColumns) &&
        Objects.equals(this.keys, getInfoSchema.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addColumns, editColumns, keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInfoSchema {\n");
    
    sb.append("    addColumns: ").append(toIndentedString(addColumns)).append("\n");
    sb.append("    editColumns: ").append(toIndentedString(editColumns)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
