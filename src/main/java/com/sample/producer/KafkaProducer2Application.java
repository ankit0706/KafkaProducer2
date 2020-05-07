package com.sample.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * In this project we try to implement more features in our kafka setup
 * like multiple brokers & multiple topics
 * @author AANU
 *
 */
@SpringBootApplication
public class KafkaProducer2Application {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducer2Application.class, args);
	}

}
