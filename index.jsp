<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">

			<div class="col-md-15">

				<h1 class="text-center mb-3">Welcome to Job_Vacancy App</h1>
				<table class="table table-striped table-dark">

					<tr>
						<th scope="col">S.No</th>
						<th scope="col">Experience_Required</th>
						<th scope="col">Salary_Lower_Range</th>
						<th scope="col">Salary_Upper_Range</th>
						<th scope="col">Vacancy_Added_On</th>
						<th scope="col">Is_Active</th>
						<th scope="col">Action</th>
					</tr>
					</thead>


					<tbody>

						<c:forEach items="${job_vacancies}" var="job_vac">
							<tr>
								<th scope="row">${job_vac.id}</th>
								<td>${job_vac.experience_required}</td>
								<td>${job_vac.salary_lower_range}</td>
								<td>${job_vac.salary_upper_range}</td>
								<td>${job_vac.vacancy_added_on}</td>
								<td>${job_vac.is_active}</td>
								<td><a href="delete/${job_vac.id }"> <i
										class="fa-solid fa-trash"></i></a></td>

							</tr>
						</c:forEach>

					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-job_vacancy" class="btn btn-outline-success"> Add
						Job_Vacancy</a>

				</div>

			</div>

		</div>

	</div>

</body>
</html>
