<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description"
	content="Start your development with a Dashboard for Bootstrap 4.">
<meta name="author" content="Creative Tim">
<title>Ajouter Opération</title>
<!-- Favicon -->
<link href="./resources/assets/img/brand/favicon.png" rel="icon"
	type="image/png">
<!-- Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700"
	rel="stylesheet">
<!-- Icons -->
<link href="./resources/assets/vendor/nucleo/css/nucleo.css"
	rel="stylesheet">
<link
	href="./resources/assets/vendor/@fortawesome/fontawesome-free/css/all.min.css"
	rel="stylesheet">
<!-- Argon CSS -->
<link type="text/css" href="./resources/assets/css/argon.css?v=1.0.0"
	rel="stylesheet">
</head>
<body>
	<!-- Sidenav -->
	<nav
		class="navbar navbar-vertical fixed-left navbar-expand-md navbar-light bg-white"
		id="sidenav-main">
		<div class="container-fluid">
			<!-- Toggler -->
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#sidenav-collapse-main" aria-controls="sidenav-main"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<!-- Brand -->
			<a class="navbar-brand pt-0" href="./index.html"> <img
				src="./resources/assets/img/brand/blue.png" class="navbar-brand-img"
				alt="...">
			</a>
			<!-- Form -->
			<form class="mt-4 mb-3 d-md-none">
				<div class="input-group input-group-rounded input-group-merge">
					<input type="search"
						class="form-control form-control-rounded form-control-prepended"
						placeholder="Search" aria-label="Search">
					<div class="input-group-prepend">
						<div class="input-group-text">
							<span class="fa fa-search"></span>
						</div>
					</div>
				</div>
			</form>
			<!-- Navigation -->
			<ul class="navbar-nav">
				<li class="nav-item dropdown"><a class="nav-link pr-0" href="#"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">
						<div class="media align-items-center">
							<span class="avatar avatar-sm rounded-circle"> <img
								alt="Image placeholder"
								src="./resources/assets/img/theme/team-4-800x800.jpg">
							</span>
							<div class="media-body ml-2 d-none d-lg-block">
								<span class="mb-0 text-sm  font-weight-bold">${employe.prenom}
									${employe.nom}</span>
							</div>
						</div>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="./index.html">
						<i class="ni ni-tv-2 text-primary"></i> Dashboard
				</a></li>
				<li class="nav-item"><a class="nav-link" href="listeGroupe">
						<i class="ni ni-ungroup text-red"></i> Groupes
				</a></li>
				<li class="nav-item"><a class="nav-link" href="listeEmploye">
						<i class="fas fa-users text-yellow"></i> Employés
				</a></li>
				<li class="nav-item"><a class="nav-link" href="listeClient">
						<i class="fas fa-users text-primary"></i> Clients
				</a></li>
				<li class="nav-item"><a class="nav-link" href="listeOperation">
						<i class="ni ni-bullet-list-67 text-red"></i> Opérations
				</a></li>
				<!-- 				<li class="nav-item"><a class="nav-link" -->
				<!-- 					href="./examples/login.html"> <i class="ni ni-key-25 text-info"></i> -->
				<!-- 						Login -->
				<!-- 				</a></li> -->
				<li class="nav-item"><a class="nav-link"
					href="./examples/register.html"> <i
						class="ni ni-circle-08 text-pink"></i> Deconnexion
				</a></li>
			</ul>
			<!-- Divider -->
			<hr class="my-3">
			<!-- Navigation -->
			<ul class="navbar-nav mb-md-3">

			</ul>
		</div>
		</div>
	</nav>
	<!-- Main content -->
	<div class="main-content">
		<!-- Top navbar -->
		<nav class="navbar navbar-top navbar-expand-md navbar-dark"
			id="navbar-main">
			<div class="container-fluid">
				<!-- Brand -->
				<a
					class="h4 mb-0 text-white text-uppercase d-none d-lg-inline-block"
					href="./index.html">Dashboard</a>
				<!-- Form -->
				<form
					class="navbar-search navbar-search-dark form-inline mr-3 d-none d-md-flex ml-lg-auto">
					<div class="form-group mb-0">
						<div class="input-group input-group-alternative">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-search"></i></span>
							</div>
							<input class="form-control" placeholder="Search" type="text">
						</div>
					</div>
				</form>
			</div>
		</nav>
		<!-- Header -->
		<div class="header bg-gradient-primary pb-8 pt-5 pt-md-8">
			<div class="container-fluid">
				<div class="header-body">
					<!-- Card stats -->
				</div>
			</div>
		</div>
		<!-- Page content -->
		<div class="container-fluid mt--7">
			<!-- Table -->
			<div class="row">
				<div class="col">
					<div class="col-xl-8 order-xl-1">
						<div class="card bg-secondary shadow">
							<div class="card-header bg-white border-0">
								<div class="row align-items-center">
									<div class="col-8">
										<h3 class="mb-0">Infos du client</h3>
									</div>
								</div>
							</div>
							<div class="card-body">
								<form method="post" action="ajouterOperation">
									<h6 class="heading-small text-muted mb-4">Informations de
										la transaction</h6>

									<div class="pl-lg-4">
										<div class="row">
											<div class="col-lg-6">
												<div class="form-group">
													<label class="form-control-label">Opération</label>
													<div>
														<div class="form-check form-check-inline">
															<input class="form-check-input" type="radio"
																name="operation" id="inlineRadio1" value="retrait">
															<label class="form-check-label" for="inlineRadio1">Retrait</label>
														</div>
														<div class="form-check form-check-inline">
															<input class="form-check-input" type="radio"
																name="operation" id="inlineRadio2" value="versement">
															<label class="form-check-label" for="inlineRadio2">Versement</label>
														</div>
													</div>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-lg-6">
												<div class="form-group">
													<label class="form-control-label">Numéro compte</label> <input
														type="text" class="form-control form-control-alternative"
														placeholder="123456" name="numCompte">
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-lg-6">
												<div class="form-group">
													<label class="form-control-label">Montant</label> <input
														type="text" class="form-control form-control-alternative"
														placeholder="250000 FCFA" name="montant">
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-4 text-right">
												<button type="submit" class="btn btn-sm btn-primary">Effectuer</button>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Footer -->
			<footer class="footer">
				<div class="row align-items-center justify-content-xl-between">
					<div class="col-xl-6">
						<div class="copyright text-center text-xl-left text-muted">
							&copy; 2018 <a href="https://www.creative-tim.com"
								class="font-weight-bold ml-1" target="_blank">Creative Tim</a>
						</div>
					</div>
					<div class="col-xl-6">
						<ul
							class="nav nav-footer justify-content-center justify-content-xl-end">
							<li class="nav-item"><a href="https://www.creative-tim.com"
								class="nav-link" target="_blank">Creative Tim</a></li>
							<li class="nav-item"><a
								href="https://www.creative-tim.com/presentation"
								class="nav-link" target="_blank">About Us</a></li>
							<li class="nav-item"><a href="http://blog.creative-tim.com"
								class="nav-link" target="_blank">Blog</a></li>
							<li class="nav-item"><a
								href="https://github.com/creativetimofficial/argon-dashboard/blob/master/LICENSE.md"
								class="nav-link" target="_blank">MIT License</a></li>
						</ul>
					</div>
				</div>
			</footer>
		</div>
	</div>
	<!-- Argon Scripts -->
	<!-- Core -->
	<script src="./resources/assets/vendor/jquery/dist/jquery.min.js"></script>
	<script
		src="./resources/assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Argon JS -->
	<script src="./resources/assets/js/argon.js?v=1.0.0"></script>
</body>
</html>