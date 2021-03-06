// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface HostedURLOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.HostedURL)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Prefix of the URL of every hosted image.
   * </pre>
   *
   * <code>string prefix = 1;</code>
   */
  java.lang.String getPrefix();
  /**
   * <pre>
   * Prefix of the URL of every hosted image.
   * </pre>
   *
   * <code>string prefix = 1;</code>
   */
  com.google.protobuf.ByteString
      getPrefixBytes();

  /**
   * <pre>
   * Suffix of an image stored in different sizes.
   * </pre>
   *
   * <code>string suffix = 2;</code>
   */
  java.lang.String getSuffix();
  /**
   * <pre>
   * Suffix of an image stored in different sizes.
   * </pre>
   *
   * <code>string suffix = 2;</code>
   */
  com.google.protobuf.ByteString
      getSuffixBytes();

  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   */
  java.util.List<java.lang.String>
      getSizesList();
  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   */
  int getSizesCount();
  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   */
  java.lang.String getSizes(int index);
  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   */
  com.google.protobuf.ByteString
      getSizesBytes(int index);
}
