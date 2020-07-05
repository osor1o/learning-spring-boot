package com.learning.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.api.dtos.CompanyDto;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	@PostMapping
	public ResponseEntity<CompanyDto> add(@RequestBody CompanyDto companyDto) {
		return ResponseEntity.ok(companyDto);
	}
}
