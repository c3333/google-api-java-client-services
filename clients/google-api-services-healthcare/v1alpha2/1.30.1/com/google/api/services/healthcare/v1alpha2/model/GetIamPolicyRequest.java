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

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * Request message for `GetIamPolicy` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetIamPolicyRequest extends com.google.api.client.json.GenericJson {

  /**
   * OPTIONAL: A GetPolicyOptions object for specifying options to GetIamPolicy This field is only
   * used by Cloud IAM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GetPolicyOptions options;

  /**
   * OPTIONAL: A GetPolicyOptions object for specifying options to GetIamPolicy This field is only
   * used by Cloud IAM.
   * @return value or {@code null} for none
   */
  public GetPolicyOptions getOptions() {
    return options;
  }

  /**
   * OPTIONAL: A GetPolicyOptions object for specifying options to GetIamPolicy This field is only
   * used by Cloud IAM.
   * @param options options or {@code null} for none
   */
  public GetIamPolicyRequest setOptions(GetPolicyOptions options) {
    this.options = options;
    return this;
  }

  @Override
  public GetIamPolicyRequest set(String fieldName, Object value) {
    return (GetIamPolicyRequest) super.set(fieldName, value);
  }

  @Override
  public GetIamPolicyRequest clone() {
    return (GetIamPolicyRequest) super.clone();
  }

}
