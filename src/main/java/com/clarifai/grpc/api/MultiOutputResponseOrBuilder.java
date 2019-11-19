// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiOutputResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiOutputResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.Output> 
      getOutputsList();
  /**
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.Output getOutputs(int index);
  /**
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getOutputsCount();
  /**
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.OutputOrBuilder> 
      getOutputsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.OutputOrBuilder getOutputsOrBuilder(
      int index);
}