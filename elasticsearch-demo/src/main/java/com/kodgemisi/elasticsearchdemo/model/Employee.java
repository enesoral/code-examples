package com.kodgemisi.elasticsearchdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

/**
 * Created on September, 2020
 *
 * @author enesoral
 */
@Document(indexName = "erp")
@Setting(settingPath = "/settings.json")
public class Employee {

	@Id
	@JsonIgnore
	private String id;

	@Field(type = FieldType.Text, analyzer = "custom_analyzer")
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
