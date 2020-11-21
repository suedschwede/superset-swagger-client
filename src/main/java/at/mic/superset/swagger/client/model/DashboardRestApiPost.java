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
 * DashboardRestApiPost
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class DashboardRestApiPost {
  @SerializedName("css")
  private String css = null;

  @SerializedName("dashboard_title")
  private String dashboardTitle = null;

  @SerializedName("json_metadata")
  private String jsonMetadata = null;

  @SerializedName("owners")
  private List<Integer> owners = null;

  @SerializedName("position_json")
  private String positionJson = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("slug")
  private String slug = null;

  public DashboardRestApiPost css(String css) {
    this.css = css;
    return this;
  }

   /**
   * Get css
   * @return css
  **/
  @Schema(description = "")
  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }

  public DashboardRestApiPost dashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
    return this;
  }

   /**
   * A title for the dashboard.
   * @return dashboardTitle
  **/
  @Schema(description = "A title for the dashboard.")
  public String getDashboardTitle() {
    return dashboardTitle;
  }

  public void setDashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
  }

  public DashboardRestApiPost jsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
    return this;
  }

   /**
   * This JSON object is generated dynamically when clicking the save or overwrite button in the dashboard view. It is exposed here for reference and for power users who may want to alter  specific parameters.
   * @return jsonMetadata
  **/
  @Schema(description = "This JSON object is generated dynamically when clicking the save or overwrite button in the dashboard view. It is exposed here for reference and for power users who may want to alter  specific parameters.")
  public String getJsonMetadata() {
    return jsonMetadata;
  }

  public void setJsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
  }

  public DashboardRestApiPost owners(List<Integer> owners) {
    this.owners = owners;
    return this;
  }

  public DashboardRestApiPost addOwnersItem(Integer ownersItem) {
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

  public DashboardRestApiPost positionJson(String positionJson) {
    this.positionJson = positionJson;
    return this;
  }

   /**
   * This json object describes the positioning of the widgets in the dashboard. It is dynamically generated when adjusting the widgets size and positions by using drag &amp; drop in the dashboard view
   * @return positionJson
  **/
  @Schema(description = "This json object describes the positioning of the widgets in the dashboard. It is dynamically generated when adjusting the widgets size and positions by using drag & drop in the dashboard view")
  public String getPositionJson() {
    return positionJson;
  }

  public void setPositionJson(String positionJson) {
    this.positionJson = positionJson;
  }

  public DashboardRestApiPost published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Determines whether or not this dashboard is visible in the list of all dashboards.
   * @return published
  **/
  @Schema(description = "Determines whether or not this dashboard is visible in the list of all dashboards.")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public DashboardRestApiPost slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Unique identifying part for the web address of the dashboard.
   * @return slug
  **/
  @Schema(description = "Unique identifying part for the web address of the dashboard.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardRestApiPost dashboardRestApiPost = (DashboardRestApiPost) o;
    return Objects.equals(this.css, dashboardRestApiPost.css) &&
        Objects.equals(this.dashboardTitle, dashboardRestApiPost.dashboardTitle) &&
        Objects.equals(this.jsonMetadata, dashboardRestApiPost.jsonMetadata) &&
        Objects.equals(this.owners, dashboardRestApiPost.owners) &&
        Objects.equals(this.positionJson, dashboardRestApiPost.positionJson) &&
        Objects.equals(this.published, dashboardRestApiPost.published) &&
        Objects.equals(this.slug, dashboardRestApiPost.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(css, dashboardTitle, jsonMetadata, owners, positionJson, published, slug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardRestApiPost {\n");
    
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    dashboardTitle: ").append(toIndentedString(dashboardTitle)).append("\n");
    sb.append("    jsonMetadata: ").append(toIndentedString(jsonMetadata)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    positionJson: ").append(toIndentedString(positionJson)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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