// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface GeoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Geo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.GeoPoint geo_point = 1;</code>
   */
  boolean hasGeoPoint();
  /**
   * <code>.clarifai.api.GeoPoint geo_point = 1;</code>
   */
  com.clarifai.grpc.api.GeoPoint getGeoPoint();
  /**
   * <code>.clarifai.api.GeoPoint geo_point = 1;</code>
   */
  com.clarifai.grpc.api.GeoPointOrBuilder getGeoPointOrBuilder();

  /**
   * <code>.clarifai.api.GeoLimit geo_limit = 2;</code>
   */
  boolean hasGeoLimit();
  /**
   * <code>.clarifai.api.GeoLimit geo_limit = 2;</code>
   */
  com.clarifai.grpc.api.GeoLimit getGeoLimit();
  /**
   * <code>.clarifai.api.GeoLimit geo_limit = 2;</code>
   */
  com.clarifai.grpc.api.GeoLimitOrBuilder getGeoLimitOrBuilder();

  /**
   * <pre>
   * NOTE: inconsistency: should have been geo_boxed_points
   * </pre>
   *
   * <code>repeated .clarifai.api.GeoBoxedPoint geo_box = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.GeoBoxedPoint> 
      getGeoBoxList();
  /**
   * <pre>
   * NOTE: inconsistency: should have been geo_boxed_points
   * </pre>
   *
   * <code>repeated .clarifai.api.GeoBoxedPoint geo_box = 3;</code>
   */
  com.clarifai.grpc.api.GeoBoxedPoint getGeoBox(int index);
  /**
   * <pre>
   * NOTE: inconsistency: should have been geo_boxed_points
   * </pre>
   *
   * <code>repeated .clarifai.api.GeoBoxedPoint geo_box = 3;</code>
   */
  int getGeoBoxCount();
  /**
   * <pre>
   * NOTE: inconsistency: should have been geo_boxed_points
   * </pre>
   *
   * <code>repeated .clarifai.api.GeoBoxedPoint geo_box = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.GeoBoxedPointOrBuilder> 
      getGeoBoxOrBuilderList();
  /**
   * <pre>
   * NOTE: inconsistency: should have been geo_boxed_points
   * </pre>
   *
   * <code>repeated .clarifai.api.GeoBoxedPoint geo_box = 3;</code>
   */
  com.clarifai.grpc.api.GeoBoxedPointOrBuilder getGeoBoxOrBuilder(
      int index);
}
