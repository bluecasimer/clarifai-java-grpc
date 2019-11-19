// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ConceptCountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ConceptCount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The concept's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * The concept's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The name of the concept.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the concept.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The total count for concepts labeled for all asset statues (processing, to_process, processed, error)
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount concept_type_count = 3;</code>
   */
  boolean hasConceptTypeCount();
  /**
   * <pre>
   * The total count for concepts labeled for all asset statues (processing, to_process, processed, error)
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount concept_type_count = 3;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCount getConceptTypeCount();
  /**
   * <pre>
   * The total count for concepts labeled for all asset statues (processing, to_process, processed, error)
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount concept_type_count = 3;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCountOrBuilder getConceptTypeCountOrBuilder();

  /**
   * <pre>
   * The detail count for different assets status
   * </pre>
   *
   * <code>.clarifai.api.DetailConceptCount detail_concept_count = 4;</code>
   */
  boolean hasDetailConceptCount();
  /**
   * <pre>
   * The detail count for different assets status
   * </pre>
   *
   * <code>.clarifai.api.DetailConceptCount detail_concept_count = 4;</code>
   */
  com.clarifai.grpc.api.DetailConceptCount getDetailConceptCount();
  /**
   * <pre>
   * The detail count for different assets status
   * </pre>
   *
   * <code>.clarifai.api.DetailConceptCount detail_concept_count = 4;</code>
   */
  com.clarifai.grpc.api.DetailConceptCountOrBuilder getDetailConceptCountOrBuilder();
}