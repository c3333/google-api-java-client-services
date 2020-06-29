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

package com.google.api.services.vectortile.v1.model;

/**
 * Represents a strip of triangles. Each triangle uses the last edge of the previous one. The
 * following diagram shows an example of a triangle strip, with each vertex labeled with its index
 * in the vertex_index array.
 *
 *              (1)-----(3)              / \     / \             /   \   /   \            /     \ /
 * \          (0)-----(2)-----(4)
 *
 * Vertices may be in either clockwise or counter-clockwise order.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Semantic Tile API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriangleStrip extends com.google.api.client.json.GenericJson {

  /**
   * Index into the vertex_offset array representing the next vertex in the triangle strip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> vertexIndices;

  /**
   * Index into the vertex_offset array representing the next vertex in the triangle strip.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getVertexIndices() {
    return vertexIndices;
  }

  /**
   * Index into the vertex_offset array representing the next vertex in the triangle strip.
   * @param vertexIndices vertexIndices or {@code null} for none
   */
  public TriangleStrip setVertexIndices(java.util.List<java.lang.Integer> vertexIndices) {
    this.vertexIndices = vertexIndices;
    return this;
  }

  @Override
  public TriangleStrip set(String fieldName, Object value) {
    return (TriangleStrip) super.set(fieldName, value);
  }

  @Override
  public TriangleStrip clone() {
    return (TriangleStrip) super.clone();
  }

}
