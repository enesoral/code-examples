package com.kodgemisi.elasticsearchdemo.dao;

import com.kodgemisi.elasticsearchdemo.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created on September, 2020
 *
 * @author enesoral
 */
public interface CompanyRepository extends ElasticsearchRepository<Company, String> {

	Page<Company> findByEmployeesName(String name, Pageable pageable);

	@Query("{\"bool\": {\"must\": [{\"match_phrase\": {\"employees.name\": \"?0\"}}]}}")
	Page<Company> findByEmployeesNameUsingCustomQuery(String name, Pageable pageable);
}