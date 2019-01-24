package com.tetra.TetraDemo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.tetra.TetraDemo.model.Employee;

@SpringBootApplication
public class TetraDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TetraDemoApplication.class, args);
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		
	}

	//@Bean
	public CommandLineRunner runner(ApplicationContext context)
	{
		return args -> {
			System.out.println("Lets inspect the beans generated");
			String []beanNames = context.getBeanDefinitionNames();
			for(String beans : beanNames)
				System.out.println(beans);
		};
	}
}
