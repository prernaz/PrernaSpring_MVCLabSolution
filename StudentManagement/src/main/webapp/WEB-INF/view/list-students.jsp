<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
 <head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   <!-- Bootstrap CSS --> 
   <link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"    
    integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
    crossorigin="anonymous">
 <title>Student Directory</title>
  <style>
      body {
        background-color: #e6ebef;
      }
      h1 {
        background-color: #1c87c9;
      }
   </style>
    <h1 ALIGN = "CENTER" >CollegeFest Student Management System</h1><br>
 </head>
<body>
<BR>
<div>           
<div class="container"> 
  <a href="showFormForAdd"....class="btn btn-primary btn-sm mb-3">click to Add new Student</a> <BR><BR> 
 <table  class="table table-bordered table-striped"> 
  <thead class="thead-dark">
    <tr>                 
      <th>First Name</th>                 
      <th>Last Name</th>                 
      <th>Course</th>                 
      <th>Country</th>                 
      <th>Action</th>
     </tr>
    </thead>
  <tbody>          
   <c:forEach items="${students}" var="student" > 			
    <tr>               
     <td>${student.firstName}</td>                 
     <td>${student.lastName}</td>                 
     <td>${student.course}</td>                 
     <td>${student.country}</td>                
     <td><a href="showFormForUpdate?studentId=${student.studentId}" class="btn btn-info btn-sm"> Update</a>                
        <a href="delete?studentId=${student.studentId}" class="btn btn-danger btn-sm" 
        onclick="if (!(confirm('Are you sure you want to delete this Student?'))) return false">Delete</a></td>             
     </tr>
   </c:forEach>
   </tbody>
  </table>
</div>
</body>
</html>