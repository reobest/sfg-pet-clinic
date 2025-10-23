package rayan.SpringFramework.sfg_pet_clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import rayan.SpringFramework.sfg_pet_clinic.controllers.MyController;

@SpringBootApplication
public class SfgPetClinicApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String result = myController.sayHello();
		System.out.println(result);
	}

}
