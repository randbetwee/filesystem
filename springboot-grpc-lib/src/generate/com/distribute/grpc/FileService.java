// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file.proto

package com.distribute.grpc;

/**
 * Protobuf service {@code FileService}
 */
public  abstract class FileService
    implements com.google.protobuf.Service {
  protected FileService() {}

  public interface Interface {
    /**
     * <pre>
     *from the view of client
     * </pre>
     *
     * <code>rpc Upload(.FileRequest) returns (.FileResponse);</code>
     */
    public abstract void upload(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

    /**
     * <code>rpc Download(.FileRequestBrif) returns (.FileResponse);</code>
     */
    public abstract void download(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

    /**
     * <code>rpc Update(.FileRequest) returns (.FileResponse);</code>
     */
    public abstract void update(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

    /**
     * <code>rpc Delete(.FileRequestBrif) returns (.FileResponse);</code>
     */
    public abstract void delete(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

    /**
     * <code>rpc Commit(.FileRequestBrif) returns (.FileResponse);</code>
     */
    public abstract void commit(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new FileService() {
      @java.lang.Override
      public  void upload(
          com.google.protobuf.RpcController controller,
          com.distribute.grpc.FileRequest request,
          com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
        impl.upload(controller, request, done);
      }

      @java.lang.Override
      public  void download(
          com.google.protobuf.RpcController controller,
          com.distribute.grpc.FileRequestBrif request,
          com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
        impl.download(controller, request, done);
      }

      @java.lang.Override
      public  void update(
          com.google.protobuf.RpcController controller,
          com.distribute.grpc.FileRequest request,
          com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
        impl.update(controller, request, done);
      }

      @java.lang.Override
      public  void delete(
          com.google.protobuf.RpcController controller,
          com.distribute.grpc.FileRequestBrif request,
          com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
        impl.delete(controller, request, done);
      }

      @java.lang.Override
      public  void commit(
          com.google.protobuf.RpcController controller,
          com.distribute.grpc.FileRequestBrif request,
          com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
        impl.commit(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.upload(controller, (com.distribute.grpc.FileRequest)request);
          case 1:
            return impl.download(controller, (com.distribute.grpc.FileRequestBrif)request);
          case 2:
            return impl.update(controller, (com.distribute.grpc.FileRequest)request);
          case 3:
            return impl.delete(controller, (com.distribute.grpc.FileRequestBrif)request);
          case 4:
            return impl.commit(controller, (com.distribute.grpc.FileRequestBrif)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.distribute.grpc.FileRequest.getDefaultInstance();
          case 1:
            return com.distribute.grpc.FileRequestBrif.getDefaultInstance();
          case 2:
            return com.distribute.grpc.FileRequest.getDefaultInstance();
          case 3:
            return com.distribute.grpc.FileRequestBrif.getDefaultInstance();
          case 4:
            return com.distribute.grpc.FileRequestBrif.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.distribute.grpc.FileResponse.getDefaultInstance();
          case 1:
            return com.distribute.grpc.FileResponse.getDefaultInstance();
          case 2:
            return com.distribute.grpc.FileResponse.getDefaultInstance();
          case 3:
            return com.distribute.grpc.FileResponse.getDefaultInstance();
          case 4:
            return com.distribute.grpc.FileResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   *from the view of client
   * </pre>
   *
   * <code>rpc Upload(.FileRequest) returns (.FileResponse);</code>
   */
  public abstract void upload(
      com.google.protobuf.RpcController controller,
      com.distribute.grpc.FileRequest request,
      com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

  /**
   * <code>rpc Download(.FileRequestBrif) returns (.FileResponse);</code>
   */
  public abstract void download(
      com.google.protobuf.RpcController controller,
      com.distribute.grpc.FileRequestBrif request,
      com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

  /**
   * <code>rpc Update(.FileRequest) returns (.FileResponse);</code>
   */
  public abstract void update(
      com.google.protobuf.RpcController controller,
      com.distribute.grpc.FileRequest request,
      com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

  /**
   * <code>rpc Delete(.FileRequestBrif) returns (.FileResponse);</code>
   */
  public abstract void delete(
      com.google.protobuf.RpcController controller,
      com.distribute.grpc.FileRequestBrif request,
      com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

  /**
   * <code>rpc Commit(.FileRequestBrif) returns (.FileResponse);</code>
   */
  public abstract void commit(
      com.google.protobuf.RpcController controller,
      com.distribute.grpc.FileRequestBrif request,
      com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.distribute.grpc.fileInt.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.upload(controller, (com.distribute.grpc.FileRequest)request,
          com.google.protobuf.RpcUtil.<com.distribute.grpc.FileResponse>specializeCallback(
            done));
        return;
      case 1:
        this.download(controller, (com.distribute.grpc.FileRequestBrif)request,
          com.google.protobuf.RpcUtil.<com.distribute.grpc.FileResponse>specializeCallback(
            done));
        return;
      case 2:
        this.update(controller, (com.distribute.grpc.FileRequest)request,
          com.google.protobuf.RpcUtil.<com.distribute.grpc.FileResponse>specializeCallback(
            done));
        return;
      case 3:
        this.delete(controller, (com.distribute.grpc.FileRequestBrif)request,
          com.google.protobuf.RpcUtil.<com.distribute.grpc.FileResponse>specializeCallback(
            done));
        return;
      case 4:
        this.commit(controller, (com.distribute.grpc.FileRequestBrif)request,
          com.google.protobuf.RpcUtil.<com.distribute.grpc.FileResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.distribute.grpc.FileRequest.getDefaultInstance();
      case 1:
        return com.distribute.grpc.FileRequestBrif.getDefaultInstance();
      case 2:
        return com.distribute.grpc.FileRequest.getDefaultInstance();
      case 3:
        return com.distribute.grpc.FileRequestBrif.getDefaultInstance();
      case 4:
        return com.distribute.grpc.FileRequestBrif.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.distribute.grpc.FileResponse.getDefaultInstance();
      case 1:
        return com.distribute.grpc.FileResponse.getDefaultInstance();
      case 2:
        return com.distribute.grpc.FileResponse.getDefaultInstance();
      case 3:
        return com.distribute.grpc.FileResponse.getDefaultInstance();
      case 4:
        return com.distribute.grpc.FileResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.distribute.grpc.FileService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void upload(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.distribute.grpc.FileResponse.class,
          com.distribute.grpc.FileResponse.getDefaultInstance()));
    }

    public  void download(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.distribute.grpc.FileResponse.class,
          com.distribute.grpc.FileResponse.getDefaultInstance()));
    }

    public  void update(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.distribute.grpc.FileResponse.class,
          com.distribute.grpc.FileResponse.getDefaultInstance()));
    }

    public  void delete(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.distribute.grpc.FileResponse.class,
          com.distribute.grpc.FileResponse.getDefaultInstance()));
    }

    public  void commit(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request,
        com.google.protobuf.RpcCallback<com.distribute.grpc.FileResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.distribute.grpc.FileResponse.class,
          com.distribute.grpc.FileResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.distribute.grpc.FileResponse upload(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request)
        throws com.google.protobuf.ServiceException;

    public com.distribute.grpc.FileResponse download(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request)
        throws com.google.protobuf.ServiceException;

    public com.distribute.grpc.FileResponse update(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request)
        throws com.google.protobuf.ServiceException;

    public com.distribute.grpc.FileResponse delete(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request)
        throws com.google.protobuf.ServiceException;

    public com.distribute.grpc.FileResponse commit(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.distribute.grpc.FileResponse upload(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.distribute.grpc.FileResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance());
    }


    public com.distribute.grpc.FileResponse download(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request)
        throws com.google.protobuf.ServiceException {
      return (com.distribute.grpc.FileResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance());
    }


    public com.distribute.grpc.FileResponse update(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.distribute.grpc.FileResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance());
    }


    public com.distribute.grpc.FileResponse delete(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request)
        throws com.google.protobuf.ServiceException {
      return (com.distribute.grpc.FileResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance());
    }


    public com.distribute.grpc.FileResponse commit(
        com.google.protobuf.RpcController controller,
        com.distribute.grpc.FileRequestBrif request)
        throws com.google.protobuf.ServiceException {
      return (com.distribute.grpc.FileResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.distribute.grpc.FileResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:FileService)
}

