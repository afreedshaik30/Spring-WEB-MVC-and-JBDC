<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="in.sp.model.Student" %>

<!DOCTYPE html>
<html>
<head>
       <title>Student List</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2 class="text-center mt-4">Student List</h2>
    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Course</th>
            </tr>
        </thead>
        <tbody>
                    <%
                        List<Student> students = (List<Student>) request.getAttribute("students");
                        for (Student student : students)
                        {
                    %>
                        <tr>
                            <td><%= student.getId() %></td> <!-- Display student ID -->
                            <td><%= student.getName() %></td> <!-- Display student name -->
                            <td><%= student.getCourse() %></td> <!-- Display student course -->
                        </tr>
                    <%
                        }
                    %>
        </tbody>
    </table>
</div>
</body>
</html>
