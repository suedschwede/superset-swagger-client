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
import at.mic.superset.swagger.client.model.InlineResponse200DescriptionColumns;
import at.mic.superset.swagger.client.model.InlineResponse200LabelColumns;
import at.mic.superset.swagger.client.model.LogRestApiGet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20017
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class InlineResponse20017 {
  @SerializedName("description_columns")
  private InlineResponse200DescriptionColumns descriptionColumns = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("label_columns")
  private InlineResponse200LabelColumns labelColumns = null;

  @SerializedName("result")
  private LogRestApiGet result = null;

  @SerializedName("show_columns")
  private List<String> showColumns = null;

  @SerializedName("show_title")
  private String showTitle = null;

  public InlineResponse20017 descriptionColumns(InlineResponse200DescriptionColumns descriptionColumns) {
    this.descriptionColumns = descriptionColumns;
    return this;
  }

   /**
   * Get descriptionColumns
   * @return descriptionColumns
  **/
  @Schema(description = "")
  public InlineResponse200DescriptionColumns getDescriptionColumns() {
    return descriptionColumns;
  }

  public void setDescriptionColumns(InlineResponse200DescriptionColumns descriptionColumns) {
    this.descriptionColumns = descriptionColumns;
  }

  public InlineResponse20017 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The item id
   * @return id
  **/
  @Schema(description = "The item id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse20017 labelColumns(InlineResponse200LabelColumns labelColumns) {
    this.labelColumns = labelColumns;
    return this;
  }

   /**
   * Get labelColumns
   * @return labelColumns
  **/
  @Schema(description = "")
  public InlineResponse200LabelColumns getLabelColumns() {
    return labelColumns;
  }

  public void setLabelColumns(InlineResponse200LabelColumns labelColumns) {
    this.labelColumns = labelColumns;
  }

  public InlineResponse20017 result(LogRestApiGet result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public LogRestApiGet getResult() {
    return result;
  }

  public void setResult(LogRestApiGet result) {
    this.result = result;
  }

  public InlineResponse20017 showColumns(List<String> showColumns) {
    this.showColumns = showColumns;
    return this;
  }

  public InlineResponse20017 addShowColumnsItem(String showColumnsItem) {
    if (this.showColumns == null) {
      this.showColumns = new ArrayList<String>();
    }
    this.showColumns.add(showColumnsItem);
    return this;
  }

   /**
   * A list of columns
   * @return showColumns
  **/
  @Schema(description = "A list of columns")
  public List<String> getShowColumns() {
    return showColumns;
  }

  public void setShowColumns(List<String> showColumns) {
    this.showColumns = showColumns;
  }

  public InlineResponse20017 showTitle(String showTitle) {
    this.showTitle = showTitle;
    return this;
  }

   /**
   * A title to render. Will be translated by babel
   * @return showTitle
  **/
  @Schema(example = "Show Item Details", description = "A title to render. Will be translated by babel")
  public String getShowTitle() {
    return showTitle;
  }

  public void setShowTitle(String showTitle) {
    this.showTitle = showTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return Objects.equals(this.descriptionColumns, inlineResponse20017.descriptionColumns) &&
        Objects.equals(this.id, inlineResponse20017.id) &&
        Objects.equals(this.labelColumns, inlineResponse20017.labelColumns) &&
        Objects.equals(this.result, inlineResponse20017.result) &&
        Objects.equals(this.showColumns, inlineResponse20017.showColumns) &&
        Objects.equals(this.showTitle, inlineResponse20017.showTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionColumns, id, labelColumns, result, showColumns, showTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    descriptionColumns: ").append(toIndentedString(descriptionColumns)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labelColumns: ").append(toIndentedString(labelColumns)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    showColumns: ").append(toIndentedString(showColumns)).append("\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
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
