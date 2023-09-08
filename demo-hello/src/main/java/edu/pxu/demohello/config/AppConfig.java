package edu.pxu.demohello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import edu.pxu.demohello.repository.ProductRepository;
import edu.pxu.demohello.repository.ProductRepositoryImpl;
import edu.pxu.demohello.services.ProductService;
import edu.pxu.demohello.services.ProductServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	    "edu.pxu.demohello"
	})
public class AppConfig {
	
	@Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }

}
