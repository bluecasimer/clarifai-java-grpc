// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface QueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Query)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The query syntax is simply a list of And operatiosn that will be ANDed together to fetch
   * results which are returned to the user as Hit messages.
   * </pre>
   *
   * <code>repeated .clarifai.api.And ands = 1;</code>
   */
  java.util.List<com.clarifai.grpc.api.And> 
      getAndsList();
  /**
   * <pre>
   * The query syntax is simply a list of And operatiosn that will be ANDed together to fetch
   * results which are returned to the user as Hit messages.
   * </pre>
   *
   * <code>repeated .clarifai.api.And ands = 1;</code>
   */
  com.clarifai.grpc.api.And getAnds(int index);
  /**
   * <pre>
   * The query syntax is simply a list of And operatiosn that will be ANDed together to fetch
   * results which are returned to the user as Hit messages.
   * </pre>
   *
   * <code>repeated .clarifai.api.And ands = 1;</code>
   */
  int getAndsCount();
  /**
   * <pre>
   * The query syntax is simply a list of And operatiosn that will be ANDed together to fetch
   * results which are returned to the user as Hit messages.
   * </pre>
   *
   * <code>repeated .clarifai.api.And ands = 1;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.AndOrBuilder> 
      getAndsOrBuilderList();
  /**
   * <pre>
   * The query syntax is simply a list of And operatiosn that will be ANDed together to fetch
   * results which are returned to the user as Hit messages.
   * </pre>
   *
   * <code>repeated .clarifai.api.And ands = 1;</code>
   */
  com.clarifai.grpc.api.AndOrBuilder getAndsOrBuilder(
      int index);

  /**
   * <pre>
   * This allows the query to override any default language the app was setup in when doing Concept
   * based searches. This currently only affects public Models Output searches when those public
   * Models have translations for their Concepts.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * This allows the query to override any default language the app was setup in when doing Concept
   * based searches. This currently only affects public Models Output searches when those public
   * Models have translations for their Concepts.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * filters in this query
   * e.q. only fetch annotations that have certain metadata
   * </pre>
   *
   * <code>repeated .clarifai.api.Filter filters = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Filter> 
      getFiltersList();
  /**
   * <pre>
   * filters in this query
   * e.q. only fetch annotations that have certain metadata
   * </pre>
   *
   * <code>repeated .clarifai.api.Filter filters = 3;</code>
   */
  com.clarifai.grpc.api.Filter getFilters(int index);
  /**
   * <pre>
   * filters in this query
   * e.q. only fetch annotations that have certain metadata
   * </pre>
   *
   * <code>repeated .clarifai.api.Filter filters = 3;</code>
   */
  int getFiltersCount();
  /**
   * <pre>
   * filters in this query
   * e.q. only fetch annotations that have certain metadata
   * </pre>
   *
   * <code>repeated .clarifai.api.Filter filters = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.FilterOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <pre>
   * filters in this query
   * e.q. only fetch annotations that have certain metadata
   * </pre>
   *
   * <code>repeated .clarifai.api.Filter filters = 3;</code>
   */
  com.clarifai.grpc.api.FilterOrBuilder getFiltersOrBuilder(
      int index);

  /**
   * <pre>
   * rankings in this query
   * e.g. visual search by a url
   * </pre>
   *
   * <code>repeated .clarifai.api.Rank ranks = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.Rank> 
      getRanksList();
  /**
   * <pre>
   * rankings in this query
   * e.g. visual search by a url
   * </pre>
   *
   * <code>repeated .clarifai.api.Rank ranks = 4;</code>
   */
  com.clarifai.grpc.api.Rank getRanks(int index);
  /**
   * <pre>
   * rankings in this query
   * e.g. visual search by a url
   * </pre>
   *
   * <code>repeated .clarifai.api.Rank ranks = 4;</code>
   */
  int getRanksCount();
  /**
   * <pre>
   * rankings in this query
   * e.g. visual search by a url
   * </pre>
   *
   * <code>repeated .clarifai.api.Rank ranks = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.RankOrBuilder> 
      getRanksOrBuilderList();
  /**
   * <pre>
   * rankings in this query
   * e.g. visual search by a url
   * </pre>
   *
   * <code>repeated .clarifai.api.Rank ranks = 4;</code>
   */
  com.clarifai.grpc.api.RankOrBuilder getRanksOrBuilder(
      int index);
}