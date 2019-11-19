// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface VideoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Video)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is a URL to a publicly accessible video file. The platform will download this file server
   * side and then process.
   * </pre>
   *
   * <code>string url = 1;</code>
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * This is a URL to a publicly accessible video file. The platform will download this file server
   * side and then process.
   * </pre>
   *
   * <code>string url = 1;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The base64 field is using video file bytes directly in the request.
   * NOTE: if you're sending a json request, then this MUST be base64 encoded before sending (hence
   * the name here).
   * When using our grpc clients, you DO NOT need to base64 encode
   * it yourself since the clients know how to do this for you automatically and will avoid the
   * base64 encoding if they send a binary request.
   * </pre>
   *
   * <code>bytes base64 = 2;</code>
   */
  com.google.protobuf.ByteString getBase64();

  /**
   * <code>bool allow_duplicate_url = 4;</code>
   */
  boolean getAllowDuplicateUrl();

  /**
   * <pre>
   * URL of thumbnail image, which is currently frame at position of 1s. This field is currently
   * used only in response.
   * </pre>
   *
   * <code>string thumbnail_url = 5;</code>
   */
  java.lang.String getThumbnailUrl();
  /**
   * <pre>
   * URL of thumbnail image, which is currently frame at position of 1s. This field is currently
   * used only in response.
   * </pre>
   *
   * <code>string thumbnail_url = 5;</code>
   */
  com.google.protobuf.ByteString
      getThumbnailUrlBytes();

  /**
   * <pre>
   * The hosted field lists original video hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 6;</code>
   */
  boolean hasHosted();
  /**
   * <pre>
   * The hosted field lists original video hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 6;</code>
   */
  com.clarifai.grpc.api.HostedURL getHosted();
  /**
   * <pre>
   * The hosted field lists original video hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 6;</code>
   */
  com.clarifai.grpc.api.HostedURLOrBuilder getHostedOrBuilder();
}