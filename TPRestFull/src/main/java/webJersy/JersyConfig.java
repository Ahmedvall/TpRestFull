package webJersy;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class JersyConfig {
	
	@Bean
	public ResourceConfig resourceConfig() {
		
		ResourceConfig config= new ResourceConfig();
		config.register(BanqueRestJarService.class);
		return config;
		
	}

}
