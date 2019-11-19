// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.UsageIntervalType}
 */
public enum UsageIntervalType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * undef UsageIntervalType is so that the interval field can be forced to be included
   * </pre>
   *
   * <code>undef = 0;</code>
   */
  undef(0),
  /**
   * <code>day = 1;</code>
   */
  day(1),
  /**
   * <code>month = 2;</code>
   */
  month(2),
  /**
   * <code>year = 3;</code>
   */
  year(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * undef UsageIntervalType is so that the interval field can be forced to be included
   * </pre>
   *
   * <code>undef = 0;</code>
   */
  public static final int undef_VALUE = 0;
  /**
   * <code>day = 1;</code>
   */
  public static final int day_VALUE = 1;
  /**
   * <code>month = 2;</code>
   */
  public static final int month_VALUE = 2;
  /**
   * <code>year = 3;</code>
   */
  public static final int year_VALUE = 3;


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
  public static UsageIntervalType valueOf(int value) {
    return forNumber(value);
  }

  public static UsageIntervalType forNumber(int value) {
    switch (value) {
      case 0: return undef;
      case 1: return day;
      case 2: return month;
      case 3: return year;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UsageIntervalType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UsageIntervalType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UsageIntervalType>() {
          public UsageIntervalType findValueByNumber(int number) {
            return UsageIntervalType.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(6);
  }

  private static final UsageIntervalType[] VALUES = values();

  public static UsageIntervalType valueOf(
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

  private UsageIntervalType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.UsageIntervalType)
}
