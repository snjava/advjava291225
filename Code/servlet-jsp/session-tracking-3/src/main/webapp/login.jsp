<html>
<body>
<h2>User Login</h2>
<%
    String message="";
    String color="";
    String msg = request.getParameter("msg");
    if(msg != null) {
        switch(msg) {
            case "invalid":
                message = "Invalid User Name or Password";
                color = "red";
                break;
            case "logout":
                message = "You Have Been logged Out successfully...";
                color = "green";
                break;
            case "timeout":
                message = "Your Session has expired. Please Login Again";
                color = "yellow";
                break;
            case "error":
                message = "Something Went Wrong. Please try Again or contact Admin.";
                color = "red";
                break;
        }
    } else {
        message="";
        color="";
    }
%>
<h3 style="color:<%=color%>"> <%= message %> </h3>
<form action='auth' method='post'>
    Enter User Name : <Input type='text' name='username'>
    <br/><br/>
    Enter Password : <Input type='password' name='userpassword'>
        <br/><br/>
    <button type='submit'>Sign-in</button>
    <br/><br/>
    <a href='register.jsp'> Not Yet Register? </a> <br/> <a href='#'> Forgot Password? </a>
</form>
</body>
</html>
