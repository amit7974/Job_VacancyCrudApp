<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill the Job_Vacancy detail</h1>
				<form action="handle-job_vacancy" method="post">

					<div class="form-group">
						<label for="experience_requird"> Job_Vacancy
							Experience_Required</label> <input type="text" class="form-control"
							id="name" aria-describedy="emailHelp" name="experience_required"
							placeholder="Enter the experience_required">
					</div>



					<div class="form-group">
						<label for="salary_lower_range">Job_Vacancy
							Salary_Lower_Range</label> <input type="textarea" class="form-control"
							id="salary_lower_range" name="salary_lower_range"
							id="salary_lower_range" rows="5"
							placeholder="Enter the salary_lower_range">
					</div>


					<div class="form-group">
						<label for="salary_upper_range">Job_Vacancy
							Salary_Upper_Range</label> <input type="textarea" class="form-control"
							id="salary_upper_range" name="salary_upper_range"
							id="salary_upper_range" rows="5"
							placeholder="Enter the salary_upper_range">
					</div>





					<div class="form-group">
						<label for="vacancy_added_on">Job_Vacancy Vacancy_Added_On</label>
						<input type="textarea" class="form-control" id="vacancy_added_on"
							name="vacancy_added_on" id="vacancy_added_on" rows="5"
							placeholder="Enter the vacancy_added_on">
					</div>


					<div class="form-group">
						<label for="is_active">Job_Vacancy Is_Active</label> <input
							type="text" placeholder="Enter the Is_	Active" name="is_active"
							class="form-control" id="is_active">
					</div>


					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>

						<button type="submit" class="btn btn-primary">Add</button>
					</div>

				</form>

			</div>


		</div>

	</div>
</body>
</html>