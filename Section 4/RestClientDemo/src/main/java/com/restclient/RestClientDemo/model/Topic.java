package com.restclient.RestClientDemo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Topic {
	private String id;
	private String name;
	private String description;
	public Topic() {
		// TODO Auto-generated constructor stub
	}
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}

