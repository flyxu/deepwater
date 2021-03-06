// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/cost_graph.proto

package org.tensorflow.framework;

public final class CostGraphProtos {
  private CostGraphProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CostGraphDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_CostGraphDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CostGraphDef_Node_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_CostGraphDef_Node_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CostGraphDef_Node_InputInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_CostGraphDef_Node_InputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CostGraphDef_Node_OutputInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_CostGraphDef_Node_OutputInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow/core/framework/cost_graph.p" +
      "roto\022\ntensorflow\"\245\003\n\014CostGraphDef\022+\n\004nod" +
      "e\030\001 \003(\0132\035.tensorflow.CostGraphDef.Node\032\347" +
      "\002\n\004Node\022\014\n\004name\030\001 \001(\t\022\016\n\006device\030\002 \001(\t\022\n\n" +
      "\002id\030\003 \001(\005\022;\n\ninput_info\030\004 \003(\0132\'.tensorfl" +
      "ow.CostGraphDef.Node.InputInfo\022=\n\013output" +
      "_info\030\005 \003(\0132(.tensorflow.CostGraphDef.No" +
      "de.OutputInfo\022\035\n\025temporary_memory_size\030\006" +
      " \001(\003\022\020\n\010is_final\030\007 \001(\010\022\025\n\rcontrol_input\030" +
      "\010 \003(\005\032;\n\tInputInfo\022\026\n\016preceding_node\030\001 \001",
      "(\005\022\026\n\016preceding_port\030\002 \001(\005\0324\n\nOutputInfo" +
      "\022\014\n\004size\030\001 \001(\003\022\030\n\020alias_input_port\030\002 \001(\003" +
      "B0\n\030org.tensorflow.frameworkB\017CostGraphP" +
      "rotosP\001\370\001\001b\006proto3"
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
        }, assigner);
    internal_static_tensorflow_CostGraphDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_CostGraphDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_CostGraphDef_descriptor,
        new java.lang.String[] { "Node", });
    internal_static_tensorflow_CostGraphDef_Node_descriptor =
      internal_static_tensorflow_CostGraphDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_CostGraphDef_Node_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_CostGraphDef_Node_descriptor,
        new java.lang.String[] { "Name", "Device", "Id", "InputInfo", "OutputInfo", "TemporaryMemorySize", "IsFinal", "ControlInput", });
    internal_static_tensorflow_CostGraphDef_Node_InputInfo_descriptor =
      internal_static_tensorflow_CostGraphDef_Node_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_CostGraphDef_Node_InputInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_CostGraphDef_Node_InputInfo_descriptor,
        new java.lang.String[] { "PrecedingNode", "PrecedingPort", });
    internal_static_tensorflow_CostGraphDef_Node_OutputInfo_descriptor =
      internal_static_tensorflow_CostGraphDef_Node_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_CostGraphDef_Node_OutputInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_CostGraphDef_Node_OutputInfo_descriptor,
        new java.lang.String[] { "Size", "AliasInputPort", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
