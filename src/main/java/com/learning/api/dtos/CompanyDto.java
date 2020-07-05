package com.learning.api.dtos;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public class CompanyDto {
	private Long id;
	private String socialReason;
	private String cnpj;
	
	public CompanyDto() {	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotBlank(message = "social reason is not empty.")
	@Length(min = 5, max = 200, message = "social reason between 5 and 200")
	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}

	@NotBlank(message = "CNPJ is not empty.")
	@CNPJ(message = "CNPJ invalid.")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", socialReason=" + socialReason + ", cnpj=" + cnpj + "]";
	}
}
