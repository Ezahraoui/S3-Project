
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de demande</title>
</head>
<body>
<form action="uploadServlet" method="post" enctype="multipart/form-data">
<table>
<tr>
<td>Sujet :</td>
<td><input type="text" name="sujet"/></td>
</tr>
<tr>
<td>Message :</td>
<td><input type="text" name="message"/></td>
</tr>
<tr>
<td>File :</td>
<td><input type="file" name="file"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Envoyer Demande"></td>
</tr>
</table>
</form>
</body>