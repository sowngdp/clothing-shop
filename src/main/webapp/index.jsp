<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
    <input type="text" name="name"/>
    <input type="submit" value="Say Hello" onclick="sayHello()"/>
<script>
    function sayHello() {
        var name = document.getElementsByName("name")[0].value;
        window.location.href = "/hello/" + name;
    }
</script>
</body>
</html>