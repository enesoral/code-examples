package com.kodgemisi.elasticsearchdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created on September, 2020
 *
 * @author enesoral
 */
@Document(indexName = "erp")
public class Employee {

	@Id
	@JsonIgnore
	private String id;

	private String name;

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
}
