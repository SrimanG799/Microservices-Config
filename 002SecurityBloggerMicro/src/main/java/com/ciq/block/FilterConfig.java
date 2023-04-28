package com.ciq.block;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	@Bean
	public FilterRegistrationBean jwtFilter()
	{
		
		FilterRegistrationBean filter=new FilterRegistrationBean<>();
		filter.setFilter(new JWTFilter());
		
		 // provide endpoints which needs to be restricted.
        // All Endpoints would be restricted if unspecified
       filter.addUrlPatterns("/blog/restricted");
       System.out.println(filter+" *******Yes Filter is printed");
		return filter;
		
	}

}
