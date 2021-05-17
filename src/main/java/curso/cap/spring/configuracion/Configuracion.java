package curso.cap.spring.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;








//<context:component-scan base-package="curso.cap.spring" />
@Configuration
@EnableWebMvc
@ComponentScan("curso.cap.spring")
//@EnableAspectJAutoProxy
public class Configuracion {
	
	@Bean
	public InternalResourceViewResolver getResolver() {
		
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}

}
