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
 * Specifies how to store annotations during de-identification operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnnotationConfig extends com.google.api.client.json.GenericJson {

  /**
   * The name of the annotation store, in the form `projects/{project_id}/locations/{location_id}/da
   * tasets/{dataset_id}/annotationStores/{annotation_store_id}`).
   *
   *  * The destination annotation store must be in the same project as the    source data. De-
   * identifying data across multiple projects is not    supported.  * The destination annotation
   * store must exist when using    DeidentifyDicomStore or    DeidentifyFhirStore.
   * DeidentifyDataset    automatically creates the destination annotation store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationStoreName;

  /**
   * If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean storeQuote;

  /**
   * The name of the annotation store, in the form `projects/{project_id}/locations/{location_id}/da
   * tasets/{dataset_id}/annotationStores/{annotation_store_id}`).
   *
   *  * The destination annotation store must be in the same project as the    source data. De-
   * identifying data across multiple projects is not    supported.  * The destination annotation
   * store must exist when using    DeidentifyDicomStore or    DeidentifyFhirStore.
   * DeidentifyDataset    automatically creates the destination annotation store.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationStoreName() {
    return annotationStoreName;
  }

  /**
   * The name of the annotation store, in the form `projects/{project_id}/locations/{location_id}/da
   * tasets/{dataset_id}/annotationStores/{annotation_store_id}`).
   *
   *  * The destination annotation store must be in the same project as the    source data. De-
   * identifying data across multiple projects is not    supported.  * The destination annotation
   * store must exist when using    DeidentifyDicomStore or    DeidentifyFhirStore.
   * DeidentifyDataset    automatically creates the destination annotation store.
   * @param annotationStoreName annotationStoreName or {@code null} for none
   */
  public AnnotationConfig setAnnotationStoreName(java.lang.String annotationStoreName) {
    this.annotationStoreName = annotationStoreName;
    return this;
  }

  /**
   * If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStoreQuote() {
    return storeQuote;
  }

  /**
   * If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
   * @param storeQuote storeQuote or {@code null} for none
   */
  public AnnotationConfig setStoreQuote(java.lang.Boolean storeQuote) {
    this.storeQuote = storeQuote;
    return this;
  }

  @Override
  public AnnotationConfig set(String fieldName, Object value) {
    return (AnnotationConfig) super.set(fieldName, value);
  }

  @Override
  public AnnotationConfig clone() {
    return (AnnotationConfig) super.clone();
  }

}
