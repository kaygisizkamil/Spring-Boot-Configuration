package com.example.dependency;

import com.example.dependency.controller.ConstructorInjectedController;
import com.example.dependency.controller.LngController;
import com.example.dependency.controller.PropertyInjectedController;
import com.example.dependency.controller.SetterInjectedController;
import com.example.dependency.service.NonSingletonModified;
import com.example.dependency.service.SingletonByDefault;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ={"com.example.dependency","uselessPackage"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DependencyApplication {

	public static void main(String[] args) {
		ApplicationContext cx=SpringApplication.run(DependencyApplication.class, args);

		System.out.println("Constructor-----------------------------------");
		ConstructorInjectedController conInj=(ConstructorInjectedController) cx.getBean("constructorInjectedController");
		System.out.println(conInj.getString());

		System.out.println("Here it comes property injection---------------------");
		PropertyInjectedController propInj=(PropertyInjectedController) cx.getBean("propertyInjectedController");
		System.out.println(propInj.getString());

		System.out.println("Setter injection-----------------------------");
		SetterInjectedController setInj=(SetterInjectedController) cx.getBean("setterInjectedController");
		System.out.println(setInj.getString());


		LngController lngController =(LngController) cx.getBean("lngController");
		System.out.println(lngController.whatup());


		SingletonByDefault sbd=cx.getBean(SingletonByDefault.class);
		NonSingletonModified nsm=cx.getBean(NonSingletonModified.class);
		SingletonByDefault sbd1=cx.getBean(SingletonByDefault.class);
		NonSingletonModified nsm1=cx.getBean(NonSingletonModified.class);

	}

}
