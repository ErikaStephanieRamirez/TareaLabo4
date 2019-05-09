<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
<H1>${message}</H1>

<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Marca</th>
			<th>Descripcion</th>
			<th>Categoria</th>
			<th>Precio</th>
			<th>Fecha</th>
		</tr>
		<tr>
			<td>${producto.nombre}</td>	
			<td>${producto.marca}</td>	
			<td>${producto.descripcion}</td>	
			<td>${producto.categoria}</td>	
			<td>${producto.precio}</td>	
			<td>${producto.fecha}</td>	
		
		</tr>	
	
	</table>
</div>
</body>
</html>