package com.dws.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dws.customerservice.service.RegionService;

@RestController
@RequestMapping("/region")
public class RegionController {
	
	@Autowired
	RegionService serviceRegion;
	
	@GetMapping
	public ResponseEntity<Object> getRegions(){
		return new ResponseEntity<>(serviceRegion.getRegions(), HttpStatus.OK);
	}
}
