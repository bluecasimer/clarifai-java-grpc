// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostWorkflowsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostWorkflowsRequest)
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
   * <code>repeated .clarifai.api.Workflow workflows = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Workflow> 
      getWorkflowsList();
  /**
   * <code>repeated .clarifai.api.Workflow workflows = 2;</code>
   */
  com.clarifai.grpc.api.Workflow getWorkflows(int index);
  /**
   * <code>repeated .clarifai.api.Workflow workflows = 2;</code>
   */
  int getWorkflowsCount();
  /**
   * <code>repeated .clarifai.api.Workflow workflows = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkflowOrBuilder> 
      getWorkflowsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Workflow workflows = 2;</code>
   */
  com.clarifai.grpc.api.WorkflowOrBuilder getWorkflowsOrBuilder(
      int index);
}
