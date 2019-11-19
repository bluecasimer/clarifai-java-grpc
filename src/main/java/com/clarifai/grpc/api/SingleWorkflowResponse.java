// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.SingleWorkflowResponse}
 */
public  final class SingleWorkflowResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.SingleWorkflowResponse)
    SingleWorkflowResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SingleWorkflowResponse.newBuilder() to construct.
  private SingleWorkflowResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SingleWorkflowResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SingleWorkflowResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SingleWorkflowResponse(
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
          case 10: {
            com.clarifai.grpc.api.status.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.clarifai.grpc.api.status.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.clarifai.grpc.api.Workflow.Builder subBuilder = null;
            if (workflow_ != null) {
              subBuilder = workflow_.toBuilder();
            }
            workflow_ = input.readMessage(com.clarifai.grpc.api.Workflow.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workflow_);
              workflow_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleWorkflowResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleWorkflowResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.SingleWorkflowResponse.class, com.clarifai.grpc.api.SingleWorkflowResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.Status getStatus() {
    return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int WORKFLOW_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.Workflow workflow_;
  /**
   * <code>.clarifai.api.Workflow workflow = 2;</code>
   */
  public boolean hasWorkflow() {
    return workflow_ != null;
  }
  /**
   * <code>.clarifai.api.Workflow workflow = 2;</code>
   */
  public com.clarifai.grpc.api.Workflow getWorkflow() {
    return workflow_ == null ? com.clarifai.grpc.api.Workflow.getDefaultInstance() : workflow_;
  }
  /**
   * <code>.clarifai.api.Workflow workflow = 2;</code>
   */
  public com.clarifai.grpc.api.WorkflowOrBuilder getWorkflowOrBuilder() {
    return getWorkflow();
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    if (workflow_ != null) {
      output.writeMessage(2, getWorkflow());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    if (workflow_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWorkflow());
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
    if (!(obj instanceof com.clarifai.grpc.api.SingleWorkflowResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.SingleWorkflowResponse other = (com.clarifai.grpc.api.SingleWorkflowResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (hasWorkflow() != other.hasWorkflow()) return false;
    if (hasWorkflow()) {
      if (!getWorkflow()
          .equals(other.getWorkflow())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (hasWorkflow()) {
      hash = (37 * hash) + WORKFLOW_FIELD_NUMBER;
      hash = (53 * hash) + getWorkflow().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleWorkflowResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.SingleWorkflowResponse prototype) {
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
   * Protobuf type {@code clarifai.api.SingleWorkflowResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.SingleWorkflowResponse)
      com.clarifai.grpc.api.SingleWorkflowResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleWorkflowResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleWorkflowResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.SingleWorkflowResponse.class, com.clarifai.grpc.api.SingleWorkflowResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.SingleWorkflowResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (workflowBuilder_ == null) {
        workflow_ = null;
      } else {
        workflow_ = null;
        workflowBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleWorkflowResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleWorkflowResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.SingleWorkflowResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleWorkflowResponse build() {
      com.clarifai.grpc.api.SingleWorkflowResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleWorkflowResponse buildPartial() {
      com.clarifai.grpc.api.SingleWorkflowResponse result = new com.clarifai.grpc.api.SingleWorkflowResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (workflowBuilder_ == null) {
        result.workflow_ = workflow_;
      } else {
        result.workflow_ = workflowBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.SingleWorkflowResponse) {
        return mergeFrom((com.clarifai.grpc.api.SingleWorkflowResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.SingleWorkflowResponse other) {
      if (other == com.clarifai.grpc.api.SingleWorkflowResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasWorkflow()) {
        mergeWorkflow(other.getWorkflow());
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
      com.clarifai.grpc.api.SingleWorkflowResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.SingleWorkflowResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.clarifai.grpc.api.status.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder> statusBuilder_;
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder setStatus(com.clarifai.grpc.api.status.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder setStatus(
        com.clarifai.grpc.api.status.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder mergeStatus(com.clarifai.grpc.api.status.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.clarifai.grpc.api.status.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private com.clarifai.grpc.api.Workflow workflow_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Workflow, com.clarifai.grpc.api.Workflow.Builder, com.clarifai.grpc.api.WorkflowOrBuilder> workflowBuilder_;
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public boolean hasWorkflow() {
      return workflowBuilder_ != null || workflow_ != null;
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public com.clarifai.grpc.api.Workflow getWorkflow() {
      if (workflowBuilder_ == null) {
        return workflow_ == null ? com.clarifai.grpc.api.Workflow.getDefaultInstance() : workflow_;
      } else {
        return workflowBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public Builder setWorkflow(com.clarifai.grpc.api.Workflow value) {
      if (workflowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workflow_ = value;
        onChanged();
      } else {
        workflowBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public Builder setWorkflow(
        com.clarifai.grpc.api.Workflow.Builder builderForValue) {
      if (workflowBuilder_ == null) {
        workflow_ = builderForValue.build();
        onChanged();
      } else {
        workflowBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public Builder mergeWorkflow(com.clarifai.grpc.api.Workflow value) {
      if (workflowBuilder_ == null) {
        if (workflow_ != null) {
          workflow_ =
            com.clarifai.grpc.api.Workflow.newBuilder(workflow_).mergeFrom(value).buildPartial();
        } else {
          workflow_ = value;
        }
        onChanged();
      } else {
        workflowBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public Builder clearWorkflow() {
      if (workflowBuilder_ == null) {
        workflow_ = null;
        onChanged();
      } else {
        workflow_ = null;
        workflowBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public com.clarifai.grpc.api.Workflow.Builder getWorkflowBuilder() {
      
      onChanged();
      return getWorkflowFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    public com.clarifai.grpc.api.WorkflowOrBuilder getWorkflowOrBuilder() {
      if (workflowBuilder_ != null) {
        return workflowBuilder_.getMessageOrBuilder();
      } else {
        return workflow_ == null ?
            com.clarifai.grpc.api.Workflow.getDefaultInstance() : workflow_;
      }
    }
    /**
     * <code>.clarifai.api.Workflow workflow = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Workflow, com.clarifai.grpc.api.Workflow.Builder, com.clarifai.grpc.api.WorkflowOrBuilder> 
        getWorkflowFieldBuilder() {
      if (workflowBuilder_ == null) {
        workflowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Workflow, com.clarifai.grpc.api.Workflow.Builder, com.clarifai.grpc.api.WorkflowOrBuilder>(
                getWorkflow(),
                getParentForChildren(),
                isClean());
        workflow_ = null;
      }
      return workflowBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.SingleWorkflowResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.SingleWorkflowResponse)
  private static final com.clarifai.grpc.api.SingleWorkflowResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.SingleWorkflowResponse();
  }

  public static com.clarifai.grpc.api.SingleWorkflowResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SingleWorkflowResponse>
      PARSER = new com.google.protobuf.AbstractParser<SingleWorkflowResponse>() {
    @java.lang.Override
    public SingleWorkflowResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SingleWorkflowResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SingleWorkflowResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SingleWorkflowResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.SingleWorkflowResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
