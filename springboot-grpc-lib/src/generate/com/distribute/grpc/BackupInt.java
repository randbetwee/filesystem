// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backup.proto

package com.distribute.grpc;

public final class BackupInt {
  private BackupInt() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransferRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransferResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransferResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransferStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransferStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014backup.proto\"-\n\017TransferRequest\022\014\n\004pat" +
      "h\030\001 \001(\t\022\014\n\004time\030\002 \001(\004\"1\n\020TransferRespons" +
      "e\022\014\n\004path\030\001 \001(\t\022\017\n\007content\030\002 \001(\014\" \n\016Tran" +
      "sferStatus\022\016\n\006status\030\001 \001(\0102\224\001\n\rBackupSer" +
      "vice\022)\n\004pull\022\020.TransferRequest\032\017.Transfe" +
      "rStatus\022+\n\004push\022\021.TransferResponse\032\020.Tra" +
      "nsferRequest\022+\n\006delete\022\020.TransferRequest" +
      "\032\017.TransferStatusB%\n\023com.distribute.grpc" +
      "B\tBackupIntP\001\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TransferRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TransferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransferRequest_descriptor,
        new java.lang.String[] { "Path", "Time", });
    internal_static_TransferResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TransferResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransferResponse_descriptor,
        new java.lang.String[] { "Path", "Content", });
    internal_static_TransferStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TransferStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransferStatus_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}