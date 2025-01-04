<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
</head>
<body>
    <h1>Register</h1>
    <form action="${pageContext.request.contextPath}/register" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" required /><br><br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required /><br><br>
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required /><br><br>
        <input type="submit" value="Register" />
    </form>

    <c:if test="${not empty errorMessage}">
        <p style="color: red;">${errorMessage}</p>
    </c:if>
</body>
</html>
