package com.br.franca.springkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Supplier;
import com.br.franca.springkafka.dto.Message;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
public class SpringKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

	@Bean
	public Consumer<Message> consumer() {
		return message -> System.out.println("received " + message);
	}

//	@Bean
//	public Supplier<Message> producer() {
//		return () -> new Message("AQUI!!!");
//	}

}
