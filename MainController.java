package com.amit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.amit.dao.Job_VacancyDao;
import com.amit.model.Job_Vacancy;

@Controller
public class MainController {

	// create variable

	@Autowired
	private Job_VacancyDao job_vacancyDao;

	@RequestMapping("/")
	public String home(Model m) {

		List<Job_Vacancy> job_vacancies = job_vacancyDao.getJob_Vacancies();
		m.addAttribute("job_vacancies", job_vacancies);
		return "index";
	}

	// Add-Job VACANCY

	@RequestMapping("/add-job_vacancy")
	public String addJob_Vacancy(Model m) {
		m.addAttribute("title", "Add Job_Vacancy");

		return "add_job_vacancy_form";
	}

	// handle add job_vacancy

	@RequestMapping(value = "/handle-job_vacancy", method = RequestMethod.POST)
	public RedirectView handleJob_Vacancy(@ModelAttribute Job_Vacancy job_vacancy, HttpServletRequest request) {
		System.out.println(job_vacancy);
		job_vacancyDao.careate(job_vacancy);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;

	}

	// delete handler

	@RequestMapping("/delete/{job_vacancyId}")
	public RedirectView deleteJob_Vacancy(@PathVariable("job_vacancyId") int job_vacancyId,
			HttpServletRequest request) {
		this.job_vacancyDao.deleteJob_Vacancy(job_vacancyId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

}
