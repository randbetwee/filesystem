// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file.proto

package com.distribute.grpc;

public interface FileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes content = 1;</code>
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <code>int32 lock = 2;</code>
   * @return The lock.
   */
  int getLock();
}
