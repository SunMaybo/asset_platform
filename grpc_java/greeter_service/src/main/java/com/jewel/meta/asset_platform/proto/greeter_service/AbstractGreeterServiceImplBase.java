package com.jewel.meta.asset_platform.proto.greeter_service;

import io.grpc.stub.StreamObserver;


public abstract class AbstractGreeterServiceImplBase extends GreeterServiceGrpc.GreeterServiceImplBase {
   
	
    @Override
    public void  sayHelloWord(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request, io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
        responseObserver.onNext(sayHelloWord(request));
        responseObserver.onCompleted();
    }
    /**
     */
    protected abstract com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply sayHelloWord(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request);
   
   
	
    @Override
    public io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStream(io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
        return sayStreamWithDuplex(responseObserver);
    }
    /**
     */
    protected abstract io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStreamWithDuplex(io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver);

   
   
	
    @Override
    public io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStream1(io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
        return sayStream1WithDuplex(responseObserver);
    }
    /**
     */
    protected abstract io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest> sayStream1WithDuplex(io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver);

   
   
	
    @Override
    public void sayStream2(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request, io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver) {
        sayStream2WithReturnSimplex(request, responseObserver);
    }
	/**
     */
    public abstract void sayStream2WithReturnSimplex(com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloRequest request, io.grpc.stub.StreamObserver<com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol.HelloReply> responseObserver);
   
   
}
