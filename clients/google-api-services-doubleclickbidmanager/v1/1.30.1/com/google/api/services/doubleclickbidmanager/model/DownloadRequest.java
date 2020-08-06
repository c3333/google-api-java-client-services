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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Request to fetch stored inventory sources, campaigns, insertion orders, line items, YouTube ad
 * groups and ads.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DownloadRequest extends com.google.api.client.json.GenericJson {

  /**
   * File types that will be returned. If INVENTORY_SOURCE is requested, no other file types may be
   * requested. Acceptable values are:  "AD" "AD_GROUP" "CAMPAIGN" "INSERTION_ORDER"
   * "INVENTORY_SOURCE" "LINE_ITEM"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fileTypes;

  /**
   * The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID
   * must be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> filterIds;

  /**
   * Filter type used to filter entities to fetch. PARTNER_ID and INVENTORY_SOURCE_ID may only be
   * used when downloading inventory sources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filterType;

  /**
   * SDF Version (column names, types, order) in which the entities will be returned. Default to 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * File types that will be returned. If INVENTORY_SOURCE is requested, no other file types may be
   * requested. Acceptable values are:  "AD" "AD_GROUP" "CAMPAIGN" "INSERTION_ORDER"
   * "INVENTORY_SOURCE" "LINE_ITEM"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFileTypes() {
    return fileTypes;
  }

  /**
   * File types that will be returned. If INVENTORY_SOURCE is requested, no other file types may be
   * requested. Acceptable values are:  "AD" "AD_GROUP" "CAMPAIGN" "INSERTION_ORDER"
   * "INVENTORY_SOURCE" "LINE_ITEM"
   * @param fileTypes fileTypes or {@code null} for none
   */
  public DownloadRequest setFileTypes(java.util.List<java.lang.String> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }

  /**
   * The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID
   * must be specified.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getFilterIds() {
    return filterIds;
  }

  /**
   * The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID
   * must be specified.
   * @param filterIds filterIds or {@code null} for none
   */
  public DownloadRequest setFilterIds(java.util.List<java.lang.Long> filterIds) {
    this.filterIds = filterIds;
    return this;
  }

  /**
   * Filter type used to filter entities to fetch. PARTNER_ID and INVENTORY_SOURCE_ID may only be
   * used when downloading inventory sources.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilterType() {
    return filterType;
  }

  /**
   * Filter type used to filter entities to fetch. PARTNER_ID and INVENTORY_SOURCE_ID may only be
   * used when downloading inventory sources.
   * @param filterType filterType or {@code null} for none
   */
  public DownloadRequest setFilterType(java.lang.String filterType) {
    this.filterType = filterType;
    return this;
  }

  /**
   * SDF Version (column names, types, order) in which the entities will be returned. Default to 5.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * SDF Version (column names, types, order) in which the entities will be returned. Default to 5.
   * @param version version or {@code null} for none
   */
  public DownloadRequest setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public DownloadRequest set(String fieldName, Object value) {
    return (DownloadRequest) super.set(fieldName, value);
  }

  @Override
  public DownloadRequest clone() {
    return (DownloadRequest) super.clone();
  }

}
