// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  boolean hasUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <code>string model_id = 2;</code>
   */
  java.lang.String getModelId();
  /**
   * <code>string model_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <pre>
   * This is included so that we can re-use this request for multiple
   * rpcs with and without the version_id.
   * </pre>
   *
   * <code>string version_id = 3;</code>
   */
  java.lang.String getVersionId();
  /**
   * <pre>
   * This is included so that we can re-use this request for multiple
   * rpcs with and without the version_id.
   * </pre>
   *
   * <code>string version_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getVersionIdBytes();

  /**
   * <code>string language = 4;</code>
   */
  java.lang.String getLanguage();
  /**
   * <code>string language = 4;</code>
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <code>bool trained_before = 5;</code>
   */
  boolean getTrainedBefore();
}