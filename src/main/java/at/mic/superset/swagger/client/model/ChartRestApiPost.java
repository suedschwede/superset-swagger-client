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
import java.util.ArrayList;
import java.util.List;
/**
 * ChartRestApiPost
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class ChartRestApiPost {
  @SerializedName("cache_timeout")
  private Integer cacheTimeout = null;

  @SerializedName("dashboards")
  private List<Integer> dashboards = null;

  @SerializedName("datasource_id")
  private Integer datasourceId = null;

  @SerializedName("datasource_name")
  private String datasourceName = null;

  /**
   * The type of dataset/datasource identified on &#x60;datasource_id&#x60;.
   */
  @JsonAdapter(DatasourceTypeEnum.Adapter.class)
  public enum DatasourceTypeEnum {
    DRUID("druid"),
    TABLE("table"),
    VIEW("view");

    private String value;

    DatasourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DatasourceTypeEnum fromValue(String text) {
      for (DatasourceTypeEnum b : DatasourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DatasourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DatasourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DatasourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DatasourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("datasource_type")
  private DatasourceTypeEnum datasourceType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("owners")
  private List<Integer> owners = null;

  @SerializedName("params")
  private String params = null;

  @SerializedName("slice_name")
  private String sliceName = null;

  @SerializedName("viz_type")
  private String vizType = null;

  public ChartRestApiPost cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Duration (in seconds) of the caching timeout for this chart. Note this defaults to the datasource/table timeout if undefined.
   * @return cacheTimeout
  **/
  @Schema(description = "Duration (in seconds) of the caching timeout for this chart. Note this defaults to the datasource/table timeout if undefined.")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public ChartRestApiPost dashboards(List<Integer> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public ChartRestApiPost addDashboardsItem(Integer dashboardsItem) {
    if (this.dashboards == null) {
      this.dashboards = new ArrayList<Integer>();
    }
    this.dashboards.add(dashboardsItem);
    return this;
  }

   /**
   * Get dashboards
   * @return dashboards
  **/
  @Schema(description = "")
  public List<Integer> getDashboards() {
    return dashboards;
  }

  public void setDashboards(List<Integer> dashboards) {
    this.dashboards = dashboards;
  }

  public ChartRestApiPost datasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * The id of the dataset/datasource this new chart will use. A complete datasource identification needs &#x60;datasouce_id&#x60; and &#x60;datasource_type&#x60;.
   * @return datasourceId
  **/
  @Schema(required = true, description = "The id of the dataset/datasource this new chart will use. A complete datasource identification needs `datasouce_id` and `datasource_type`.")
  public Integer getDatasourceId() {
    return datasourceId;
  }

  public void setDatasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
  }

  public ChartRestApiPost datasourceName(String datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

   /**
   * The datasource name.
   * @return datasourceName
  **/
  @Schema(description = "The datasource name.")
  public String getDatasourceName() {
    return datasourceName;
  }

  public void setDatasourceName(String datasourceName) {
    this.datasourceName = datasourceName;
  }

  public ChartRestApiPost datasourceType(DatasourceTypeEnum datasourceType) {
    this.datasourceType = datasourceType;
    return this;
  }

   /**
   * The type of dataset/datasource identified on &#x60;datasource_id&#x60;.
   * @return datasourceType
  **/
  @Schema(required = true, description = "The type of dataset/datasource identified on `datasource_id`.")
  public DatasourceTypeEnum getDatasourceType() {
    return datasourceType;
  }

  public void setDatasourceType(DatasourceTypeEnum datasourceType) {
    this.datasourceType = datasourceType;
  }

  public ChartRestApiPost description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the chart propose.
   * @return description
  **/
  @Schema(description = "A description of the chart propose.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChartRestApiPost owners(List<Integer> owners) {
    this.owners = owners;
    return this;
  }

  public ChartRestApiPost addOwnersItem(Integer ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<Integer>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @Schema(description = "")
  public List<Integer> getOwners() {
    return owners;
  }

  public void setOwners(List<Integer> owners) {
    this.owners = owners;
  }

  public ChartRestApiPost params(String params) {
    this.params = params;
    return this;
  }

   /**
   * Parameters are generated dynamically when clicking the save or overwrite button in the explore view. This JSON object for power users who may want to alter specific parameters.
   * @return params
  **/
  @Schema(description = "Parameters are generated dynamically when clicking the save or overwrite button in the explore view. This JSON object for power users who may want to alter specific parameters.")
  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }

  public ChartRestApiPost sliceName(String sliceName) {
    this.sliceName = sliceName;
    return this;
  }

   /**
   * The name of the chart.
   * @return sliceName
  **/
  @Schema(required = true, description = "The name of the chart.")
  public String getSliceName() {
    return sliceName;
  }

  public void setSliceName(String sliceName) {
    this.sliceName = sliceName;
  }

  public ChartRestApiPost vizType(String vizType) {
    this.vizType = vizType;
    return this;
  }

   /**
   * The type of chart visualization used.
   * @return vizType
  **/
  @Schema(example = "[\"bar\",\"line_multi\",\"area\",\"table\"]", description = "The type of chart visualization used.")
  public String getVizType() {
    return vizType;
  }

  public void setVizType(String vizType) {
    this.vizType = vizType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartRestApiPost chartRestApiPost = (ChartRestApiPost) o;
    return Objects.equals(this.cacheTimeout, chartRestApiPost.cacheTimeout) &&
        Objects.equals(this.dashboards, chartRestApiPost.dashboards) &&
        Objects.equals(this.datasourceId, chartRestApiPost.datasourceId) &&
        Objects.equals(this.datasourceName, chartRestApiPost.datasourceName) &&
        Objects.equals(this.datasourceType, chartRestApiPost.datasourceType) &&
        Objects.equals(this.description, chartRestApiPost.description) &&
        Objects.equals(this.owners, chartRestApiPost.owners) &&
        Objects.equals(this.params, chartRestApiPost.params) &&
        Objects.equals(this.sliceName, chartRestApiPost.sliceName) &&
        Objects.equals(this.vizType, chartRestApiPost.vizType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheTimeout, dashboards, datasourceId, datasourceName, datasourceType, description, owners, params, sliceName, vizType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartRestApiPost {\n");
    
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
    sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
    sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    sliceName: ").append(toIndentedString(sliceName)).append("\n");
    sb.append("    vizType: ").append(toIndentedString(vizType)).append("\n");
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
