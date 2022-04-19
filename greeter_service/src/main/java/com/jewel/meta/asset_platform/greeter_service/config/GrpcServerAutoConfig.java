package com.jewel.meta.asset_platform.greeter_service.config;


import com.jewel.meta.asset_platform.greeter_service.exception.GlobalGrpcExceptionHandler;
import io.envoyproxy.pgv.ReflectiveValidatorIndex;
import io.envoyproxy.pgv.grpc.ValidatingServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GlobalServerInterceptorConfigurer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class GrpcServerAutoConfig {


    @Bean
    public GlobalServerInterceptorConfigurer globalInterceptorConfigurerAdapter() {
        return registry -> {
            registry.add(new ValidatingServerInterceptor(new ReflectiveValidatorIndex()));
            registry.add(new GlobalGrpcExceptionHandler());
        };
    }

}
