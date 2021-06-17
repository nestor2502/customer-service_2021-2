package com.dws.customerservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dws.customerservice.dto.Region;

@Repository
public class RegionRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Region> getRegions(){
		List<Region> regions = new ArrayList<>();
		regions = jdbcTemplate.query("SELECT * FROM region;", new BeanPropertyRowMapper<Region>(Region.class));
		
		return regions;
	}
	
}
