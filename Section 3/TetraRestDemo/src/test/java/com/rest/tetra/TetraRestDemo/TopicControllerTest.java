package com.rest.tetra.TetraRestDemo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.rest.tetra.TetraRestDemo.controller.TopicController;
import com.rest.tetra.TetraRestDemo.model.Topic;
import com.rest.tetra.TetraRestDemo.service.TopicService;

@RunWith(SpringRunner.class)
@WebMvcTest(TopicController.class)
public class TopicControllerTest {

	@Autowired
	MockMvc mock;
	@MockBean
	TopicService service;
	@Test
	public void getTopicWithId() throws Exception
	{
		Mockito.when(service.getTopic("1")).thenReturn(new Topic("1","Angular","Learn the web UI framework"));
		MvcResult result = mock.perform(get("/topic/1")).andExpect(status().isOk()).andReturn();
		System.out.println(result.getResponse().getContentAsString());
	}
	@Test
	public void insertTopicTest() throws Exception
	{
		String TOPIC_JSON = "{"+
		        "\"id\":\"1\"," +
		        "\"name\":\"Java\"," +
		        "\"description\":\"Java details\"}";

		Mockito.when(service.addTopic(new Topic("1","Angular","Learn the web UI framework"))).thenReturn(true);
		MvcResult result = mock.perform(post("/topic").
									contentType(MediaType.APPLICATION_JSON).
									content(TOPIC_JSON)).andExpect(status().isOk()).andReturn();
		System.out.println(result.getResponse().getContentAsString());
	}
}
