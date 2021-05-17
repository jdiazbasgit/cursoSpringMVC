<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<spring:form action="verLogin" modelAttribute="login">

USUARIO:<spring:input path="usuario"  />
		<br>

CLAVE:<spring:password path="clave" />
		<br>

		<button type="submit">ENVIAR</button>

	</spring:form>


</body>
</html>
