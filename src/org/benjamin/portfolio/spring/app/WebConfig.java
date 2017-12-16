package org.benjamin.portfolio.spring.app;

import org.benjamin.portfolio.model.controller.CodeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration

@EnableWebMvc

@ComponentScan({"org.benjamin.portfolio.model"})
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("Adding interceptors...");
		registry.addInterceptor(new CodeInterceptor()).addPathPatterns("/submit/code/*");
		System.out.println("Added interceptors...");
	}

	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".xhtml");
		return resolver;
	}
	// Resolver
	// prefix web-inf
	// sufix .xhtml

	 
}
