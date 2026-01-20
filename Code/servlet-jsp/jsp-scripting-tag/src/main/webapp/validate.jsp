<html>
<body>
<h2>Validate Page</h2>
<%
String name = request.getParameter("uname");
String pass = request.getParameter("upasssword");
if("admin".equals(name) && "admin@123".equals(pass)) {
    out.print("<h1>Welcome User...</h1>");
} else {
     out.print("<h1>Invalid User Name or Password...</h1>");
}
%>
    </body>
</html>
