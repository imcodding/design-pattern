package com.design.demo;

import com.design.template.TemplateDesign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		TemplateDesign templateDesign = new TemplateDesign();
	}
}
