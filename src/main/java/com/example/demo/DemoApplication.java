package com.example.demo;

import com.example.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);

		LaptopService laptopService=context.getBean(LaptopService.class);
		laptopService.addLaptop();
//		Aliean a1=(Aliean)context.getBean(Aliean.class);
//		System.out.println(a1.getAge());
//		a1.code();
	}
}
