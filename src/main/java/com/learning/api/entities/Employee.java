package com.learning.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.learning.api.enums.ProfileEnum;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = -1143263879889225650L;
	private Long id;
	private String name;
	private String email;
	private String password;
	private String cpf;
	private BigDecimal hourlyValue;
	private Float hoursWorked;
	private Float lunchHours;
	private ProfileEnum profile;
	private Date createdAt;
	private Date updatedAt;
	private Company company;
	private List<Release> releases;
	
	public Employee() {	
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "cpf", nullable = false)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "hourly_value", nullable = true)
	public BigDecimal getHourlyValue() {
		return hourlyValue;
	}

	public void setHourlyValue(BigDecimal hourlyValue) {
		this.hourlyValue = hourlyValue;
	}

	@Column(name = "hours_worked", nullable = true)
	public Float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(Float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Column(name = "lunch_hours", nullable = true)
	public Float getLunchHours() {
		return lunchHours;
	}

	public void setLunchHours(Float lunchHours) {
		this.lunchHours = lunchHours;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "profile", nullable = false)
	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}

	@Column(name = "created_at", nullable = false)
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "updated_at", nullable = false)
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Release> getReleases() {
		return releases;
	}

	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}
	
	@PrePersist
	public void prePersist() {
		final Date now = new Date();
		createdAt = now;
		updatedAt = now;
	}
	
	@PreUpdate
	public void preUpdate() {
		updatedAt = new Date();
	}
	
}
