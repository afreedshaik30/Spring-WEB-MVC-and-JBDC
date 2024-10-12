<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Student Management</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="index.jsp">Student Management</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addStudentPage">Add Student</a>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Container for Content -->
    <div class="container">
        <h2 class="mt-4 mb-4">Student Management System</h2>

        <!-- Add Student Button -->
        <a href="addStudentPage" class="btn btn-primary mb-4">Add Student</a>

        <!-- Student Table -->
        <table class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>Student ID</th>
                    <th>Name</th>
                    <th>Branch</th>
                    <th>Marks</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="student" items="${studentList}">
                    <tr>
                        <td>${student.id}</td> <!-- Display student ID using EL -->
                        <td>${student.name}</td> <!-- Display student name using EL -->
                        <td>${student.branch}</td> <!-- Display student branch using EL -->
                        <td>${student.marks}</td> <!-- Display student marks using EL -->
                         <td>
                              <!-- Update and Delete buttons for each student -->
                              <a href="update-student.jsp?id=${student.id}" class="btn btn-info">Update</a>
                              <a href="deleteStudent?id=${student.id}" class="btn btn-danger" onclick="return confirm('Are you sure you want to delete this student?');">Delete</a>
                         </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Include Bootstrap JS and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
