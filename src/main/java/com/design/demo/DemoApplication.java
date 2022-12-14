package com.design.demo;

import com.design.abstractFactory.AbstractFactoryDesign;
import com.design.abstractFactory_apply.AbstractFactoryDesignApply;
import com.design.adapter.AdapterDesign;
import com.design.command.CommandDesign;
import com.design.composite.CompositeDesign;
import com.design.composite_apply.CompositeDesignApply;
import com.design.decorator.DecoratorDesign;
import com.design.decorator_apply.DecoratorDesignApply;
import com.design.factory.FactoryDesign;
import com.design.factory_apply.FactoryDesignApply;
import com.design.mediator.MediatorDesign;
import com.design.mediator_apply.MediatorDesignApply;
import com.design.proxy.ProxyDesign;
import com.design.singleton.SingletonDesign;
import com.design.state.StateDesign;
import com.design.strategy.StrategyDesign;
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
//		new DecoratorDesignApply();
//		new FactoryDesignApply();
//		new AbstractFactoryDesignApply();
//		new MediatorDesignApply();
//		new CompositeDesignApply();

//		new StrategyDesign();
//		new StateDesign();
//		new CommandDesign();
//		new AdapterDesign();
//		new ProxyDesign();
		new SingletonDesign();
	}
}
