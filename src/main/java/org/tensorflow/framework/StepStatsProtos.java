// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/step_stats.proto

package org.tensorflow.framework;

public final class StepStatsProtos {
  private StepStatsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NodeOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_NodeOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NodeExecStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_NodeExecStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DeviceStepStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_DeviceStepStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_StepStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_StepStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow/core/framework/step_stats.p" +
      "roto\022\ntensorflow\0326tensorflow/core/framew" +
      "ork/allocation_description.proto\0322tensor" +
      "flow/core/framework/tensor_description.p" +
      "roto\"V\n\023AllocatorMemoryUsed\022\026\n\016allocator" +
      "_name\030\001 \001(\t\022\023\n\013total_bytes\030\002 \001(\003\022\022\n\npeak" +
      "_bytes\030\003 \001(\003\"U\n\nNodeOutput\022\014\n\004slot\030\001 \001(\005" +
      "\0229\n\022tensor_description\030\003 \001(\0132\035.tensorflo" +
      "w.TensorDescription\"\354\002\n\rNodeExecStats\022\021\n" +
      "\tnode_name\030\001 \001(\t\022\030\n\020all_start_micros\030\002 \001",
      "(\003\022\033\n\023op_start_rel_micros\030\003 \001(\003\022\031\n\021op_en" +
      "d_rel_micros\030\004 \001(\003\022\032\n\022all_end_rel_micros" +
      "\030\005 \001(\003\022/\n\006memory\030\006 \003(\0132\037.tensorflow.Allo" +
      "catorMemoryUsed\022&\n\006output\030\007 \003(\0132\026.tensor" +
      "flow.NodeOutput\022\026\n\016timeline_label\030\010 \001(\t\022" +
      "\030\n\020scheduled_micros\030\t \001(\003\022\021\n\tthread_id\030\n" +
      " \001(\r\022<\n\021referenced_tensor\030\013 \003(\0132!.tensor" +
      "flow.AllocationDescription\"P\n\017DeviceStep" +
      "Stats\022\016\n\006device\030\001 \001(\t\022-\n\nnode_stats\030\002 \003(" +
      "\0132\031.tensorflow.NodeExecStats\";\n\tStepStat",
      "s\022.\n\tdev_stats\030\001 \003(\0132\033.tensorflow.Device" +
      "StepStatsB0\n\030org.tensorflow.frameworkB\017S" +
      "tepStatsProtosP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.AllocationDescriptionProtos.getDescriptor(),
          org.tensorflow.framework.TensorDescriptionProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_AllocatorMemoryUsed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_AllocatorMemoryUsed_descriptor,
        new java.lang.String[] { "AllocatorName", "TotalBytes", "PeakBytes", });
    internal_static_tensorflow_NodeOutput_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_NodeOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_NodeOutput_descriptor,
        new java.lang.String[] { "Slot", "TensorDescription", });
    internal_static_tensorflow_NodeExecStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_NodeExecStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_NodeExecStats_descriptor,
        new java.lang.String[] { "NodeName", "AllStartMicros", "OpStartRelMicros", "OpEndRelMicros", "AllEndRelMicros", "Memory", "Output", "TimelineLabel", "ScheduledMicros", "ThreadId", "ReferencedTensor", });
    internal_static_tensorflow_DeviceStepStats_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_DeviceStepStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_DeviceStepStats_descriptor,
        new java.lang.String[] { "Device", "NodeStats", });
    internal_static_tensorflow_StepStats_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_StepStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_StepStats_descriptor,
        new java.lang.String[] { "DevStats", });
    org.tensorflow.framework.AllocationDescriptionProtos.getDescriptor();
    org.tensorflow.framework.TensorDescriptionProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
