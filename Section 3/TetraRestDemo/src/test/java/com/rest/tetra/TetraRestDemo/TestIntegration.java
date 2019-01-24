package com.rest.tetra.TetraRestDemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.tetra.TetraRestDemo.model.Topic;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TetraRestDemoApplication.class,
webEnvironment=WebEnvironment.RANDOM_PORT)
public class TestIntegration {

	@LocalServerPort
	int port;
	@Autowired
	TestRestTemplate restTemplate;
	@Test
	public void testGetTopicById() throws JsonProcessingException
	{
		String uri = "/topic/1";
		String jsonTopic = mapToJson(new Topic("1", "CSS", "Style the pages"));
		String jsonresponse = restTemplate.getForObject(formFullURLWithPort(uri), String.class);
		assertThat(jsonresponse).isEqualTo(jsonTopic);
	}
	@Test
	public void testSaveTopic() throws JsonProcessingException
	{
		String uri = "/topic";
		Topic topic = new Topic("4", "ReactJS", "Web UI Framework");
		String response = restTemplate.postForObject(formFullURLWithPort(uri), topic, String.class);
		assertThat(response).isEqualTo("Topic added "+topic);
	}
	
	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
	private String formFullURLWithPort(String uri) {		
		return "http://localhost:" + port + uri;	}

}
