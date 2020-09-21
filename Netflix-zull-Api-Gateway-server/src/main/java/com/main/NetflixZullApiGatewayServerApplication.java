package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import brave.sampler.Sampler;


@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZullApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZullApiGatewayServerApplication.class, args);
	}
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
