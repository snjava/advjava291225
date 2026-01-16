<html>
    <head>
        <title>User Login JSP</title>
        <style>
            h1 {
                color: green;
            }
            button {
                background-color:red;
            }
        </style>
        <script>
            alert("In Am FROM JSP PAGE and JS alert");
        </script>
    </head>
    <body>
        <h1>User Login JSP Page</h1>
        <form action='user-auth'>
            Enter User name : <input type="text" name ="uname">
            </br></br>
            Enter Password : <input type="password" name ="upass">
            </br></br>
            <button type="submit">Login</button>
        </form>
    </body>
</html>