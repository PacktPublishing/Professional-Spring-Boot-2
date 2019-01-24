package com.rest.tetra.TetraRestDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/greet")
	public String hello()
	{
		return "Hello from jetty server";
	}
}
