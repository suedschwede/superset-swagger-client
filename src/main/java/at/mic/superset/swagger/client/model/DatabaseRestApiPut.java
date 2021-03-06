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
 * DatabaseRestApiPut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class DatabaseRestApiPut {
  @SerializedName("allow_csv_upload")
  private Boolean allowCsvUpload = null;

  @SerializedName("allow_ctas")
  private Boolean allowCtas = null;

  @SerializedName("allow_cvas")
  private Boolean allowCvas = null;

  @SerializedName("allow_dml")
  private Boolean allowDml = null;

  @SerializedName("allow_multi_schema_metadata_fetch")
  private Boolean allowMultiSchemaMetadataFetch = null;

  @SerializedName("allow_run_async")
  private Boolean allowRunAsync = null;

  @SerializedName("cache_timeout")
  private Integer cacheTimeout = null;

  @SerializedName("database_name")
  private String databaseName = null;

  @SerializedName("encrypted_extra")
  private String encryptedExtra = null;

  @SerializedName("expose_in_sqllab")
  private Boolean exposeInSqllab = null;

  @SerializedName("extra")
  private String extra = null;

  @SerializedName("force_ctas_schema")
  private String forceCtasSchema = null;

  @SerializedName("impersonate_user")
  private Boolean impersonateUser = null;

  @SerializedName("server_cert")
  private String serverCert = null;

  @SerializedName("sqlalchemy_uri")
  private String sqlalchemyUri = null;

  public DatabaseRestApiPut allowCsvUpload(Boolean allowCsvUpload) {
    this.allowCsvUpload = allowCsvUpload;
    return this;
  }

   /**
   * Get allowCsvUpload
   * @return allowCsvUpload
  **/
  @Schema(description = "")
  public Boolean isAllowCsvUpload() {
    return allowCsvUpload;
  }

  public void setAllowCsvUpload(Boolean allowCsvUpload) {
    this.allowCsvUpload = allowCsvUpload;
  }

  public DatabaseRestApiPut allowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
    return this;
  }

   /**
   * Get allowCtas
   * @return allowCtas
  **/
  @Schema(description = "")
  public Boolean isAllowCtas() {
    return allowCtas;
  }

  public void setAllowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
  }

  public DatabaseRestApiPut allowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
    return this;
  }

   /**
   * Get allowCvas
   * @return allowCvas
  **/
  @Schema(description = "")
  public Boolean isAllowCvas() {
    return allowCvas;
  }

  public void setAllowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
  }

  public DatabaseRestApiPut allowDml(Boolean allowDml) {
    this.allowDml = allowDml;
    return this;
  }

   /**
   * Get allowDml
   * @return allowDml
  **/
  @Schema(description = "")
  public Boolean isAllowDml() {
    return allowDml;
  }

  public void setAllowDml(Boolean allowDml) {
    this.allowDml = allowDml;
  }

  public DatabaseRestApiPut allowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
    return this;
  }

   /**
   * Get allowMultiSchemaMetadataFetch
   * @return allowMultiSchemaMetadataFetch
  **/
  @Schema(description = "")
  public Boolean isAllowMultiSchemaMetadataFetch() {
    return allowMultiSchemaMetadataFetch;
  }

  public void setAllowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
  }

  public DatabaseRestApiPut allowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
    return this;
  }

   /**
   * Get allowRunAsync
   * @return allowRunAsync
  **/
  @Schema(description = "")
  public Boolean isAllowRunAsync() {
    return allowRunAsync;
  }

  public void setAllowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
  }

  public DatabaseRestApiPut cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Get cacheTimeout
   * @return cacheTimeout
  **/
  @Schema(description = "")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public DatabaseRestApiPut databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @Schema(required = true, description = "")
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  public DatabaseRestApiPut encryptedExtra(String encryptedExtra) {
    this.encryptedExtra = encryptedExtra;
    return this;
  }

   /**
   * Get encryptedExtra
   * @return encryptedExtra
  **/
  @Schema(description = "")
  public String getEncryptedExtra() {
    return encryptedExtra;
  }

  public void setEncryptedExtra(String encryptedExtra) {
    this.encryptedExtra = encryptedExtra;
  }

  public DatabaseRestApiPut exposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
    return this;
  }

   /**
   * Get exposeInSqllab
   * @return exposeInSqllab
  **/
  @Schema(description = "")
  public Boolean isExposeInSqllab() {
    return exposeInSqllab;
  }

  public void setExposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
  }

  public DatabaseRestApiPut extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public DatabaseRestApiPut forceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
    return this;
  }

   /**
   * Get forceCtasSchema
   * @return forceCtasSchema
  **/
  @Schema(description = "")
  public String getForceCtasSchema() {
    return forceCtasSchema;
  }

  public void setForceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
  }

  public DatabaseRestApiPut impersonateUser(Boolean impersonateUser) {
    this.impersonateUser = impersonateUser;
    return this;
  }

   /**
   * Get impersonateUser
   * @return impersonateUser
  **/
  @Schema(description = "")
  public Boolean isImpersonateUser() {
    return impersonateUser;
  }

  public void setImpersonateUser(Boolean impersonateUser) {
    this.impersonateUser = impersonateUser;
  }

  public DatabaseRestApiPut serverCert(String serverCert) {
    this.serverCert = serverCert;
    return this;
  }

   /**
   * Get serverCert
   * @return serverCert
  **/
  @Schema(description = "")
  public String getServerCert() {
    return serverCert;
  }

  public void setServerCert(String serverCert) {
    this.serverCert = serverCert;
  }

  public DatabaseRestApiPut sqlalchemyUri(String sqlalchemyUri) {
    this.sqlalchemyUri = sqlalchemyUri;
    return this;
  }

   /**
   * Get sqlalchemyUri
   * @return sqlalchemyUri
  **/
  @Schema(required = true, description = "")
  public String getSqlalchemyUri() {
    return sqlalchemyUri;
  }

  public void setSqlalchemyUri(String sqlalchemyUri) {
    this.sqlalchemyUri = sqlalchemyUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseRestApiPut databaseRestApiPut = (DatabaseRestApiPut) o;
    return Objects.equals(this.allowCsvUpload, databaseRestApiPut.allowCsvUpload) &&
        Objects.equals(this.allowCtas, databaseRestApiPut.allowCtas) &&
        Objects.equals(this.allowCvas, databaseRestApiPut.allowCvas) &&
        Objects.equals(this.allowDml, databaseRestApiPut.allowDml) &&
        Objects.equals(this.allowMultiSchemaMetadataFetch, databaseRestApiPut.allowMultiSchemaMetadataFetch) &&
        Objects.equals(this.allowRunAsync, databaseRestApiPut.allowRunAsync) &&
        Objects.equals(this.cacheTimeout, databaseRestApiPut.cacheTimeout) &&
        Objects.equals(this.databaseName, databaseRestApiPut.databaseName) &&
        Objects.equals(this.encryptedExtra, databaseRestApiPut.encryptedExtra) &&
        Objects.equals(this.exposeInSqllab, databaseRestApiPut.exposeInSqllab) &&
        Objects.equals(this.extra, databaseRestApiPut.extra) &&
        Objects.equals(this.forceCtasSchema, databaseRestApiPut.forceCtasSchema) &&
        Objects.equals(this.impersonateUser, databaseRestApiPut.impersonateUser) &&
        Objects.equals(this.serverCert, databaseRestApiPut.serverCert) &&
        Objects.equals(this.sqlalchemyUri, databaseRestApiPut.sqlalchemyUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCsvUpload, allowCtas, allowCvas, allowDml, allowMultiSchemaMetadataFetch, allowRunAsync, cacheTimeout, databaseName, encryptedExtra, exposeInSqllab, extra, forceCtasSchema, impersonateUser, serverCert, sqlalchemyUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseRestApiPut {\n");
    
    sb.append("    allowCsvUpload: ").append(toIndentedString(allowCsvUpload)).append("\n");
    sb.append("    allowCtas: ").append(toIndentedString(allowCtas)).append("\n");
    sb.append("    allowCvas: ").append(toIndentedString(allowCvas)).append("\n");
    sb.append("    allowDml: ").append(toIndentedString(allowDml)).append("\n");
    sb.append("    allowMultiSchemaMetadataFetch: ").append(toIndentedString(allowMultiSchemaMetadataFetch)).append("\n");
    sb.append("    allowRunAsync: ").append(toIndentedString(allowRunAsync)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    encryptedExtra: ").append(toIndentedString(encryptedExtra)).append("\n");
    sb.append("    exposeInSqllab: ").append(toIndentedString(exposeInSqllab)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    forceCtasSchema: ").append(toIndentedString(forceCtasSchema)).append("\n");
    sb.append("    impersonateUser: ").append(toIndentedString(impersonateUser)).append("\n");
    sb.append("    serverCert: ").append(toIndentedString(serverCert)).append("\n");
    sb.append("    sqlalchemyUri: ").append(toIndentedString(sqlalchemyUri)).append("\n");
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
