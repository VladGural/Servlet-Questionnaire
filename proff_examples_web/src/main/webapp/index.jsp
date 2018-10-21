<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Page</title>
</head>
<body>
<h1 style="color:red">Simple test</h1>


<form action="/qwestionservlet">
    <p>Enter your name
        <input type = "text" name = "name" placeholder="firstname">
    </p>
    <p>Enter your surname
        <input type = "text" name = "surname" placeholder="lastname">
    </p>
    <p>Enter your age
        <input type = "text" name = "age" placeholder="age">
    </p>
    <p>There ara something qwestions for you</p>
    <p>Do you like music?</p>
        <input type = "radio" name = "question1" value="yes" checked> Yes <br>
        <input type = "radio" name = "question1" value="no"> No <br>
    <p>Do you like cinema?</p>
        <input type = "radio" name = "question2" value="yes" checked> Yes <br>
        <input type = "radio" name = "question2" value="no"> No <br>
    <p>Do you like sport?</p>
        <input type = "radio" name = "question3" value="yes" checked> Yes <br>
        <input type = "radio" name = "question3" value="no"> No <br>
    <input type="submit">
</form>


</body>
</html>
