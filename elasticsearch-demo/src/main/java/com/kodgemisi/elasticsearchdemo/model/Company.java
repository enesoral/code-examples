package com.kodgemisi.elasticsearchdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import java.util.List;

/**
 * Created on September, 2020
 *
 * @author enesoral
 */
@Document(indexName = "erp")
@Setting(settingPath = "/settings.json")
public class Company {

	@Id
	private String id;

	@Field(type = FieldType.Text, analyzer = "custom_analyzer")
	private String name;

	@Field(type = FieldType.Text, analyzer = "custom_analyzer")
	private String description;

	@Field(type = FieldType.Nested, includeInParent = true)
	private List<Employee> employees;

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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
