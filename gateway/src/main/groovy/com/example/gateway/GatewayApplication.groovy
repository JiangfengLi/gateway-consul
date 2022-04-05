package com.example.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(GatewayApplication, args)
	}

/*	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("circuitbreaker_route", { r ->
					r.path("/consumingServiceEndpoint")
							.filters({ f ->
								f.circuitBreaker({ c -> c.name("myCircuitBreaker").fallbackUri("forward:/inCaseOfFailureUseThis") })
										.rewritePath("/consumingServiceEndpoint", "/backingServiceEndpoint")
							}).uri("lb://backing-service:8088")
				}).build();
	}*/
}
