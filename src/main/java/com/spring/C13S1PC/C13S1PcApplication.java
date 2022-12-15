package com.spring.C13S1PC;

import com.spring.C13S1PC.filter.JwFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class C13S1PcApplication {

	public static void main(String[] args) {
		SpringApplication.run(C13S1PcApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean jwFilter(){
//		FilterRegistrationBean frb=new FilterRegistrationBean<>();
//		frb.setFilter(new JwFilter());
////		frb.addUrlPatterns("/api/v1/customers/get");//"/api/v1/customers/add",
//		frb.addUrlPatterns("/api/v2/*");// addUrlPatter(String ...)// var-args
//		return frb;
//	}
}
