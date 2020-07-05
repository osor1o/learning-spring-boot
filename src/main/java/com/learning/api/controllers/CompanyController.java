package com.learning.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.api.dtos.CompanyDto;
import com.learning.api.responses.ExampleResponse;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	@PostMapping
	public ResponseEntity<ExampleResponse<CompanyDto>> add(@RequestBody CompanyDto companyDto) {
		ExampleResponse<CompanyDto> response = new ExampleResponse<CompanyDto>();
		
		companyDto.setId(1L);
		response.setData(companyDto);
		
		return ResponseEntity.ok(response);
	}
}
