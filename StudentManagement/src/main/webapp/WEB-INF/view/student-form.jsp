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
<title>Student Form</title>
 <style>
      body {
        background-color: #e6ebef;
      }
      h1 {
        background-color: #1c87c9;
      }
      label {
        display: inline-block;
        width: 20px;
        text-align: right;
      }
  </style>
 </head>
 <body>
     <h1 ALIGN = "CENTER" >CollegeFest Student Management System</h1><br>
    <div>
      <form action="save" method="POST">
  </div>  
      <div>
         <h3>Student Form for ${mode}</h3>
    <!--   <div class="form-inline">  -->
         <input type="hidden" name="studentId" value="${student.studentId}"/> 
         <label for="firstName">FirstName</label>    
          <input type="text" name="firstName" value="${student.firstName}" class="form-control mb-4 col-4" placeholder="First Name" > 
          <label for="lastName">LastName</label>    
          <input type="text" name="lastName" value="${student.lastName}" class="form-control mb-4 col-4" placeholder="Last Name" > 
          <label for="course">Course</label>        
          <input type="text" name="course" value="${student.course}" class="form-control mb-4 col-4" placeholder="Course" > 
          <label for="country">Country</label>
          <input type="text" name="country" value="${student.country}" class="form-control mb-4 col-4" placeholder="Country" >  
          <button type="submit" class="btn btn-info col-2" > Save</button><br><br>         
       </form>   
         </div>     
       <a href="list">  Back to Students List</a> 
</body>
</html>