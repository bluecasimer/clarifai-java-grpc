// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface FaceGenderIdentityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.FaceGenderIdentity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .clarifai.api.Concept concepts = 1;</code>
   */
  java.util.List<com.clarifai.grpc.api.Concept> 
      getConceptsList();
  /**
   * <code>repeated .clarifai.api.Concept concepts = 1;</code>
   */
  com.clarifai.grpc.api.Concept getConcepts(int index);
  /**
   * <code>repeated .clarifai.api.Concept concepts = 1;</code>
   */
  int getConceptsCount();
  /**
   * <code>repeated .clarifai.api.Concept concepts = 1;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ConceptOrBuilder> 
      getConceptsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Concept concepts = 1;</code>
   */
  com.clarifai.grpc.api.ConceptOrBuilder getConceptsOrBuilder(
      int index);
}