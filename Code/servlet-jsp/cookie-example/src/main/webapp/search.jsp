<html>
    <head>
        <title>Session Tracking Example 1</title>
    </head>
    <body>
    <center>

<%
    Cookie[] cks = request.getCookies(); // get All Cookies from request
    String lastSearch = "";
    if(cks!=null) {
        for(Cookie ck : cks) { // get Cookie One by One
            if("search".equals(ck.getName())) { // Check if cookie name is 'search'
                lastSearch = ck.getValue(); // get the cookie value of its name is 'search'
                break;
            }
        }
    }
%>

               <h3>Your Previous Search:<h3>
                  <h4><%= lastSearch.replace("_", " ") %></h4>
            <hr/>
            <h1>Search Any Details</h1>
            <form action='result'>
                Search For : <input type='text' name='q'>
                <br/><br/>
                 <button type='submit'>Send</button>
            </form>
     </center>
    </body>
</html>