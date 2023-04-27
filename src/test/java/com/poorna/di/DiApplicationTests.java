package com.poorna.di;

import com.poorna.di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void getControllerFromContext() {
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.hello());
	}

	@Test
	void testAutowireController() {
		System.out.println(myController.hello());
	}

	@Test
	void contextLoads() {
	}

}
