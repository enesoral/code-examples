package com.kodgemisi.elasticsearchdemo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

/**
 * Created on September, 2020
 *
 * @author enesoral
 */
@Configuration
class ElasticsearchConfig {

	@Bean
	RestHighLevelClient elasticsearchClient() {
		final ClientConfiguration clientConfiguration = ClientConfiguration.builder().connectedTo("localhost:9200").build();
		return RestClients.create(clientConfiguration).rest();
	}
}