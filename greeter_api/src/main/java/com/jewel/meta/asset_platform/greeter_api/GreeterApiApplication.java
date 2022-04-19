package com.jewel.meta.asset_platform.greeter_api;

import com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceGrpc;
import com.jewel.meta.asset_platform.proto.greeter_service.GreeterServiceProtocol;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@Slf4j
public class GreeterApiApplication {

    @GrpcClient("greeter-service")
    private GreeterServiceGrpc.GreeterServiceBlockingStub greeterServiceBlockingStub;

    public static void main(String[] args) {
        SpringApplication.run(GreeterApiApplication.class, args);
    }

    @GetMapping("/greeter/sayHello")
    public String sayHelloWorld(String name) {
        log.info("sayHelloWorld", "name", name);
        GreeterServiceProtocol.HelloReply helloReply = greeterServiceBlockingStub.sayHelloWord(GreeterServiceProtocol.HelloRequest.newBuilder().setName(name).build());
        return helloReply.getMessage();
    }

}
