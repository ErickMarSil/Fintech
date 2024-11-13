<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>

<form action="/hello-servlet" method="post">
  <div class="form-group">
    <div class="input-group">
      <span class="input-group-addon"><i class="fa fa-envelope ti-email"></i></span>
      <input name="user_email" type="email" class="form-control" placeholder="Your email">
    </div>
  </div>
  <button class="btn btn-primary btn-block" >Sign up</button>
</form>
</html>