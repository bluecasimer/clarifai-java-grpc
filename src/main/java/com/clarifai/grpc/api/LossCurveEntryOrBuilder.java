// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface LossCurveEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.LossCurveEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * current epoch
   * </pre>
   *
   * <code>uint32 epoch = 1;</code>
   */
  int getEpoch();

  /**
   * <pre>
   * current global step
   * </pre>
   *
   * <code>uint32 global_step = 2;</code>
   */
  int getGlobalStep();

  /**
   * <pre>
   * current cost
   * FIXME(rigel): this should be loss instead of cost.
   * </pre>
   *
   * <code>float cost = 3;</code>
   */
  float getCost();
}
