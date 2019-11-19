// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface KeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Key)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of this key, it is used for authorization.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * The id of this key, it is used for authorization.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The type of key, it can be api_key or personal_access_token, the default value is api_key
   * </pre>
   *
   * <code>string type = 8;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * The type of key, it can be api_key or personal_access_token, the default value is api_key
   * </pre>
   *
   * <code>string type = 8;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The description
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The low-level scopes this key has
   * </pre>
   *
   * <code>repeated string scopes = 3;</code>
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <pre>
   * The low-level scopes this key has
   * </pre>
   *
   * <code>repeated string scopes = 3;</code>
   */
  int getScopesCount();
  /**
   * <pre>
   * The low-level scopes this key has
   * </pre>
   *
   * <code>repeated string scopes = 3;</code>
   */
  java.lang.String getScopes(int index);
  /**
   * <pre>
   * The low-level scopes this key has
   * </pre>
   *
   * <code>repeated string scopes = 3;</code>
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <pre>
   * The endpoint-level scopes this key has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   */
  java.util.List<java.lang.String>
      getEndpointsList();
  /**
   * <pre>
   * The endpoint-level scopes this key has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * The endpoint-level scopes this key has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   */
  java.lang.String getEndpoints(int index);
  /**
   * <pre>
   * The endpoint-level scopes this key has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   */
  com.google.protobuf.ByteString
      getEndpointsBytes(int index);

  /**
   * <pre>
   * The apps that this key give you access to, it is empty if this key is personal_access_token
   * API key can only give you access to a single app.
   * </pre>
   *
   * <code>repeated .clarifai.api.App apps = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.App> 
      getAppsList();
  /**
   * <pre>
   * The apps that this key give you access to, it is empty if this key is personal_access_token
   * API key can only give you access to a single app.
   * </pre>
   *
   * <code>repeated .clarifai.api.App apps = 4;</code>
   */
  com.clarifai.grpc.api.App getApps(int index);
  /**
   * <pre>
   * The apps that this key give you access to, it is empty if this key is personal_access_token
   * API key can only give you access to a single app.
   * </pre>
   *
   * <code>repeated .clarifai.api.App apps = 4;</code>
   */
  int getAppsCount();
  /**
   * <pre>
   * The apps that this key give you access to, it is empty if this key is personal_access_token
   * API key can only give you access to a single app.
   * </pre>
   *
   * <code>repeated .clarifai.api.App apps = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.AppOrBuilder> 
      getAppsOrBuilderList();
  /**
   * <pre>
   * The apps that this key give you access to, it is empty if this key is personal_access_token
   * API key can only give you access to a single app.
   * </pre>
   *
   * <code>repeated .clarifai.api.App apps = 4;</code>
   */
  com.clarifai.grpc.api.AppOrBuilder getAppsOrBuilder(
      int index);

  /**
   * <pre>
   * When the key was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the key was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the key was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When does the key expires, the key won't expire if this is empty
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 6;</code>
   */
  boolean hasExpiresAt();
  /**
   * <pre>
   * When does the key expires, the key won't expire if this is empty
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 6;</code>
   */
  com.google.protobuf.Timestamp getExpiresAt();
  /**
   * <pre>
   * When does the key expires, the key won't expire if this is empty
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder();
}