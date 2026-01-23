<html>
    <head>
        <title>Session Tracking Example 1</title>
    </head>
    <body>
    <center>
            <h2>Step 3 of 4</h2>
            <hr>
            <h1>User Education Details</h1>
            <%
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String contact = request.getParameter("contact");
                String city = request.getParameter("city");
                String pincode = request.getParameter("pincode");
            %>
            <form action='preview.jsp'>
                 Degree : <input type='text' name='degree'>
                <br/><br/>
                 Percent : <input type='number' name='percent'>
                <br/><br/>
                Passing Year : <input type='text' name='year'>
                 <br/><br/>
                <button type='submit'>Preview</button>
                <input type='hidden' name='name' value='<%= name %>'>
                <input type='hidden' name='email' value='<%= email %>'>
                <input type='hidden' name='contact' value='<%= contact %>'>
                <input type='hidden' name='city' value='<%= city %>'>
                <input type='hidden' name='pincode' value='<%= pincode %>'>
            </form>
     </center>
    </body>
</html>