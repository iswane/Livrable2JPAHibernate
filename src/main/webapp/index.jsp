<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description"
	content="Start your development with a Dashboard for Bootstrap 4.">
<meta name="author" content="Creative Tim">
<title>Gestion Banque</title>
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
<body class="bg-default">
	<div class="main-content">
		<!-- Navbar -->
		<nav
			class="navbar navbar-top navbar-horizontal navbar-expand-md navbar-dark">
			<div class="container px-1">
				<a class="navbar-brand" href="./index.html"> <img
					src="./resources/assets/img/brand/white.png" />
				</a>
			</div>
		</nav>
		<!-- Header -->
		<div class="header bg-gradient-primary py-5 py-lg-8">
			<div class="container">
				<div class="header-body text-center mb-5">
					<div class="row justify-content-center">
						<div class="col-lg-9 col-md-9">
							<h1 class="text-white">BIENVENUE DANS LA PLATEFORME DE
								GESTION BANCAIRE</h1>
						</div>
					</div>
				</div>
			</div>
			<div class="separator separator-bottom separator-skew zindex-100">
				<svg x="0" y="0" viewBox="0 0 2560 100" preserveAspectRatio="none"
					version="1.1" xmlns="http://www.w3.org/2000/svg">
          <polygon class="fill-default" points="2560 0 2560 100 0 100"></polygon>
        </svg>
			</div>
		</div>
		<!-- Page content -->
		<div class="container mt--9 pb-5">
			<div class="row justify-content-center">
				<div class="col-lg-5 col-md-7">
					<div class="card bg-secondary shadow border-3">
						<div class="card-header bg-transparent pb-0">
							<div class="text-muted text-center mt-1 mb-2">
								<h2 class="text-black">Authentification</h2>
							</div>
						</div>
						<div class="card-body px-lg-5 py-lg-4">
							<div class="text-center text-muted mb-4">
								<small>Or sign in with credentials</small>
							</div>
							<form role="form" action="authentification" method="post">
								<div class="form-group mb-3">
									<div class="input-group input-group-alternative">
										<div class="input-group-prepend">
											<span class="input-group-text"><i
												class="ni ni-single-02"></i></span>
										</div>
										<input class="form-control" type="text" placeholder="Login"
											name="login">
									</div>
								</div>
								<div class="form-group">
									<div class="input-group input-group-alternative">
										<div class="input-group-prepend">
											<span class="input-group-text"><i class="ni ni-key-25"></i></span>
										</div>
										<input class="form-control" type="password"
											placeholder="Password" name="password">
									</div>
								</div>
								<div class="text-center">
									<button type="submit" class="btn btn-primary my-3">Connexion</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<footer class="py-0">
		<div class="container">
			<div class="row align-items-center justify-content-xl-between">
				<div class="col-xl-6">
					<div class="copyright text-center text-xl-left text-muted">
						&copy; 2018 <a href="https://www.creative-tim.com"
							class="font-weight-bold ml-1" target="_blank">Creative Tim</a>
					</div>
				</div>
				<div class="col-xl-4">
					<ul
						class="nav nav-footer justify-content-center justify-content-xl-end">
						<li class="nav-item"><a href="https://www.creative-tim.com"
							class="nav-link" target="_blank">Creative Tim</a></li>
						<li class="nav-item"><a
							href="https://www.creative-tim.com/presentation" class="nav-link"
							target="_blank">About Us</a></li>
						<li class="nav-item"><a href="http://blog.creative-tim.com"
							class="nav-link" target="_blank">Blog</a></li>
						<li class="nav-item"><a
							href="https://github.com/creativetimofficial/argon-dashboard/blob/master/LICENSE.md"
							class="nav-link" target="_blank">MIT License</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
	<!-- Argon Scripts -->
	<!-- Core -->
	<script src="./resources/assets/vendor/jquery/dist/jquery.min.js"></script>
	<script
		src="./resources/assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Argon JS -->
	<script src="./resources/assets/js/argon.js?v=1.0.0"></script>
</body>
</html>