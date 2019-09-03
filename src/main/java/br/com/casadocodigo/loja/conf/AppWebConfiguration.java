package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import br.com.casadocodigo.loja.controllers.HomeController;


@EnableWebMvc //Estamos habilitando o Spring Web MVC no projeto
@ComponentScan(basePackageClasses = {HomeController.class}) //Indicar para o spring onde encontrar nossas controllers
public class AppWebConfiguration {
	
	@Bean //toda classe e metodo gerenciado pelo Spring é um bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
}
