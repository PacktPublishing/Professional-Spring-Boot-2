package com.tetra.TetraDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

	@RequestMapping("/greet")
	public String greet()
	{
		return "Spring Boot is just AWESOME";
	}
}
