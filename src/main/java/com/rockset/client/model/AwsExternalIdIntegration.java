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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AwsExternalIdIntegration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T17:43:18.300Z")
public class AwsExternalIdIntegration {
  @SerializedName("aws_role_arn")
  private String awsRoleArn = null;

  @SerializedName("aws_external_id")
  private String awsExternalId = null;

  @SerializedName("rockset_iam_user")
  private String rocksetIamUser = null;

  public AwsExternalIdIntegration awsRoleArn(String awsRoleArn) {
    this.awsRoleArn = awsRoleArn;
    return this;
  }

   /**
   * ARN of rockset-role created in your account
   * @return awsRoleArn
  **/
  @ApiModelProperty(example = "arn:aws:iam::2378964092:role/rockset-role", required = true, value = "ARN of rockset-role created in your account")
  public String getAwsRoleArn() {
    return awsRoleArn;
  }

  public void setAwsRoleArn(String awsRoleArn) {
    this.awsRoleArn = awsRoleArn;
  }

   /**
   * Get awsExternalId
   * @return awsExternalId
  **/
  @ApiModelProperty(example = "adf98a7sdffkjh233rjh9a8sdf", value = "")
  public String getAwsExternalId() {
    return awsExternalId;
  }

   /**
   * Get rocksetIamUser
   * @return rocksetIamUser
  **/
  @ApiModelProperty(example = "arn:aws:iam::983247598:root", value = "")
  public String getRocksetIamUser() {
    return rocksetIamUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsExternalIdIntegration awsExternalIdIntegration = (AwsExternalIdIntegration) o;
    return Objects.equals(this.awsRoleArn, awsExternalIdIntegration.awsRoleArn) &&
        Objects.equals(this.awsExternalId, awsExternalIdIntegration.awsExternalId) &&
        Objects.equals(this.rocksetIamUser, awsExternalIdIntegration.rocksetIamUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsRoleArn, awsExternalId, rocksetIamUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsExternalIdIntegration {\n");
    
    sb.append("    awsRoleArn: ").append(toIndentedString(awsRoleArn)).append("\n");
    sb.append("    awsExternalId: ").append(toIndentedString(awsExternalId)).append("\n");
    sb.append("    rocksetIamUser: ").append(toIndentedString(rocksetIamUser)).append("\n");
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

