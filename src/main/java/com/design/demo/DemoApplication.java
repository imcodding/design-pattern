package com.design.demo;

import com.design.decorator.DecoratorDesign;
import com.design.factory.FactoryDesign;
import com.design.template.TemplateDesign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		new TemplateDesign();
//		new DecoratorDesign();
		new FactoryDesign();
	}
}
