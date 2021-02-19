package com.abiertasys.barmetric;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;

import java.awt.image.BufferedImage;

@Configuration
@ComponentScan("com.abiertasys.barmetric")
public class BarMetricConfiguration {

	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}

	@Bean
	public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
    	return new BufferedImageHttpMessageConverter();
	}
	
}
