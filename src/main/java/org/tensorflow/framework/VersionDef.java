// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/versions.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Version information for a piece of serialized data
 * There are different types of versions for each type of data
 * (GraphDef, etc.), but they all have the same common shape
 * described here.
 * Each consumer has "consumer" and "min_producer" versions (specified
 * elsewhere).  A consumer is allowed to consume this data if
 *   producer &gt;= min_producer
 *   consumer &gt;= min_consumer
 *   consumer not in bad_consumers
 * </pre>
 *
 * Protobuf type {@code tensorflow.VersionDef}
 */
public  final class VersionDef extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tensorflow.VersionDef)
    VersionDefOrBuilder {
  // Use VersionDef.newBuilder() to construct.
  private VersionDef(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private VersionDef() {
    producer_ = 0;
    minConsumer_ = 0;
    badConsumers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VersionDef(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            producer_ = input.readInt32();
            break;
          }
          case 16: {

            minConsumer_ = input.readInt32();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              badConsumers_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000004;
            }
            badConsumers_.add(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
              badConsumers_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              badConsumers_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        badConsumers_ = java.util.Collections.unmodifiableList(badConsumers_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.VersionDef.class, org.tensorflow.framework.VersionDef.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCER_FIELD_NUMBER = 1;
  private int producer_;
  /**
   * <pre>
   * The version of the code that produced this data.
   * </pre>
   *
   * <code>optional int32 producer = 1;</code>
   */
  public int getProducer() {
    return producer_;
  }

  public static final int MIN_CONSUMER_FIELD_NUMBER = 2;
  private int minConsumer_;
  /**
   * <pre>
   * Any consumer below this version is not allowed to consume this data.
   * </pre>
   *
   * <code>optional int32 min_consumer = 2;</code>
   */
  public int getMinConsumer() {
    return minConsumer_;
  }

  public static final int BAD_CONSUMERS_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> badConsumers_;
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  public java.util.List<java.lang.Integer>
      getBadConsumersList() {
    return badConsumers_;
  }
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  public int getBadConsumersCount() {
    return badConsumers_.size();
  }
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  public int getBadConsumers(int index) {
    return badConsumers_.get(index);
  }
  private int badConsumersMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (producer_ != 0) {
      output.writeInt32(1, producer_);
    }
    if (minConsumer_ != 0) {
      output.writeInt32(2, minConsumer_);
    }
    if (getBadConsumersList().size() > 0) {
      output.writeRawVarint32(26);
      output.writeRawVarint32(badConsumersMemoizedSerializedSize);
    }
    for (int i = 0; i < badConsumers_.size(); i++) {
      output.writeInt32NoTag(badConsumers_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (producer_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, producer_);
    }
    if (minConsumer_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minConsumer_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < badConsumers_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(badConsumers_.get(i));
      }
      size += dataSize;
      if (!getBadConsumersList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      badConsumersMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static org.tensorflow.framework.VersionDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VersionDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VersionDef parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.VersionDef prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Version information for a piece of serialized data
   * There are different types of versions for each type of data
   * (GraphDef, etc.), but they all have the same common shape
   * described here.
   * Each consumer has "consumer" and "min_producer" versions (specified
   * elsewhere).  A consumer is allowed to consume this data if
   *   producer &gt;= min_producer
   *   consumer &gt;= min_consumer
   *   consumer not in bad_consumers
   * </pre>
   *
   * Protobuf type {@code tensorflow.VersionDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.VersionDef)
      org.tensorflow.framework.VersionDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.VersionDef.class, org.tensorflow.framework.VersionDef.Builder.class);
    }

    // Construct using org.tensorflow.framework.VersionDef.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      producer_ = 0;

      minConsumer_ = 0;

      badConsumers_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.VersionsProtos.internal_static_tensorflow_VersionDef_descriptor;
    }

    public org.tensorflow.framework.VersionDef getDefaultInstanceForType() {
      return org.tensorflow.framework.VersionDef.getDefaultInstance();
    }

    public org.tensorflow.framework.VersionDef build() {
      org.tensorflow.framework.VersionDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.VersionDef buildPartial() {
      org.tensorflow.framework.VersionDef result = new org.tensorflow.framework.VersionDef(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.producer_ = producer_;
      result.minConsumer_ = minConsumer_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        badConsumers_ = java.util.Collections.unmodifiableList(badConsumers_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.badConsumers_ = badConsumers_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.VersionDef) {
        return mergeFrom((org.tensorflow.framework.VersionDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.VersionDef other) {
      if (other == org.tensorflow.framework.VersionDef.getDefaultInstance()) return this;
      if (other.getProducer() != 0) {
        setProducer(other.getProducer());
      }
      if (other.getMinConsumer() != 0) {
        setMinConsumer(other.getMinConsumer());
      }
      if (!other.badConsumers_.isEmpty()) {
        if (badConsumers_.isEmpty()) {
          badConsumers_ = other.badConsumers_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureBadConsumersIsMutable();
          badConsumers_.addAll(other.badConsumers_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.VersionDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.VersionDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int producer_ ;
    /**
     * <pre>
     * The version of the code that produced this data.
     * </pre>
     *
     * <code>optional int32 producer = 1;</code>
     */
    public int getProducer() {
      return producer_;
    }
    /**
     * <pre>
     * The version of the code that produced this data.
     * </pre>
     *
     * <code>optional int32 producer = 1;</code>
     */
    public Builder setProducer(int value) {
      
      producer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of the code that produced this data.
     * </pre>
     *
     * <code>optional int32 producer = 1;</code>
     */
    public Builder clearProducer() {
      
      producer_ = 0;
      onChanged();
      return this;
    }

    private int minConsumer_ ;
    /**
     * <pre>
     * Any consumer below this version is not allowed to consume this data.
     * </pre>
     *
     * <code>optional int32 min_consumer = 2;</code>
     */
    public int getMinConsumer() {
      return minConsumer_;
    }
    /**
     * <pre>
     * Any consumer below this version is not allowed to consume this data.
     * </pre>
     *
     * <code>optional int32 min_consumer = 2;</code>
     */
    public Builder setMinConsumer(int value) {
      
      minConsumer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any consumer below this version is not allowed to consume this data.
     * </pre>
     *
     * <code>optional int32 min_consumer = 2;</code>
     */
    public Builder clearMinConsumer() {
      
      minConsumer_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> badConsumers_ = java.util.Collections.emptyList();
    private void ensureBadConsumersIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        badConsumers_ = new java.util.ArrayList<java.lang.Integer>(badConsumers_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getBadConsumersList() {
      return java.util.Collections.unmodifiableList(badConsumers_);
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public int getBadConsumersCount() {
      return badConsumers_.size();
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public int getBadConsumers(int index) {
      return badConsumers_.get(index);
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder setBadConsumers(
        int index, int value) {
      ensureBadConsumersIsMutable();
      badConsumers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder addBadConsumers(int value) {
      ensureBadConsumersIsMutable();
      badConsumers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder addAllBadConsumers(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureBadConsumersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, badConsumers_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific consumer versions which are disallowed (e.g. due to bugs).
     * </pre>
     *
     * <code>repeated int32 bad_consumers = 3;</code>
     */
    public Builder clearBadConsumers() {
      badConsumers_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.VersionDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.VersionDef)
  private static final org.tensorflow.framework.VersionDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.VersionDef();
  }

  public static org.tensorflow.framework.VersionDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VersionDef>
      PARSER = new com.google.protobuf.AbstractParser<VersionDef>() {
    public VersionDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VersionDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VersionDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VersionDef> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.VersionDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

