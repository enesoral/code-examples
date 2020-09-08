package com.kodgemisi.elasticsearchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.kodgemisi.elasticsearchdemo.dao")
public class ElasticsearchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchDemoApplication.class, args);
	}

}
