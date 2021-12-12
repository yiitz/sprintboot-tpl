package com.yiitz.webtpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.extern.log4j.Log4j2;

/*
 * This is the main Spring Boot application class. It configures Spring Boot, JPA, Swagger
 */

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.yiitz")
@Log4j2
public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("#####################################################");
		System.out.println("############ start app ####################");
		File buildInfoFile = new File("build_info.txt");
		if (buildInfoFile.exists()) {
			Scanner input = new Scanner(buildInfoFile);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		}
		System.out.println("#####################################################");
		SpringApplication.run(Application.class, args);
		log.info("#### start finished");
	}
}