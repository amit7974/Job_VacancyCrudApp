package com.amit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amit.model.Job_Vacancy;

@Component
public class Job_VacancyDao {
	
	@Autowired

	private HibernateTemplate hibernateTemplate;
	
	// create-job_vacancy
	
	@Transactional
	public void  careate(Job_Vacancy job_vacancy) {
		
		this.hibernateTemplate.save(job_vacancy);
		
	}
	
	// get all job_vacancy
	
	public List<Job_Vacancy> getJob_Vacancies(){
	List<Job_Vacancy> job_vacancies = this.hibernateTemplate.loadAll(Job_Vacancy.class);
	
	return job_vacancies;
	}

	// delete the single job_vacancy
	
	@Transactional
	public void deleteJob_Vacancy(int jid) {
		
	Job_Vacancy j = this.hibernateTemplate.load(Job_Vacancy.class ,jid);
	this.hibernateTemplate.delete(j);
	}
	
	//  get the single Job_Vacancy
	

public Job_Vacancy getJob_Vacancy(int jid) {
	
	return this.hibernateTemplate.get(Job_Vacancy.class,jid); 
}

 }
