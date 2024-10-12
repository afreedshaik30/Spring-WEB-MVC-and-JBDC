<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="in.sp.entity.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 20px;
            background-color: #f8f9fa;
        }
        h2 {
            color: #333;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 2px 2px 12px #aaa;
            max-width: 400px;
        }
        div {
            margin-bottom: 15px;
        }
        label {
            margin-bottom: 5px;
            display: block;
            font-weight: bold;
        }
        input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
        a {
            text-decoration: none;
            color: #007bff;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Add Student</h2>
    <form action="addStudent" method="post">
        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div>
            <label for="marks">Marks:</label>
            <input type="number" id="marks" name="marks" required>
        </div>
        <div>
            <label for="branch">Branch:</label>
            <input type="text" id="branch" name="branch" required>
        </div>
        <button type="submit">Add Student</button>
    </form>
    <br>
    <a href="index.jsp">  >> BACK to HOME</a>
</body>
</html>
