// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * NOTE(Janvier): We copy this from proto/utils/lopq_service.proto instead of importing it because
 * we should not import internal protos in public protos.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.LOPQEvalResult}
 */
public  final class LOPQEvalResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.LOPQEvalResult)
    LOPQEvalResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LOPQEvalResult.newBuilder() to construct.
  private LOPQEvalResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LOPQEvalResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LOPQEvalResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LOPQEvalResult(
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
          case 8: {

            k_ = input.readInt32();
            break;
          }
          case 21: {

            recallVsBruteForce_ = input.readFloat();
            break;
          }
          case 29: {

            kendallTauVsBruteForce_ = input.readFloat();
            break;
          }
          case 37: {

            mostFrequentCodePercent_ = input.readFloat();
            break;
          }
          case 45: {

            lopqNdcg_ = input.readFloat();
            break;
          }
          case 53: {

            bruteForceNdcg_ = input.readFloat();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LOPQEvalResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LOPQEvalResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.LOPQEvalResult.class, com.clarifai.grpc.api.LOPQEvalResult.Builder.class);
  }

  public static final int K_FIELD_NUMBER = 1;
  private int k_;
  /**
   * <pre>
   * Rank k for which all metrics are reported.
   * </pre>
   *
   * <code>int32 k = 1;</code>
   */
  public int getK() {
    return k_;
  }

  public static final int RECALL_VS_BRUTE_FORCE_FIELD_NUMBER = 2;
  private float recallVsBruteForce_;
  /**
   * <pre>
   * Recall &#64; k assuming the brute force search is the ground truth.
   * </pre>
   *
   * <code>float recall_vs_brute_force = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getRecallVsBruteForce() {
    return recallVsBruteForce_;
  }

  public static final int KENDALL_TAU_VS_BRUTE_FORCE_FIELD_NUMBER = 3;
  private float kendallTauVsBruteForce_;
  /**
   * <pre>
   * Kendall's tau correlation &#64; k assuming the brute force search is the ground truth.
   * </pre>
   *
   * <code>float kendall_tau_vs_brute_force = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getKendallTauVsBruteForce() {
    return kendallTauVsBruteForce_;
  }

  public static final int MOST_FREQUENT_CODE_PERCENT_FIELD_NUMBER = 4;
  private float mostFrequentCodePercent_;
  /**
   * <pre>
   * The percentage of the most frequent code in the indexed part of evaluation data.
   * </pre>
   *
   * <code>float most_frequent_code_percent = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getMostFrequentCodePercent() {
    return mostFrequentCodePercent_;
  }

  public static final int LOPQ_NDCG_FIELD_NUMBER = 5;
  private float lopqNdcg_;
  /**
   * <pre>
   * Normalized Discounted Cumulative Gain (NDCG) &#64; k with a ground truth inferred from annotations
   * and/or prediction for this evaluation LOPQ model.
   * NDCG uses individual relevance scores of each returned image to evaluate the usefulness, or
   * gain, of a document based on its position in the result list. The premise of DCG is that
   * highly relevant documents appearing lower in a search result list should be penalized as the
   * graded relevance value is reduced logarithmically proportional to the position of the result.
   * See: https://en.wikipedia.org/wiki/Information_retrieval#Discounted_cumulative_gain
   * To compute the relevance score between two images we consider two cases:
   * 1) Only one label for each image
   * An image is relevant to an image query iff they are labeled the same (score 1), and
   * not relevant otherwise (score 0)
   * 2) Multiple labels for each image
   * Here an image relevancy with respect to a single image query is measured by f-beta score
   * assuming the query image list of labels as ground truth and comparing them with that of
   * the search result. These labels can come from image annotations or if substitute_annotation_misses
   * is set, predictions of base classifier where any prediction with prob &lt; prob_threshold are
   * discarded. To quantify the relevancy score of a single search result we opt to compute precision
   * and recall &#64; k for simplicity, and combine them with f-beta score to obtain a single number.
   * </pre>
   *
   * <code>float lopq_ndcg = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getLopqNdcg() {
    return lopqNdcg_;
  }

  public static final int BRUTE_FORCE_NDCG_FIELD_NUMBER = 6;
  private float bruteForceNdcg_;
  /**
   * <pre>
   * Brute force NDCG which gives a baseline to compare to and is a measure of how good
   * the embeddings are.
   * </pre>
   *
   * <code>float brute_force_ndcg = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getBruteForceNdcg() {
    return bruteForceNdcg_;
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
    if (k_ != 0) {
      output.writeInt32(1, k_);
    }
    if (recallVsBruteForce_ != 0F) {
      output.writeFloat(2, recallVsBruteForce_);
    }
    if (kendallTauVsBruteForce_ != 0F) {
      output.writeFloat(3, kendallTauVsBruteForce_);
    }
    if (mostFrequentCodePercent_ != 0F) {
      output.writeFloat(4, mostFrequentCodePercent_);
    }
    if (lopqNdcg_ != 0F) {
      output.writeFloat(5, lopqNdcg_);
    }
    if (bruteForceNdcg_ != 0F) {
      output.writeFloat(6, bruteForceNdcg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (k_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, k_);
    }
    if (recallVsBruteForce_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, recallVsBruteForce_);
    }
    if (kendallTauVsBruteForce_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, kendallTauVsBruteForce_);
    }
    if (mostFrequentCodePercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, mostFrequentCodePercent_);
    }
    if (lopqNdcg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, lopqNdcg_);
    }
    if (bruteForceNdcg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, bruteForceNdcg_);
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
    if (!(obj instanceof com.clarifai.grpc.api.LOPQEvalResult)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.LOPQEvalResult other = (com.clarifai.grpc.api.LOPQEvalResult) obj;

    if (getK()
        != other.getK()) return false;
    if (java.lang.Float.floatToIntBits(getRecallVsBruteForce())
        != java.lang.Float.floatToIntBits(
            other.getRecallVsBruteForce())) return false;
    if (java.lang.Float.floatToIntBits(getKendallTauVsBruteForce())
        != java.lang.Float.floatToIntBits(
            other.getKendallTauVsBruteForce())) return false;
    if (java.lang.Float.floatToIntBits(getMostFrequentCodePercent())
        != java.lang.Float.floatToIntBits(
            other.getMostFrequentCodePercent())) return false;
    if (java.lang.Float.floatToIntBits(getLopqNdcg())
        != java.lang.Float.floatToIntBits(
            other.getLopqNdcg())) return false;
    if (java.lang.Float.floatToIntBits(getBruteForceNdcg())
        != java.lang.Float.floatToIntBits(
            other.getBruteForceNdcg())) return false;
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
    hash = (37 * hash) + K_FIELD_NUMBER;
    hash = (53 * hash) + getK();
    hash = (37 * hash) + RECALL_VS_BRUTE_FORCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRecallVsBruteForce());
    hash = (37 * hash) + KENDALL_TAU_VS_BRUTE_FORCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getKendallTauVsBruteForce());
    hash = (37 * hash) + MOST_FREQUENT_CODE_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMostFrequentCodePercent());
    hash = (37 * hash) + LOPQ_NDCG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLopqNdcg());
    hash = (37 * hash) + BRUTE_FORCE_NDCG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBruteForceNdcg());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LOPQEvalResult parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.LOPQEvalResult prototype) {
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
   * NOTE(Janvier): We copy this from proto/utils/lopq_service.proto instead of importing it because
   * we should not import internal protos in public protos.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.LOPQEvalResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.LOPQEvalResult)
      com.clarifai.grpc.api.LOPQEvalResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LOPQEvalResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LOPQEvalResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.LOPQEvalResult.class, com.clarifai.grpc.api.LOPQEvalResult.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.LOPQEvalResult.newBuilder()
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
      k_ = 0;

      recallVsBruteForce_ = 0F;

      kendallTauVsBruteForce_ = 0F;

      mostFrequentCodePercent_ = 0F;

      lopqNdcg_ = 0F;

      bruteForceNdcg_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LOPQEvalResult_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LOPQEvalResult getDefaultInstanceForType() {
      return com.clarifai.grpc.api.LOPQEvalResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LOPQEvalResult build() {
      com.clarifai.grpc.api.LOPQEvalResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LOPQEvalResult buildPartial() {
      com.clarifai.grpc.api.LOPQEvalResult result = new com.clarifai.grpc.api.LOPQEvalResult(this);
      result.k_ = k_;
      result.recallVsBruteForce_ = recallVsBruteForce_;
      result.kendallTauVsBruteForce_ = kendallTauVsBruteForce_;
      result.mostFrequentCodePercent_ = mostFrequentCodePercent_;
      result.lopqNdcg_ = lopqNdcg_;
      result.bruteForceNdcg_ = bruteForceNdcg_;
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
      if (other instanceof com.clarifai.grpc.api.LOPQEvalResult) {
        return mergeFrom((com.clarifai.grpc.api.LOPQEvalResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.LOPQEvalResult other) {
      if (other == com.clarifai.grpc.api.LOPQEvalResult.getDefaultInstance()) return this;
      if (other.getK() != 0) {
        setK(other.getK());
      }
      if (other.getRecallVsBruteForce() != 0F) {
        setRecallVsBruteForce(other.getRecallVsBruteForce());
      }
      if (other.getKendallTauVsBruteForce() != 0F) {
        setKendallTauVsBruteForce(other.getKendallTauVsBruteForce());
      }
      if (other.getMostFrequentCodePercent() != 0F) {
        setMostFrequentCodePercent(other.getMostFrequentCodePercent());
      }
      if (other.getLopqNdcg() != 0F) {
        setLopqNdcg(other.getLopqNdcg());
      }
      if (other.getBruteForceNdcg() != 0F) {
        setBruteForceNdcg(other.getBruteForceNdcg());
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
      com.clarifai.grpc.api.LOPQEvalResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.LOPQEvalResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int k_ ;
    /**
     * <pre>
     * Rank k for which all metrics are reported.
     * </pre>
     *
     * <code>int32 k = 1;</code>
     */
    public int getK() {
      return k_;
    }
    /**
     * <pre>
     * Rank k for which all metrics are reported.
     * </pre>
     *
     * <code>int32 k = 1;</code>
     */
    public Builder setK(int value) {
      
      k_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rank k for which all metrics are reported.
     * </pre>
     *
     * <code>int32 k = 1;</code>
     */
    public Builder clearK() {
      
      k_ = 0;
      onChanged();
      return this;
    }

    private float recallVsBruteForce_ ;
    /**
     * <pre>
     * Recall &#64; k assuming the brute force search is the ground truth.
     * </pre>
     *
     * <code>float recall_vs_brute_force = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getRecallVsBruteForce() {
      return recallVsBruteForce_;
    }
    /**
     * <pre>
     * Recall &#64; k assuming the brute force search is the ground truth.
     * </pre>
     *
     * <code>float recall_vs_brute_force = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setRecallVsBruteForce(float value) {
      
      recallVsBruteForce_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Recall &#64; k assuming the brute force search is the ground truth.
     * </pre>
     *
     * <code>float recall_vs_brute_force = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearRecallVsBruteForce() {
      
      recallVsBruteForce_ = 0F;
      onChanged();
      return this;
    }

    private float kendallTauVsBruteForce_ ;
    /**
     * <pre>
     * Kendall's tau correlation &#64; k assuming the brute force search is the ground truth.
     * </pre>
     *
     * <code>float kendall_tau_vs_brute_force = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getKendallTauVsBruteForce() {
      return kendallTauVsBruteForce_;
    }
    /**
     * <pre>
     * Kendall's tau correlation &#64; k assuming the brute force search is the ground truth.
     * </pre>
     *
     * <code>float kendall_tau_vs_brute_force = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setKendallTauVsBruteForce(float value) {
      
      kendallTauVsBruteForce_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Kendall's tau correlation &#64; k assuming the brute force search is the ground truth.
     * </pre>
     *
     * <code>float kendall_tau_vs_brute_force = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearKendallTauVsBruteForce() {
      
      kendallTauVsBruteForce_ = 0F;
      onChanged();
      return this;
    }

    private float mostFrequentCodePercent_ ;
    /**
     * <pre>
     * The percentage of the most frequent code in the indexed part of evaluation data.
     * </pre>
     *
     * <code>float most_frequent_code_percent = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getMostFrequentCodePercent() {
      return mostFrequentCodePercent_;
    }
    /**
     * <pre>
     * The percentage of the most frequent code in the indexed part of evaluation data.
     * </pre>
     *
     * <code>float most_frequent_code_percent = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setMostFrequentCodePercent(float value) {
      
      mostFrequentCodePercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The percentage of the most frequent code in the indexed part of evaluation data.
     * </pre>
     *
     * <code>float most_frequent_code_percent = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearMostFrequentCodePercent() {
      
      mostFrequentCodePercent_ = 0F;
      onChanged();
      return this;
    }

    private float lopqNdcg_ ;
    /**
     * <pre>
     * Normalized Discounted Cumulative Gain (NDCG) &#64; k with a ground truth inferred from annotations
     * and/or prediction for this evaluation LOPQ model.
     * NDCG uses individual relevance scores of each returned image to evaluate the usefulness, or
     * gain, of a document based on its position in the result list. The premise of DCG is that
     * highly relevant documents appearing lower in a search result list should be penalized as the
     * graded relevance value is reduced logarithmically proportional to the position of the result.
     * See: https://en.wikipedia.org/wiki/Information_retrieval#Discounted_cumulative_gain
     * To compute the relevance score between two images we consider two cases:
     * 1) Only one label for each image
     * An image is relevant to an image query iff they are labeled the same (score 1), and
     * not relevant otherwise (score 0)
     * 2) Multiple labels for each image
     * Here an image relevancy with respect to a single image query is measured by f-beta score
     * assuming the query image list of labels as ground truth and comparing them with that of
     * the search result. These labels can come from image annotations or if substitute_annotation_misses
     * is set, predictions of base classifier where any prediction with prob &lt; prob_threshold are
     * discarded. To quantify the relevancy score of a single search result we opt to compute precision
     * and recall &#64; k for simplicity, and combine them with f-beta score to obtain a single number.
     * </pre>
     *
     * <code>float lopq_ndcg = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getLopqNdcg() {
      return lopqNdcg_;
    }
    /**
     * <pre>
     * Normalized Discounted Cumulative Gain (NDCG) &#64; k with a ground truth inferred from annotations
     * and/or prediction for this evaluation LOPQ model.
     * NDCG uses individual relevance scores of each returned image to evaluate the usefulness, or
     * gain, of a document based on its position in the result list. The premise of DCG is that
     * highly relevant documents appearing lower in a search result list should be penalized as the
     * graded relevance value is reduced logarithmically proportional to the position of the result.
     * See: https://en.wikipedia.org/wiki/Information_retrieval#Discounted_cumulative_gain
     * To compute the relevance score between two images we consider two cases:
     * 1) Only one label for each image
     * An image is relevant to an image query iff they are labeled the same (score 1), and
     * not relevant otherwise (score 0)
     * 2) Multiple labels for each image
     * Here an image relevancy with respect to a single image query is measured by f-beta score
     * assuming the query image list of labels as ground truth and comparing them with that of
     * the search result. These labels can come from image annotations or if substitute_annotation_misses
     * is set, predictions of base classifier where any prediction with prob &lt; prob_threshold are
     * discarded. To quantify the relevancy score of a single search result we opt to compute precision
     * and recall &#64; k for simplicity, and combine them with f-beta score to obtain a single number.
     * </pre>
     *
     * <code>float lopq_ndcg = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setLopqNdcg(float value) {
      
      lopqNdcg_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Normalized Discounted Cumulative Gain (NDCG) &#64; k with a ground truth inferred from annotations
     * and/or prediction for this evaluation LOPQ model.
     * NDCG uses individual relevance scores of each returned image to evaluate the usefulness, or
     * gain, of a document based on its position in the result list. The premise of DCG is that
     * highly relevant documents appearing lower in a search result list should be penalized as the
     * graded relevance value is reduced logarithmically proportional to the position of the result.
     * See: https://en.wikipedia.org/wiki/Information_retrieval#Discounted_cumulative_gain
     * To compute the relevance score between two images we consider two cases:
     * 1) Only one label for each image
     * An image is relevant to an image query iff they are labeled the same (score 1), and
     * not relevant otherwise (score 0)
     * 2) Multiple labels for each image
     * Here an image relevancy with respect to a single image query is measured by f-beta score
     * assuming the query image list of labels as ground truth and comparing them with that of
     * the search result. These labels can come from image annotations or if substitute_annotation_misses
     * is set, predictions of base classifier where any prediction with prob &lt; prob_threshold are
     * discarded. To quantify the relevancy score of a single search result we opt to compute precision
     * and recall &#64; k for simplicity, and combine them with f-beta score to obtain a single number.
     * </pre>
     *
     * <code>float lopq_ndcg = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearLopqNdcg() {
      
      lopqNdcg_ = 0F;
      onChanged();
      return this;
    }

    private float bruteForceNdcg_ ;
    /**
     * <pre>
     * Brute force NDCG which gives a baseline to compare to and is a measure of how good
     * the embeddings are.
     * </pre>
     *
     * <code>float brute_force_ndcg = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getBruteForceNdcg() {
      return bruteForceNdcg_;
    }
    /**
     * <pre>
     * Brute force NDCG which gives a baseline to compare to and is a measure of how good
     * the embeddings are.
     * </pre>
     *
     * <code>float brute_force_ndcg = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setBruteForceNdcg(float value) {
      
      bruteForceNdcg_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Brute force NDCG which gives a baseline to compare to and is a measure of how good
     * the embeddings are.
     * </pre>
     *
     * <code>float brute_force_ndcg = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearBruteForceNdcg() {
      
      bruteForceNdcg_ = 0F;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.LOPQEvalResult)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.LOPQEvalResult)
  private static final com.clarifai.grpc.api.LOPQEvalResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.LOPQEvalResult();
  }

  public static com.clarifai.grpc.api.LOPQEvalResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LOPQEvalResult>
      PARSER = new com.google.protobuf.AbstractParser<LOPQEvalResult>() {
    @java.lang.Override
    public LOPQEvalResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LOPQEvalResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LOPQEvalResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LOPQEvalResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.LOPQEvalResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
