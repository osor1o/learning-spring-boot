package com.learning.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.learning.api.entities.Company;
import com.learning.api.repositories.CompanyRepository;

@SpringBootApplication
public class LearningSpringBootApplication {

	@Value("${pagination.n_items_per_pages}")
	private int nItemsPerPage;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Company company = new Company();
			company.setSocialReason("Test TI");
			company.setCnpj("38917986000131");
			
			this.companyRepository.save(company);
			
			List<Company> companies = companyRepository.findAll();
			companies.forEach(System.out::println);
			
			Optional<Company> optionalCompany1 = companyRepository.findById(1L);
			Company company1 = optionalCompany1.get();
			System.out.println("Company 1: " + company1);
			
			company1.setSocialReason("Updated Test TI");
			companyRepository.save(company1);
			
			Company companyCnpj = companyRepository.findByCnpj("38917986000131");
			System.out.println("Company by CNPJ: " + companyCnpj);
			
			companyRepository.deleteById(1L);
			companies = companyRepository.findAll();
			System.out.println("Companies: " + companies.size());
		};
	}

}
