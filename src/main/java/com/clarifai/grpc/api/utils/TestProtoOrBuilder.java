// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/utils/test_proto.proto

package com.clarifai.grpc.api.utils;

public interface TestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.utils.TestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string message = 2 [(.clarifai.api.utils.cl_show_if_empty) = true, (.clarifai.api.utils.cl_moretags) = "protos are cool"];</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2 [(.clarifai.api.utils.cl_show_if_empty) = true, (.clarifai.api.utils.cl_moretags) = "protos are cool"];</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>double value = 3 [(.clarifai.api.utils.cl_default_float) = 1];</code>
   */
  double getValue();

  /**
   * <code>bytes image_bytes = 4;</code>
   */
  com.google.protobuf.ByteString getImageBytes();

  /**
   * <code>string string_oneof = 5;</code>
   */
  java.lang.String getStringOneof();
  /**
   * <code>string string_oneof = 5;</code>
   */
  com.google.protobuf.ByteString
      getStringOneofBytes();

  /**
   * <code>bool bool_oneof = 6;</code>
   */
  boolean getBoolOneof();

  /**
   * <code>.clarifai.api.utils.TestProto2 message_oneof = 7;</code>
   */
  boolean hasMessageOneof();
  /**
   * <code>.clarifai.api.utils.TestProto2 message_oneof = 7;</code>
   */
  com.clarifai.grpc.api.utils.TestProto2 getMessageOneof();
  /**
   * <code>.clarifai.api.utils.TestProto2 message_oneof = 7;</code>
   */
  com.clarifai.grpc.api.utils.TestProto2OrBuilder getMessageOneofOrBuilder();

  public com.clarifai.grpc.api.utils.TestProto.OneOfFieldCase getOneOfFieldCase();
}
