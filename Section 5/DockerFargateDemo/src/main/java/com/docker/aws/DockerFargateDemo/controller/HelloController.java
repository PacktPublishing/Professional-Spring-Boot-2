package com.docker.aws.DockerFargateDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String sayHello()
	{
		return "Hello from Docker and then see me on AWS Fargate as well";
	}
}
