<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fil Rouge 402 - New Article</title>
</head>

<body>

<h1>Créer un nouvel article</h1>

<form action="createnewarticle.jsp" method="post">
    Title :<br />
    <input type="text" name="title"><br/>
    Author :<br />
    <input type="text" name="author"><br />
    Category :<br />
    <select name="category">
        <option value="category1">Category 1</option>
        <option value="category2">Category 2</option>
        <option value="category3">Category 3</option>
    </select><br />
    Image :<br />
    <input type="image" name="image"><br />
    Content :<br />
    <textarea name="content" cols="20" rows="30"></textarea><br />
    Date :<br />
    <input type="date" name="datetime"><br /><br />
    <input type="submit" name="Create a new article">

</form>

</body>
</html>
