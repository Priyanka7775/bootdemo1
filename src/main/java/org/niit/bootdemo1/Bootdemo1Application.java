package org.niit.bootdemo1;

import org.niit.bootdemo1.services.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bootdemo1Application {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(Bootdemo1Application.class, args);
		Demo demo=context.getBean("demo", Demo.class);
		System.out.println(demo.greet());
		demo.message();


	}

}
