package br.com.joao.cepinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepInfoApplication.class, args);
	}

}
