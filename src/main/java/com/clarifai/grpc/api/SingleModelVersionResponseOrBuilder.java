// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleModelVersionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleModelVersionResponse)
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
   * <code>.clarifai.api.ModelVersion model_version = 2;</code>
   */
  boolean hasModelVersion();
  /**
   * <code>.clarifai.api.ModelVersion model_version = 2;</code>
   */
  com.clarifai.grpc.api.ModelVersion getModelVersion();
  /**
   * <code>.clarifai.api.ModelVersion model_version = 2;</code>
   */
  com.clarifai.grpc.api.ModelVersionOrBuilder getModelVersionOrBuilder();
}
