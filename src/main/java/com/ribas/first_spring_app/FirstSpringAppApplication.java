package com.ribas.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Configuration -> Define que a classe pode ter métodos que definem beans
// @EnableAutoConfiguration -> Ativa a auto configuração do spring
// @ComponentScan -> Permite que o spring escaneie tod0 o pacote do projeto
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
