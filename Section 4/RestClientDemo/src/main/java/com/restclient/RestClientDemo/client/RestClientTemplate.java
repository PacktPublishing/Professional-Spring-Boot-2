package com.restclient.RestClientDemo.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.restclient.RestClientDemo.model.Topic;

public class RestClientTemplate {

	RestTemplate restTemplate;
	String url = "http://localhost:8080/topic";
	public RestClientTemplate() {
		
		this.restTemplate = new RestTemplate();
	}
	public void getTopic()
	{
		//Topic topic = this.restTemplate.getForObject(url+"/1", Topic.class);
		ResponseEntity<Topic> response = this.restTemplate.getForEntity(url+"/1", Topic.class);
		System.out.println(response.getBody());
		System.out.println(response.getStatusCodeValue());
	}
	public void addTopic()
	{
		Topic topic = new Topic("4", "JSON", "JSON details");
		String resp =  this.restTemplate.postForObject(url, topic, String.class);
		System.out.println(resp);
	}
	public void updateTopic()
	{
		Topic topic = this.restTemplate.getForObject(url+"/4", Topic.class);
		topic.setDescription("Learn the json details how to create");
		this.restTemplate.put(url, topic);
	}
	public void deleteTopic()
	{
		this.restTemplate.delete(url+"/4");
	}
}
