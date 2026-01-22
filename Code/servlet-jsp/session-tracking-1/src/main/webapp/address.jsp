<html>
    <head>
        <title>Session Tracking Example 1</title>
    </head>
    <body>
    <center>
            <h2>Step 2 of 4</h2>
            <hr>
            <h1>User Address Details</h1>
            <%
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String contact = request.getParameter("contact");
            %>
            <form action='education.jsp'>
                <input type='hidden' name='name' value='<%= name %>'>
                <input type='hidden' name='email' value='<%= email %>'>
                <input type='hidden' name='contact' value='<%= contact %>'>
                Enter City : <input type='text' name='city'>
                <br/><br/>
                 Enter Pincode : <input type='text' name='pincode'>
                <br/><br/>
                <button type='submit'>Next</button>
            </form>
     </center>
    </body>
</html>