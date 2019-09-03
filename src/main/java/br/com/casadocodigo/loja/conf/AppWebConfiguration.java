package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.casadocodigo.loja.controllers.HomeController;

//Estamos habilitando o Spring Web MVC no projeto
@EnableWebMvc
//Indicar para o spring onde encontrar nossas controllers
@ComponentScan(basePackageClasses = {HomeController.class})
public class AppWebConfiguration {

}
