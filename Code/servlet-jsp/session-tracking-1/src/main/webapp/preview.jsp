<html>
    <head>
        <title>Session Tracking Example 1</title>
    </head>
    <body>
    <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String contact = request.getParameter("contact");
            String city = request.getParameter("city");
            String pincode = request.getParameter("pincode");
            String degree = request.getParameter("degree");
            String percent = request.getParameter("percent");
            String year = request.getParameter("year");
        %>
    <center>
            <h2>Step 4 of 4</h2>
            <hr>
            <h3><a href='save?name=<%=name%>&contact=<%=contact%>&email=<%=email%>&city=<%=city%>&pincode=<%=pincode%>&degree=<%=degree%>&year=<%=year%>&percent=<%=percent%>'> Review And Save </a></h3>
            <hr>
            <h3>Personal Details</h3>
                 <h4>Name : <%=name%> </h4>
                 <h4>Email : <%=email%> </h4>
                 <h4>Contact : <%=contact%></h4>
            <hr>
            <h3>Address Details</h3>
                <h4>City : <%=city%></h4>
                <h4>Pincode : <%=pincode%></h4>
            <hr>
            <h3>Educational Details</h3>
                 <h4>Degree : <%=degree%></h4>
                 <h4>Percent : <%=percent%></h4>
                 <h4>Passing Year : <%=year%></h4>
             <hr>
     </center>
    </body>
</html>