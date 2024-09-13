<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>BALANCE DETAILS</h1>
<table border="1">
<tr>
<td>ACCOUNT NO</td>
<td>NAME</td>
<td>AMOUNT</td>
<td>ADDRESS</td>
<td>PHONE</td>
</tr>
<tr>
<td>${accounts.act_num}</td>
<td>${accounts.name}</td>
<td>${accounts.amount}</td>
<td>${accounts.address}</td>
<td>${accounts.mbnum}</td>
</table>