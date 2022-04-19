package com.jewel.meta.asset_platform.proto.greeter_service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: greeter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterServiceGrpc {

  private GreeterServiceGrpc() {}

  public static final String SERVICE_NAME = "greeter.GreeterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayHelloWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloWord",
      requestType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.class,
      responseType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayHelloWordMethod() {
    io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayHelloWordMethod;
    if ((getSayHelloWordMethod = GreeterServiceGrpc.getSayHelloWordMethod) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayHelloWordMethod = GreeterServiceGrpc.getSayHelloWordMethod) == null) {
          GreeterServiceGrpc.getSayHelloWordMethod = getSayHelloWordMethod =
              io.grpc.MethodDescriptor.<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayHelloWord"))
              .build();
        }
      }
    }
    return getSayHelloWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayStream",
      requestType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.class,
      responseType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStreamMethod() {
    io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStreamMethod;
    if ((getSayStreamMethod = GreeterServiceGrpc.getSayStreamMethod) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayStreamMethod = GreeterServiceGrpc.getSayStreamMethod) == null) {
          GreeterServiceGrpc.getSayStreamMethod = getSayStreamMethod =
              io.grpc.MethodDescriptor.<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayStream"))
              .build();
        }
      }
    }
    return getSayStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStream1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayStream1",
      requestType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.class,
      responseType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStream1Method() {
    io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStream1Method;
    if ((getSayStream1Method = GreeterServiceGrpc.getSayStream1Method) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayStream1Method = GreeterServiceGrpc.getSayStream1Method) == null) {
          GreeterServiceGrpc.getSayStream1Method = getSayStream1Method =
              io.grpc.MethodDescriptor.<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayStream1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayStream1"))
              .build();
        }
      }
    }
    return getSayStream1Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStream2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayStream2",
      requestType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.class,
      responseType = com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
      com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStream2Method() {
    io.grpc.MethodDescriptor<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> getSayStream2Method;
    if ((getSayStream2Method = GreeterServiceGrpc.getSayStream2Method) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayStream2Method = GreeterServiceGrpc.getSayStream2Method) == null) {
          GreeterServiceGrpc.getSayStream2Method = getSayStream2Method =
              io.grpc.MethodDescriptor.<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest, com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayStream2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayStream2"))
              .build();
        }
      }
    }
    return getSayStream2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceStub>() {
        @java.lang.Override
        public GreeterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceStub(channel, callOptions);
        }
      };
    return GreeterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceBlockingStub>() {
        @java.lang.Override
        public GreeterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceBlockingStub(channel, callOptions);
        }
      };
    return GreeterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceFutureStub>() {
        @java.lang.Override
        public GreeterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceFutureStub(channel, callOptions);
        }
      };
    return GreeterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreeterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHelloWord(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request,
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloWordMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStream(
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStream1(
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayStream1Method(), responseObserver);
    }

    /**
     */
    public void sayStream2(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request,
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayStream2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloWordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>(
                  this, METHODID_SAY_HELLO_WORD)))
          .addMethod(
            getSayStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>(
                  this, METHODID_SAY_STREAM)))
          .addMethod(
            getSayStream1Method(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>(
                  this, METHODID_SAY_STREAM1)))
          .addMethod(
            getSayStream2Method(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest,
                com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>(
                  this, METHODID_SAY_STREAM2)))
          .build();
    }
  }

  /**
   */
  public static final class GreeterServiceStub extends io.grpc.stub.AbstractAsyncStub<GreeterServiceStub> {
    private GreeterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHelloWord(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request,
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloWordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStream(
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStream1(
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSayStream1Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sayStream2(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request,
        io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayStream2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreeterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterServiceBlockingStub> {
    private GreeterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply sayHelloWord(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloWordMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> sayStream2(
        com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayStream2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreeterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterServiceFutureStub> {
    private GreeterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> sayHelloWord(
        com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloWordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO_WORD = 0;
  private static final int METHODID_SAY_STREAM2 = 1;
  private static final int METHODID_SAY_STREAM = 2;
  private static final int METHODID_SAY_STREAM1 = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_WORD:
          serviceImpl.sayHelloWord((com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_STREAM2:
          serviceImpl.sayStream2((com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayStream(
              (io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>) responseObserver);
        case METHODID_SAY_STREAM1:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayStream1(
              (io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreeterService");
    }
  }

  private static final class GreeterServiceFileDescriptorSupplier
      extends GreeterServiceBaseDescriptorSupplier {
    GreeterServiceFileDescriptorSupplier() {}
  }

  private static final class GreeterServiceMethodDescriptorSupplier
      extends GreeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterServiceFileDescriptorSupplier())
              .addMethod(getSayHelloWordMethod())
              .addMethod(getSayStreamMethod())
              .addMethod(getSayStream1Method())
              .addMethod(getSayStream2Method())
              .build();
        }
      }
    }
    return result;
  }
}
