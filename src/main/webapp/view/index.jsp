<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>My Struts example</title>
</head>

<body>
<h1>Home Page YOYOYO</h1>
Enter username and password:
<s:form action="login">
    <s:textfield name="userName" label="Username"/>
    <s:textfield name="password" type="password" label="Password"/>
    <s:submit value="Submit"/>
</s:form>
</body>
</html>