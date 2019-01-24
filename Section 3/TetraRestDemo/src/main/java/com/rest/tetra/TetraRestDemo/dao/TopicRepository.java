package com.rest.tetra.TetraRestDemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.tetra.TetraRestDemo.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
