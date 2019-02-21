<%-- 
    Document   : addMM
    Created on : Aug 26, 2018, 11:38:41 AM
    Author     : Erandi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page import="java.sql.*"%>

<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost/";
String database = "track&field";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        
        <jsp:include page="eventhome.jsp"/>
         
        <link href="../inventory/CSS/calender.css" rel="stylesheet" type="text/css"/>         
        <script src="../inventory/JS/calender.js" type="text/javascript"></script>
        
        <link rel="stylesheet" type="text/css" href="css/show.css">
        <title>Event Management</title>
    </head>
    <body onload="displayCalendar()">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="events.jsp">Event Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="eventForm.jsp">Add Events</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="eventShow.jsp">Update Events</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Event Chart</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="MMhome.jsp">Meet Manager</a>
                    </li>
                </ul>
            </div>
        </nav>
        <h1 style="color: darkslateblue" align="center">Assign Meet Manager</h1>
        <br><br><br>
        
        
        <div class="container">
		<div class="row">
                    <div class="col-md-8">
                        <table align="center">
                        <tr>
                            <th>Meet Manager ID</th>   
                            <th>Meet Manager Name</th>
                        </tr>  
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="(select * from userlogin where userid like 'm%' )";
resultSet = statement.executeQuery(sql);

while(resultSet.next()){
    
%>
                        <tr>
                            <td><%=resultSet.getString("userid") %></td>
                            <td><%=resultSet.getString("username") %></td>

                            <td>
                                <form action="assignMM.jsp" method="POST">
                                    <input name="userid" type="text" value="<%=resultSet.getString("userid") %>" hidden>
                                    <input name="username" type="text" value="<%=resultSet.getString("username") %>" hidden>
                                    
                                    <button type="submit" name="Assign">Assign</button>
                                </form>
                            </td>
                            <td>
                                <form action="TasksMM.jsp" method="POST">
                                    <input name="userid" type="text" value="<%=resultSet.getString("userid") %>" hidden>
                                    <input name="username" type="text" value="<%=resultSet.getString("username") %>" hidden>
                                    <button type="submit" name="Tasks">Tasks</button>
                                </form>
                            </td>
                        </tr>
<%
}


connection.close();
} catch (Exception e) {
        e.printStackTrace();
}
%>
                        <tr>
                            <td><button type="submit" name="back" align="center" onclick="location.href='MMhome.jsp'">Back</button></td>                            
                        </tr>
                    </table>
                    </div>
                    <div class="col-md-4">
			<div class="card mx-auto" style="width: 20em; height: 51em">
                            <img class="card-img-top mx-auto" style="width:60%" src="pics/user.png" alt="Card image cap"/>
                            <div class="card-body">
                             <h5 class="card-title">User Information</h5>
                            <p class="card-text"><i class="fas fa-user">&nbsp;</i>${adminId}</p>
                            <p class="card-text"><i class="fas fa-user">&nbsp;</i>${adminName}</p>
                            <p class="card-text"><i class="fa fa-user-cog">&nbsp;</i>${type}</p>
        		    
                            <a href="#" name="logout" id="logout" onclick="location.href='../itpLogin.jsp'" class="btn btn-primary"><i class="fas fa-sign-out-alt">&nbsp;</i>Logout</a>
			    
                            
                            
                            <br><br><br><br>
                            
                            
                            <div id="calendar">
                                
                            </div>
                                 
                                  
                                  </div>                                  
				</div>
			</div>
                </div>
        </div>
        
    </body>
</html>
+