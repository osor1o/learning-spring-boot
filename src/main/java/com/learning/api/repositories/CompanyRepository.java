package com.learning.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.api.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

	Company findByCnpj(String cnpj);
	
}
