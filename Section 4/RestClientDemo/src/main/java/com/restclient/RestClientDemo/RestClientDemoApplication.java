package com.restclient.RestClientDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restclient.RestClientDemo.client.RestClientTemplate;

@SpringBootApplication
public class RestClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientDemoApplication.class, args);
		RestClientTemplate template = new RestClientTemplate();
		//template.getTopic();
		template.deleteTopic();
	}
}
