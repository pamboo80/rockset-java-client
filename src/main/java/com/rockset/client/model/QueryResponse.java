/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockset.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.rockset.client.model.QueryFieldType;
import com.rockset.client.model.QueryResponseStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-04T00:00:49.700Z")
public class QueryResponse {
  @SerializedName("results")
  private List<Object> results = null;

  @SerializedName("fields")
  private List<QueryFieldType> fields = null;

  @SerializedName("stats")
  private QueryResponseStats stats = null;

  @SerializedName("warnings")
  private List<String> warnings = null;

  @SerializedName("collections")
  private List<String> collections = null;

  @SerializedName("column_fields")
  private List<QueryFieldType> columnFields = null;

  public QueryResponse results(List<Object> results) {
    this.results = results;
    return this;
  }

  public QueryResponse addResultsItem(Object resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Object>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * list of objects returned by the query
   * @return results
  **/

@JsonProperty("results")
@ApiModelProperty(value = "list of objects returned by the query")
  public List<Object> getResults() {
    return results;
  }

  public void setResults(List<Object> results) {
    this.results = results;
  }

  public QueryResponse fields(List<QueryFieldType> fields) {
    this.fields = fields;
    return this;
  }

  public QueryResponse addFieldsItem(QueryFieldType fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<QueryFieldType>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * list of fields returned by the query
   * @return fields
  **/

@JsonProperty("fields")
@ApiModelProperty(value = "list of fields returned by the query")
  public List<QueryFieldType> getFields() {
    return fields;
  }

  public void setFields(List<QueryFieldType> fields) {
    this.fields = fields;
  }

  public QueryResponse stats(QueryResponseStats stats) {
    this.stats = stats;
    return this;
  }

   /**
   * meta information about the query
   * @return stats
  **/

@JsonProperty("stats")
@ApiModelProperty(value = "meta information about the query")
  public QueryResponseStats getStats() {
    return stats;
  }

  public void setStats(QueryResponseStats stats) {
    this.stats = stats;
  }

  public QueryResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public QueryResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<String>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * warnings received from the query
   * @return warnings
  **/

@JsonProperty("warnings")
@ApiModelProperty(value = "warnings received from the query")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  public QueryResponse collections(List<String> collections) {
    this.collections = collections;
    return this;
  }

  public QueryResponse addCollectionsItem(String collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<String>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * list of collections queried by the query
   * @return collections
  **/

@JsonProperty("collections")
@ApiModelProperty(value = "list of collections queried by the query")
  public List<String> getCollections() {
    return collections;
  }

  public void setCollections(List<String> collections) {
    this.collections = collections;
  }

   /**
   * meta information about each column in the result set
   * @return columnFields
  **/

@JsonProperty("column_fields")
@ApiModelProperty(value = "meta information about each column in the result set")
  public List<QueryFieldType> getColumnFields() {
    return columnFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponse queryResponse = (QueryResponse) o;
    return Objects.equals(this.results, queryResponse.results) &&
        Objects.equals(this.fields, queryResponse.fields) &&
        Objects.equals(this.stats, queryResponse.stats) &&
        Objects.equals(this.warnings, queryResponse.warnings) &&
        Objects.equals(this.collections, queryResponse.collections) &&
        Objects.equals(this.columnFields, queryResponse.columnFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, fields, stats, warnings, collections, columnFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    columnFields: ").append(toIndentedString(columnFields)).append("\n");
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

