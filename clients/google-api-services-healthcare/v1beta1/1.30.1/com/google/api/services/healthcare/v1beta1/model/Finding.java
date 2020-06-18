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
 * Model definition for Finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Finding extends com.google.api.client.json.GenericJson {

  /**
   * Zero-based ending index of the found text, exclusively.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long end;

  /**
   * The type of information stored in this text range. For example, HumanName, BirthDate, or
   * Address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String infoType;

  /**
   * The snippet of the sensitive text. This field is only populated during deidentification if
   * `store_quote` is set to true in DeidentifyConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quote;

  /**
   * Zero-based starting index of the found text, inclusively.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long start;

  /**
   * Zero-based ending index of the found text, exclusively.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * Zero-based ending index of the found text, exclusively.
   * @param end end or {@code null} for none
   */
  public Finding setEnd(java.lang.Long end) {
    this.end = end;
    return this;
  }

  /**
   * The type of information stored in this text range. For example, HumanName, BirthDate, or
   * Address.
   * @return value or {@code null} for none
   */
  public java.lang.String getInfoType() {
    return infoType;
  }

  /**
   * The type of information stored in this text range. For example, HumanName, BirthDate, or
   * Address.
   * @param infoType infoType or {@code null} for none
   */
  public Finding setInfoType(java.lang.String infoType) {
    this.infoType = infoType;
    return this;
  }

  /**
   * The snippet of the sensitive text. This field is only populated during deidentification if
   * `store_quote` is set to true in DeidentifyConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuote() {
    return quote;
  }

  /**
   * The snippet of the sensitive text. This field is only populated during deidentification if
   * `store_quote` is set to true in DeidentifyConfig.
   * @param quote quote or {@code null} for none
   */
  public Finding setQuote(java.lang.String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Zero-based starting index of the found text, inclusively.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * Zero-based starting index of the found text, inclusively.
   * @param start start or {@code null} for none
   */
  public Finding setStart(java.lang.Long start) {
    this.start = start;
    return this;
  }

  @Override
  public Finding set(String fieldName, Object value) {
    return (Finding) super.set(fieldName, value);
  }

  @Override
  public Finding clone() {
    return (Finding) super.clone();
  }

}
