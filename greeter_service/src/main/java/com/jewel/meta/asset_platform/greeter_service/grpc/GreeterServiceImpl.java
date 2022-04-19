package com.jewel.meta.asset_platform.greeter_service.grpc;

import com.jewel.meta.asset_platform.proto.greeter_service.AbstractGreeterServiceImplBase;
import com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class GreeterServiceImpl extends AbstractGreeterServiceImplBase {
    @Override
    protected GreeterServiceProtocol.HelloReply sayHelloWord(GreeterServiceProtocol.HelloRequest helloRequest) {
        log.info("sayHelloWord:", helloRequest.getName());
        return GreeterServiceProtocol.HelloReply.newBuilder().setMessage("Hello " + helloRequest.getName()).build();
    }

    @Override
    protected StreamObserver<GreeterServiceProtocol.HelloRequest> sayStreamWithDuplex(StreamObserver<GreeterServiceProtocol.HelloReply> streamObserver) {
        return null;
    }

    @Override
    protected StreamObserver<GreeterServiceProtocol.HelloRequest> sayStream1WithDuplex(StreamObserver<GreeterServiceProtocol.HelloReply> streamObserver) {
        return null;
    }

    @Override
    public void sayStream2WithReturnSimplex(GreeterServiceProtocol.HelloRequest helloRequest, StreamObserver<GreeterServiceProtocol.HelloReply> streamObserver) {

    }
}
