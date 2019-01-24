package com.rest.tetra.TetraRestDemo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rest.tetra.TetraRestDemo.model.Topic;
import com.rest.tetra.TetraRestDemo.service.TopicService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TetraRestDemoApplicationTests {
	@Autowired
	TopicService topicService;
//	@Test
//	public void testgetAllTopics() {
//		List<Topic> topic = topicService.getAllTopics();
//		System.out.println(topic);
//		assertEquals(2, topic.size());
//	}
	@Test
	public void testGetTopic() {
//		Topic topic = topicService.getTopic("3");		
//		assertEquals("XML",topic.getName());	
	}
//	@Test
//	public void testAddTopic() {
//		topicService.addTopic(new Topic("3", "XML", "What and Why XML"));
//		List<Topic> list = topicService.getAllTopics();
//		assertEquals(3, list.size());	
//	}
//	@Test
//	public void testUpdateTopic() {
//		Topic topic = topicService.getTopic("1");
//		topic.setDescription("Learn in depth the details and get certified as a pro");
//		topicService.updateTopic(topic);
//		List<Topic> list = topicService.getAllTopics();
//		assertEquals("Learn in depth the details and get certified as a pro",list.get(0).getDescription());
//	}
//	@Test
//	public void testDeleteTopic() {
//		topicService.deleteTopic("2");
//		List<Topic> list = topicService.getAllTopics();
//		assertEquals(1, list.size());	
//	}

}
