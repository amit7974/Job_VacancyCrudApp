package com.amit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job_Vacancy {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
	private String experience_required;
	private String salary_lower_range;
	private String salary_upper_range;
	private String vacancy_added_on;
	private long is_active;
	
	
	
	
	public int getId() {
		return id;	
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExperience_required() {
		return experience_required;
	}
	public void setExperience_required(String experience_required) {
		this.experience_required = experience_required;
	}
	public String getSalary_lower_range() {
		return salary_lower_range;
	}
	public void setSalary_lower_range(String salary_lower_range) {
		this.salary_lower_range = salary_lower_range;
	}
	public String getSalary_upper_range() {
		return salary_upper_range;
	}
	public void setSalary_upper_range(String salary_upper_range) {
		this.salary_upper_range = salary_upper_range;
	}
	public String getVacancy_added_on() {
		return vacancy_added_on;
	}
	public void setVacancy_added_on(String vacancy_added_on) {
		this.vacancy_added_on = vacancy_added_on;
	}
	public long getIs_active() {
		return is_active;
	}
	public void setIs_active(long is_active) {
		this.is_active = is_active;
	}
	public Job_Vacancy(int id, String experience_required, String salary_lower_range, String salary_upper_range,
			String vacancy_added_on, long is_active) {
		super();
		this.id = id;
		this.experience_required = experience_required;
		this.salary_lower_range = salary_lower_range;
		this.salary_upper_range = salary_upper_range;
		this.vacancy_added_on = vacancy_added_on;
		this.is_active = is_active;
	}
	public Job_Vacancy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Job_Vacancy [id=" + id + ", experience_required=" + experience_required + ", salary_lower_range="
				+ salary_lower_range + ", salary_upper_range=" + salary_upper_range + ", vacancy_added_on="
				+ vacancy_added_on + ", is_active=" + is_active + "]";
	}

	
	
	
}
