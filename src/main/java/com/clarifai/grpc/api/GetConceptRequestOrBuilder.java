// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetConceptRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetConceptRequest)
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
   * <pre>
   * The concept's id.
   * </pre>
   *
   * <code>string concept_id = 2;</code>
   */
  java.lang.String getConceptId();
  /**
   * <pre>
   * The concept's id.
   * </pre>
   *
   * <code>string concept_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getConceptIdBytes();
}
