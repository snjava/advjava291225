<html>
<body>
<h3><a href='logout'>Logout</a></h3>
<center
<%
    String name = (String) session.getAttribute("uname");
    if(name == null) {
        response.sendRedirect("login.jsp?msg=timeout");
    }
%>


<h2>Welcome User, <%= session.getAttribute("uname") %> </h2>
<h4>Email: <%= session.getAttribute("uemail") %></h4>
<h4>Contact: <%= session.getAttribute("ucontact") %></h4>
<center>
</body>
</html>
