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

package com.google.api.services.securitycenter.v1p1beta1.model;

/**
 * Response message for listing assets.
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
public final class ListAssetsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Assets matching the list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ListAssetsResult> listAssetsResults;

  /**
   * Token to retrieve the next page of results, or empty if there are no more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Time used for executing the list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * The total number of assets matching the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * Assets matching the list request.
   * @return value or {@code null} for none
   */
  public java.util.List<ListAssetsResult> getListAssetsResults() {
    return listAssetsResults;
  }

  /**
   * Assets matching the list request.
   * @param listAssetsResults listAssetsResults or {@code null} for none
   */
  public ListAssetsResponse setListAssetsResults(java.util.List<ListAssetsResult> listAssetsResults) {
    this.listAssetsResults = listAssetsResults;
    return this;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAssetsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Time used for executing the list request.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Time used for executing the list request.
   * @param readTime readTime or {@code null} for none
   */
  public ListAssetsResponse setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  /**
   * The total number of assets matching the query.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The total number of assets matching the query.
   * @param totalSize totalSize or {@code null} for none
   */
  public ListAssetsResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public ListAssetsResponse set(String fieldName, Object value) {
    return (ListAssetsResponse) super.set(fieldName, value);
  }

  @Override
  public ListAssetsResponse clone() {
    return (ListAssetsResponse) super.clone();
  }

}
