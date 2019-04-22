package com.jk.dao;

import com.jk.pojo.TravelMessage;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.repository.CrudRepository;

public interface TravelDao extends ElasticsearchCrudRepository<TravelMessage, String> {
}
