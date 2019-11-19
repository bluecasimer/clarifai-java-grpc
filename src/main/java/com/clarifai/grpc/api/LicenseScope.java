// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.LicenseScope}
 */
public enum LicenseScope
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LICENSE_SCOPE_NOT_SET = 0;</code>
   */
  LICENSE_SCOPE_NOT_SET(0),
  /**
   * <code>PREDICT = 1;</code>
   */
  PREDICT(1),
  /**
   * <code>TRAIN = 2;</code>
   */
  TRAIN(2),
  /**
   * <code>SEARCH = 3;</code>
   */
  SEARCH(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LICENSE_SCOPE_NOT_SET = 0;</code>
   */
  public static final int LICENSE_SCOPE_NOT_SET_VALUE = 0;
  /**
   * <code>PREDICT = 1;</code>
   */
  public static final int PREDICT_VALUE = 1;
  /**
   * <code>TRAIN = 2;</code>
   */
  public static final int TRAIN_VALUE = 2;
  /**
   * <code>SEARCH = 3;</code>
   */
  public static final int SEARCH_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LicenseScope valueOf(int value) {
    return forNumber(value);
  }

  public static LicenseScope forNumber(int value) {
    switch (value) {
      case 0: return LICENSE_SCOPE_NOT_SET;
      case 1: return PREDICT;
      case 2: return TRAIN;
      case 3: return SEARCH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LicenseScope>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LicenseScope> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LicenseScope>() {
          public LicenseScope findValueByNumber(int number) {
            return LicenseScope.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(3);
  }

  private static final LicenseScope[] VALUES = values();

  public static LicenseScope valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LicenseScope(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.LicenseScope)
}
