package org.benjamin.portfolio.spring.app;

import org.benjamin.portfolio.model.controller.CodeInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * This class consist exclusively of Spring MVC configurations.
 * 
 * @author Benjamin Rosman
 * @see WebMvcConfigurerAdapter
 *
 */
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
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/public-resources/");
	}

}
