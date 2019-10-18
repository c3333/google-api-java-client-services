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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Contains a summary of the DeidentifyDicomStore operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudHealthcareV1beta1DeidentifyDeidentifyDicomStoreSummary extends com.google.api.client.json.GenericJson {

  /**
   * Number of objects that processing failed for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long failureResourceCount;

  /**
   * Number of objects successfully processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long successResourceCount;

  /**
   * Number of objects that processing failed for.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFailureResourceCount() {
    return failureResourceCount;
  }

  /**
   * Number of objects that processing failed for.
   * @param failureResourceCount failureResourceCount or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1DeidentifyDeidentifyDicomStoreSummary setFailureResourceCount(java.lang.Long failureResourceCount) {
    this.failureResourceCount = failureResourceCount;
    return this;
  }

  /**
   * Number of objects successfully processed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSuccessResourceCount() {
    return successResourceCount;
  }

  /**
   * Number of objects successfully processed.
   * @param successResourceCount successResourceCount or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1DeidentifyDeidentifyDicomStoreSummary setSuccessResourceCount(java.lang.Long successResourceCount) {
    this.successResourceCount = successResourceCount;
    return this;
  }

  @Override
  public GoogleCloudHealthcareV1beta1DeidentifyDeidentifyDicomStoreSummary set(String fieldName, Object value) {
    return (GoogleCloudHealthcareV1beta1DeidentifyDeidentifyDicomStoreSummary) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudHealthcareV1beta1DeidentifyDeidentifyDicomStoreSummary clone() {
    return (GoogleCloudHealthcareV1beta1DeidentifyDeidentifyDicomStoreSummary) super.clone();
  }

}
