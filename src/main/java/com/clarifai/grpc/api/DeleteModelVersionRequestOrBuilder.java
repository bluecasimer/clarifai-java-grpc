// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface DeleteModelVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DeleteModelVersionRequest)
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
   * <code>string model_id = 3;</code>
   */
  java.lang.String getModelId();
  /**
   * <code>string model_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <code>string version_id = 4;</code>
   */
  java.lang.String getVersionId();
  /**
   * <code>string version_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getVersionIdBytes();
}