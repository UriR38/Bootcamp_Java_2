package com.example;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class MyFirstApplication {
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MyFirstApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApplication.class, args);

		LOGGER.info("Este es info");
		LOGGER.warn("Este es warning");
		LOGGER.debug("Este es debug");
		LOGGER.error("Este es error"); //Apartir de aqui no se muestra
		LOGGER.trace("Este es trace"); //No furula tampoco
 
		//Los mensajes de DEBUG y TRACE no se mostrarán a menos que se configure explícitamente.
	}

}
