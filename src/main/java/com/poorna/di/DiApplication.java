package com.poorna.di;

import com.poorna.di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DiApplication.class, args);
		MyController myController = context.getBean(MyController.class);

		System.out.println("Main method");
		System.out.println(myController.hello());
	}

}
