<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<div style="text-align: center;">
<H1>${message }</H1>

<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="producto">

<label>Nombre: </label>
<form:input type="text" name="nombre" path="nombre"/>

<form:errors path="nombre" cssStyle="color:#E81505;">
</form:errors><br>

<br>
<label>Marca: </label>
<form:input type="text" name="marca" path="marca"/>
<form:errors path="marca" cssStyle="color:#E81505;">
</form:errors><br>

<br>
<label>Descripcion: </label>
<form:input type="text" name="descripcion" path="descripcion"/>
<form:errors path="descripcion" cssStyle="color:#E81505;">
</form:errors><br>

<br>
<label>Categoria: </label>
<form:input type="text" name="categoria" path="categoria"/>
<form:errors path="categoria" cssStyle="color:#E81505;">
</form:errors><br>

<br>
<label>Precio: </label>
<form:input type="number" step="any" name="precio" path="precio"/>
<form:errors path="precio" cssStyle="color:#E81505;">
</form:errors><br>

<br>
<label>Fecha de vencimiento: </label>
<form:input type="date" name="fecha" path="fecha"/>
<form:errors path="fecha" cssStyle="color:#E81505;">
</form:errors><br>

<br>
<input type="submit" value="Agregar">

</form:form>

</div>
</body>
</html>