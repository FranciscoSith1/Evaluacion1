<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 20-06-2022
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Asistencia</title>
</head>
<body>
<h1>Bienvenido</h1>
<h2>
    <div>
        <%--@elvariable id="vendedor" type="vendedor"--%>
        <form:form action="/vendedor/registrar" method="post" modelAttribute="vendedor">
            <form:label path="nombre" class="form-label">Nombre:</form:label>
            <form:input type="text" class="form-control" path="nombre"/>
            <br>
            <form:label path="apellido" class="form-label">Apellido:</form:label>
            <form:input type="text" class="form-control" path="apellido"/>
            <br>
            <form:label path="llegada" class="form-label">Hora de llegada:</form:label>
            <form:input type="text" class="form-control" path="llegada"/>
            <br>
            <button type="submit" class="btn btn-outline-primary">Aceptar</button>
        </form:form>
    </div>
</h2>
</body>
</html>
