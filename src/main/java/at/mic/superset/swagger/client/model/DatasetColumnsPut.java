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
 * DatasetColumnsPut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class DatasetColumnsPut {
  @SerializedName("column_name")
  private String columnName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("filterable")
  private Boolean filterable = null;

  @SerializedName("groupby")
  private Boolean groupby = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_dttm")
  private Boolean isDttm = null;

  @SerializedName("python_date_format")
  private String pythonDateFormat = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("verbose_name")
  private String verboseName = null;

  public DatasetColumnsPut columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @Schema(required = true, description = "")
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public DatasetColumnsPut description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DatasetColumnsPut expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @Schema(description = "")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public DatasetColumnsPut filterable(Boolean filterable) {
    this.filterable = filterable;
    return this;
  }

   /**
   * Get filterable
   * @return filterable
  **/
  @Schema(description = "")
  public Boolean isFilterable() {
    return filterable;
  }

  public void setFilterable(Boolean filterable) {
    this.filterable = filterable;
  }

  public DatasetColumnsPut groupby(Boolean groupby) {
    this.groupby = groupby;
    return this;
  }

   /**
   * Get groupby
   * @return groupby
  **/
  @Schema(description = "")
  public Boolean isGroupby() {
    return groupby;
  }

  public void setGroupby(Boolean groupby) {
    this.groupby = groupby;
  }

  public DatasetColumnsPut id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DatasetColumnsPut isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @Schema(description = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public DatasetColumnsPut isDttm(Boolean isDttm) {
    this.isDttm = isDttm;
    return this;
  }

   /**
   * Get isDttm
   * @return isDttm
  **/
  @Schema(description = "")
  public Boolean isIsDttm() {
    return isDttm;
  }

  public void setIsDttm(Boolean isDttm) {
    this.isDttm = isDttm;
  }

  public DatasetColumnsPut pythonDateFormat(String pythonDateFormat) {
    this.pythonDateFormat = pythonDateFormat;
    return this;
  }

   /**
   * Get pythonDateFormat
   * @return pythonDateFormat
  **/
  @Schema(description = "")
  public String getPythonDateFormat() {
    return pythonDateFormat;
  }

  public void setPythonDateFormat(String pythonDateFormat) {
    this.pythonDateFormat = pythonDateFormat;
  }

  public DatasetColumnsPut type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DatasetColumnsPut verboseName(String verboseName) {
    this.verboseName = verboseName;
    return this;
  }

   /**
   * Get verboseName
   * @return verboseName
  **/
  @Schema(description = "")
  public String getVerboseName() {
    return verboseName;
  }

  public void setVerboseName(String verboseName) {
    this.verboseName = verboseName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetColumnsPut datasetColumnsPut = (DatasetColumnsPut) o;
    return Objects.equals(this.columnName, datasetColumnsPut.columnName) &&
        Objects.equals(this.description, datasetColumnsPut.description) &&
        Objects.equals(this.expression, datasetColumnsPut.expression) &&
        Objects.equals(this.filterable, datasetColumnsPut.filterable) &&
        Objects.equals(this.groupby, datasetColumnsPut.groupby) &&
        Objects.equals(this.id, datasetColumnsPut.id) &&
        Objects.equals(this.isActive, datasetColumnsPut.isActive) &&
        Objects.equals(this.isDttm, datasetColumnsPut.isDttm) &&
        Objects.equals(this.pythonDateFormat, datasetColumnsPut.pythonDateFormat) &&
        Objects.equals(this.type, datasetColumnsPut.type) &&
        Objects.equals(this.verboseName, datasetColumnsPut.verboseName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, description, expression, filterable, groupby, id, isActive, isDttm, pythonDateFormat, type, verboseName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetColumnsPut {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filterable: ").append(toIndentedString(filterable)).append("\n");
    sb.append("    groupby: ").append(toIndentedString(groupby)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDttm: ").append(toIndentedString(isDttm)).append("\n");
    sb.append("    pythonDateFormat: ").append(toIndentedString(pythonDateFormat)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verboseName: ").append(toIndentedString(verboseName)).append("\n");
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
