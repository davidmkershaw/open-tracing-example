package me.davidkershaw.opentracingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.opentracing.util.GlobalTracer;

@SpringBootApplication
public class OpenTracingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenTracingDemoApplication.class, args);
	}

	@Bean
	public io.opentracing.Tracer tracer() {
		return GlobalTracer.get();
	}
}
