package com.design.demo;

import com.design.abstractFactory.AbstractFactoryDesign;
import com.design.composite.CompositeDesign;
import com.design.decorator.DecoratorDesign;
import com.design.decorator_apply.DecoratorDesignApply;
import com.design.factory.FactoryDesign;
import com.design.mediator.MediatorDesign;
import com.design.template.TemplateDesign;
import com.design.template_apply.TemplateDesignApply;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		new TemplateDesign();
//		new DecoratorDesign();
//		new FactoryDesign();
//		new AbstractFactoryDesign();
//		new MediatorDesign();
//		new CompositeDesign();

		/* 다른 예시로 테스트 */
//		new TemplateDesignApply();
		new DecoratorDesignApply();
	}
}
