package org.benjamin.portfolio.spring.app;

import java.util.Collection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Configuration of the ServletContext.
 * 
 * @author Benjamin Rosman
 * @see WebApplicationInitializer
 *
 */
public class WebInitalizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebConfig.class, MongodbConfig.class);
		
		ServletRegistration.Dynamic dispatcher = servletContext
								.addServlet("dispatcher", new DispatcherServlet(context));
		int LOAD_ON_START = 1;
		dispatcher.setLoadOnStartup(LOAD_ON_START);
		dispatcher.addMapping("/*");
		Collection<String> mappings = dispatcher.getMappings();
		mappings.stream().forEach(string -> System.out.println(string));
	}

}
