<html>
<body>
<h2>Scripting Tag Demo</h2>

<%
    int a = 6;
    for(int i = 1 ; i <= 10; i++) {
%>
        <%= a + " * " + i +  " = " + ( i * a) %>
        <br/>
<%
    }
%>

Cube : <%= a* a * a  %>
<br/>
Multiply  : <%= m2()  %>
<%!
    int x = 10;
    static int y = 20;
    public void m1() {
        System.out.println(x * y);
    }
    public int m2() {
            return (x * y);
        }
%>

<%
    m1();
%>

</body>
</html>
