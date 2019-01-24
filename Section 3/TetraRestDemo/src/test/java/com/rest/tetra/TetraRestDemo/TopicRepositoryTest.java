/*package com.rest.tetra.TetraRestDemo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.rest.tetra.TetraRestDemo.dao.TopicRepository;
import com.rest.tetra.TetraRestDemo.model.Topic;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TopicRepositoryTest {

	@Autowired
	TestEntityManager entityManager;
	@Autowired
	TopicRepository topicRepository;
	@Test
	public void testSaveTopic()
	{
		Topic topic = new Topic("3", "C#", "Learn Microsoft Framework");
		Topic savedInDb = entityManager.persist(topic);
		Topic fromDB = topicRepository.findById("3").get();
		assertThat(fromDB).isEqualTo(savedInDb);
	}
	@Test
	public void testGetTopicById()
	{
		Topic topic = new Topic("1", "ReactJS", "Learn Facebook Framework");
		Topic savedInDb = entityManager.persist(topic);
		Topic fromDB = topicRepository.findById("1").get();
		assertThat(fromDB).isEqualTo(savedInDb);
	}
	@Test
	public void testGetALLTopics()
	{
		Topic topic = new Topic("1", "ReactJS", "Learn Facebook Framework");
		Topic topic1 = new Topic("2", "NodeJS", "Learn server side JS");
		Topic savedInDb = entityManager.persist(topic);
		Topic savedInDb1 = entityManager.persist(topic1);
		Iterable<Topic> listfromDB = topicRepository.findAll();
		List<Topic> topics = new ArrayList<>();
		for(Topic t1:listfromDB)
		{
			topics.add(t1);
		}
		assertThat(topics.size()).isEqualTo(2);
	}
	@Test
	public void testDeleteTopic()
	{
		Topic topic = new Topic("1", "ReactJS", "Learn Facebook Framework");
		Topic topic1 = new Topic("2", "NodeJS", "Learn server side JS");
		Topic savedInDb = entityManager.persist(topic);
		Topic savedInDb1 = entityManager.persist(topic1);
		Iterable<Topic> listfromDB = topicRepository.findAll();
		List<Topic> topics = new ArrayList<>();
		for(Topic t1:listfromDB)
		{
			topics.add(t1);
		}
		assertThat(topics.size()).isEqualTo(2);
		entityManager.remove(topic1);
		listfromDB = topicRepository.findAll();
		topics = new ArrayList<>();
		for(Topic t1:listfromDB)
		{
			topics.add(t1);
		}
		assertThat(topics.size()).isEqualTo(1);
	}
	@Test
	public void testUpdateTopic()
	{
		Topic topic = new Topic("1", "ReactJS", "Learn Facebook Framework");
		Topic savedInDb = entityManager.persist(topic);
		Topic fromDB = topicRepository.findById("1").get();
		fromDB.setDescription("Learn the cool and responsive framework to create UI");
		entityManager.persist(fromDB);
		Topic savedInDb1 = entityManager.persist(topic);
		assertThat(fromDB).isEqualTo(savedInDb1);
		assertThat(fromDB.getDescription()).isEqualTo("Learn the cool and responsive framework to create UI");
	}
}
*/