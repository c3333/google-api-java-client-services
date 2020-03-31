/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * User specified security marks that are attached to the parent Security Command Center resource.
 * Security marks are scoped within a Security Command Center organization -- they can be modified
 * and viewed by all users who have proper permissions on the organization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityMarks extends com.google.api.client.json.GenericJson {

  /**
   * Mutable user specified security marks belonging to the parent resource. Constraints are as
   * follows:
   *
   *   * Keys and values are treated as case insensitive   * Keys must be between 1 - 256 characters
   * (inclusive)   * Keys must be letters, numbers, underscores, or dashes   * Values have leading
   * and trailing whitespace trimmed, remaining     characters must be between 1 - 4096 characters
   * (inclusive)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> marks;

  /**
   * The relative resource name of the SecurityMarks. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Mutable user specified security marks belonging to the parent resource. Constraints are as
   * follows:
   *
   *   * Keys and values are treated as case insensitive   * Keys must be between 1 - 256 characters
   * (inclusive)   * Keys must be letters, numbers, underscores, or dashes   * Values have leading
   * and trailing whitespace trimmed, remaining     characters must be between 1 - 4096 characters
   * (inclusive)
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMarks() {
    return marks;
  }

  /**
   * Mutable user specified security marks belonging to the parent resource. Constraints are as
   * follows:
   *
   *   * Keys and values are treated as case insensitive   * Keys must be between 1 - 256 characters
   * (inclusive)   * Keys must be letters, numbers, underscores, or dashes   * Values have leading
   * and trailing whitespace trimmed, remaining     characters must be between 1 - 4096 characters
   * (inclusive)
   * @param marks marks or {@code null} for none
   */
  public SecurityMarks setMarks(java.util.Map<String, java.lang.String> marks) {
    this.marks = marks;
    return this;
  }

  /**
   * The relative resource name of the SecurityMarks. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The relative resource name of the SecurityMarks. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
   * @param name name or {@code null} for none
   */
  public SecurityMarks setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public SecurityMarks set(String fieldName, Object value) {
    return (SecurityMarks) super.set(fieldName, value);
  }

  @Override
  public SecurityMarks clone() {
    return (SecurityMarks) super.clone();
  }

}
