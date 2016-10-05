package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("hello");
		registry.addViewController("/home").setViewName("hello");
		registry.addViewController("/index").setViewName("hello");
		registry.addViewController("/hello").setViewName("hello");
	}
}
