// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 *&#47;/////////////////////////////////////////////////////////////////////////////
 * Messages from /proto/clarifai/api/search.proto
 * //////////////////////////////////////////////////////////////////////////////
 * </pre>
 *
 * Protobuf type {@code clarifai.api.Hit}
 */
public  final class Hit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Hit)
    HitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Hit.newBuilder() to construct.
  private Hit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Hit() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Hit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Hit(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            score_ = input.readFloat();
            break;
          }
          case 18: {
            com.clarifai.grpc.api.Input.Builder subBuilder = null;
            if (input_ != null) {
              subBuilder = input_.toBuilder();
            }
            input_ = input.readMessage(com.clarifai.grpc.api.Input.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(input_);
              input_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.clarifai.grpc.api.Annotation.Builder subBuilder = null;
            if (annotation_ != null) {
              subBuilder = annotation_.toBuilder();
            }
            annotation_ = input.readMessage(com.clarifai.grpc.api.Annotation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(annotation_);
              annotation_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Hit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Hit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Hit.class, com.clarifai.grpc.api.Hit.Builder.class);
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_;
  /**
   * <pre>
   * This is the score for the ranked Hit results of the search query. This score is a number
   * between 0.0 and 1.0 as it represents a confidence in the search Hit. For example, if you search
   * for "car" and get a close matching Hit, the score should be close to 1.0. If you get a score
   * of close to 0.0 that means it's very disimilar to your query, in this case NOT a "car". There
   * is a special intermediate score of 0.5 that means that the Hit is not really correlated with
   * your search query (ie. not similar or dissimlar to the query) which is a common occurrence
   * when using negate queries.
   * Note: some queries that are just filtering down your app of inputs may just return a score of
   * 1.0 for all Hits.
   * </pre>
   *
   * <code>float score = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int INPUT_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.Input input_;
  /**
   * <pre>
   * This is the matched input returned from the search query. This will contain information about
   * the Input such as the url, created_at time and trusted annotation information (for backwards
   * compatibility with apps that existed before Annotations were introduced.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 2;</code>
   */
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <pre>
   * This is the matched input returned from the search query. This will contain information about
   * the Input such as the url, created_at time and trusted annotation information (for backwards
   * compatibility with apps that existed before Annotations were introduced.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 2;</code>
   */
  public com.clarifai.grpc.api.Input getInput() {
    return input_ == null ? com.clarifai.grpc.api.Input.getDefaultInstance() : input_;
  }
  /**
   * <pre>
   * This is the matched input returned from the search query. This will contain information about
   * the Input such as the url, created_at time and trusted annotation information (for backwards
   * compatibility with apps that existed before Annotations were introduced.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 2;</code>
   */
  public com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder() {
    return getInput();
  }

  public static final int ANNOTATION_FIELD_NUMBER = 3;
  private com.clarifai.grpc.api.Annotation annotation_;
  /**
   * <pre>
   * We also provide back the specific matched annotation for the above input. We do this in order
   * to support more complex Annotation queries in the And message below. For example if we match
   * the search results to a region in your input, or a frame in a video input, this annotation
   * field will be that matched annotation info and the input will be the image/video that the user
   * originally added which contains those regions / frames.
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 3;</code>
   */
  public boolean hasAnnotation() {
    return annotation_ != null;
  }
  /**
   * <pre>
   * We also provide back the specific matched annotation for the above input. We do this in order
   * to support more complex Annotation queries in the And message below. For example if we match
   * the search results to a region in your input, or a frame in a video input, this annotation
   * field will be that matched annotation info and the input will be the image/video that the user
   * originally added which contains those regions / frames.
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 3;</code>
   */
  public com.clarifai.grpc.api.Annotation getAnnotation() {
    return annotation_ == null ? com.clarifai.grpc.api.Annotation.getDefaultInstance() : annotation_;
  }
  /**
   * <pre>
   * We also provide back the specific matched annotation for the above input. We do this in order
   * to support more complex Annotation queries in the And message below. For example if we match
   * the search results to a region in your input, or a frame in a video input, this annotation
   * field will be that matched annotation info and the input will be the image/video that the user
   * originally added which contains those regions / frames.
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 3;</code>
   */
  public com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationOrBuilder() {
    return getAnnotation();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (score_ != 0F) {
      output.writeFloat(1, score_);
    }
    if (input_ != null) {
      output.writeMessage(2, getInput());
    }
    if (annotation_ != null) {
      output.writeMessage(3, getAnnotation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, score_);
    }
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInput());
    }
    if (annotation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAnnotation());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.clarifai.grpc.api.Hit)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Hit other = (com.clarifai.grpc.api.Hit) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (hasAnnotation() != other.hasAnnotation()) return false;
    if (hasAnnotation()) {
      if (!getAnnotation()
          .equals(other.getAnnotation())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    if (hasAnnotation()) {
      hash = (37 * hash) + ANNOTATION_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Hit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Hit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Hit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Hit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.clarifai.grpc.api.Hit prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////
   * Messages from /proto/clarifai/api/search.proto
   * //////////////////////////////////////////////////////////////////////////////
   * </pre>
   *
   * Protobuf type {@code clarifai.api.Hit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Hit)
      com.clarifai.grpc.api.HitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Hit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Hit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Hit.class, com.clarifai.grpc.api.Hit.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Hit.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      score_ = 0F;

      if (inputBuilder_ == null) {
        input_ = null;
      } else {
        input_ = null;
        inputBuilder_ = null;
      }
      if (annotationBuilder_ == null) {
        annotation_ = null;
      } else {
        annotation_ = null;
        annotationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Hit_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Hit getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Hit.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Hit build() {
      com.clarifai.grpc.api.Hit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Hit buildPartial() {
      com.clarifai.grpc.api.Hit result = new com.clarifai.grpc.api.Hit(this);
      result.score_ = score_;
      if (inputBuilder_ == null) {
        result.input_ = input_;
      } else {
        result.input_ = inputBuilder_.build();
      }
      if (annotationBuilder_ == null) {
        result.annotation_ = annotation_;
      } else {
        result.annotation_ = annotationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.clarifai.grpc.api.Hit) {
        return mergeFrom((com.clarifai.grpc.api.Hit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Hit other) {
      if (other == com.clarifai.grpc.api.Hit.getDefaultInstance()) return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (other.hasAnnotation()) {
        mergeAnnotation(other.getAnnotation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.clarifai.grpc.api.Hit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Hit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float score_ ;
    /**
     * <pre>
     * This is the score for the ranked Hit results of the search query. This score is a number
     * between 0.0 and 1.0 as it represents a confidence in the search Hit. For example, if you search
     * for "car" and get a close matching Hit, the score should be close to 1.0. If you get a score
     * of close to 0.0 that means it's very disimilar to your query, in this case NOT a "car". There
     * is a special intermediate score of 0.5 that means that the Hit is not really correlated with
     * your search query (ie. not similar or dissimlar to the query) which is a common occurrence
     * when using negate queries.
     * Note: some queries that are just filtering down your app of inputs may just return a score of
     * 1.0 for all Hits.
     * </pre>
     *
     * <code>float score = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * This is the score for the ranked Hit results of the search query. This score is a number
     * between 0.0 and 1.0 as it represents a confidence in the search Hit. For example, if you search
     * for "car" and get a close matching Hit, the score should be close to 1.0. If you get a score
     * of close to 0.0 that means it's very disimilar to your query, in this case NOT a "car". There
     * is a special intermediate score of 0.5 that means that the Hit is not really correlated with
     * your search query (ie. not similar or dissimlar to the query) which is a common occurrence
     * when using negate queries.
     * Note: some queries that are just filtering down your app of inputs may just return a score of
     * 1.0 for all Hits.
     * </pre>
     *
     * <code>float score = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is the score for the ranked Hit results of the search query. This score is a number
     * between 0.0 and 1.0 as it represents a confidence in the search Hit. For example, if you search
     * for "car" and get a close matching Hit, the score should be close to 1.0. If you get a score
     * of close to 0.0 that means it's very disimilar to your query, in this case NOT a "car". There
     * is a special intermediate score of 0.5 that means that the Hit is not really correlated with
     * your search query (ie. not similar or dissimlar to the query) which is a common occurrence
     * when using negate queries.
     * Note: some queries that are just filtering down your app of inputs may just return a score of
     * 1.0 for all Hits.
     * </pre>
     *
     * <code>float score = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearScore() {
      
      score_ = 0F;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.Input input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Input, com.clarifai.grpc.api.Input.Builder, com.clarifai.grpc.api.InputOrBuilder> inputBuilder_;
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public boolean hasInput() {
      return inputBuilder_ != null || input_ != null;
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public com.clarifai.grpc.api.Input getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? com.clarifai.grpc.api.Input.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public Builder setInput(com.clarifai.grpc.api.Input value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
        onChanged();
      } else {
        inputBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public Builder setInput(
        com.clarifai.grpc.api.Input.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
        onChanged();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public Builder mergeInput(com.clarifai.grpc.api.Input value) {
      if (inputBuilder_ == null) {
        if (input_ != null) {
          input_ =
            com.clarifai.grpc.api.Input.newBuilder(input_).mergeFrom(value).buildPartial();
        } else {
          input_ = value;
        }
        onChanged();
      } else {
        inputBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public Builder clearInput() {
      if (inputBuilder_ == null) {
        input_ = null;
        onChanged();
      } else {
        input_ = null;
        inputBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public com.clarifai.grpc.api.Input.Builder getInputBuilder() {
      
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    public com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            com.clarifai.grpc.api.Input.getDefaultInstance() : input_;
      }
    }
    /**
     * <pre>
     * This is the matched input returned from the search query. This will contain information about
     * the Input such as the url, created_at time and trusted annotation information (for backwards
     * compatibility with apps that existed before Annotations were introduced.
     * </pre>
     *
     * <code>.clarifai.api.Input input = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Input, com.clarifai.grpc.api.Input.Builder, com.clarifai.grpc.api.InputOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Input, com.clarifai.grpc.api.Input.Builder, com.clarifai.grpc.api.InputOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }

    private com.clarifai.grpc.api.Annotation annotation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder> annotationBuilder_;
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public boolean hasAnnotation() {
      return annotationBuilder_ != null || annotation_ != null;
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public com.clarifai.grpc.api.Annotation getAnnotation() {
      if (annotationBuilder_ == null) {
        return annotation_ == null ? com.clarifai.grpc.api.Annotation.getDefaultInstance() : annotation_;
      } else {
        return annotationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public Builder setAnnotation(com.clarifai.grpc.api.Annotation value) {
      if (annotationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotation_ = value;
        onChanged();
      } else {
        annotationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public Builder setAnnotation(
        com.clarifai.grpc.api.Annotation.Builder builderForValue) {
      if (annotationBuilder_ == null) {
        annotation_ = builderForValue.build();
        onChanged();
      } else {
        annotationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public Builder mergeAnnotation(com.clarifai.grpc.api.Annotation value) {
      if (annotationBuilder_ == null) {
        if (annotation_ != null) {
          annotation_ =
            com.clarifai.grpc.api.Annotation.newBuilder(annotation_).mergeFrom(value).buildPartial();
        } else {
          annotation_ = value;
        }
        onChanged();
      } else {
        annotationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public Builder clearAnnotation() {
      if (annotationBuilder_ == null) {
        annotation_ = null;
        onChanged();
      } else {
        annotation_ = null;
        annotationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public com.clarifai.grpc.api.Annotation.Builder getAnnotationBuilder() {
      
      onChanged();
      return getAnnotationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    public com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationOrBuilder() {
      if (annotationBuilder_ != null) {
        return annotationBuilder_.getMessageOrBuilder();
      } else {
        return annotation_ == null ?
            com.clarifai.grpc.api.Annotation.getDefaultInstance() : annotation_;
      }
    }
    /**
     * <pre>
     * We also provide back the specific matched annotation for the above input. We do this in order
     * to support more complex Annotation queries in the And message below. For example if we match
     * the search results to a region in your input, or a frame in a video input, this annotation
     * field will be that matched annotation info and the input will be the image/video that the user
     * originally added which contains those regions / frames.
     * </pre>
     *
     * <code>.clarifai.api.Annotation annotation = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder> 
        getAnnotationFieldBuilder() {
      if (annotationBuilder_ == null) {
        annotationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder>(
                getAnnotation(),
                getParentForChildren(),
                isClean());
        annotation_ = null;
      }
      return annotationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:clarifai.api.Hit)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Hit)
  private static final com.clarifai.grpc.api.Hit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Hit();
  }

  public static com.clarifai.grpc.api.Hit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Hit>
      PARSER = new com.google.protobuf.AbstractParser<Hit>() {
    @java.lang.Override
    public Hit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Hit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Hit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Hit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Hit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
