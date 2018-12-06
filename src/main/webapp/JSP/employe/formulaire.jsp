
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FORMULAIRE</title>
</head>
<body>
	<h1>Remplissez les champs suivants afin de vous inscrire</h1>

	<form action="formulaire" method="post">
		<table>
			<tr>
				<td>Nom</td>
				<td><input type="text" name="Nom" value="" /></td>
			</tr>
			<tr>
				<td>Premom</td>
				<td><input type="text" name="Prenom" value="" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="Email" value="" /></td>
			</tr>
			<tr>
				<td>Téléphone</td>
				<td><input type="text" name="Telephone" value="" /></td>
			</tr>
			<tr>
				<td>Login</td>
				<td><input type="text" name="login" value="" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="action" value="VALIDER" /></td>
			</tr>
		</table>
	</form>
</body>
</html>