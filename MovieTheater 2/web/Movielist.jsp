<%-- 
    Document   : Movielist
    Created on : Apr 26, 2019, 12:51:48 PM
    Author     : cqynk
--%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <%ResultSet resultset =null;%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
<%
      String className=null;
        String url=null;
        String user = null;
        String password = null;
     
        try
        {
            ResourceBundle resources;
            InputStream in = null;
            ResourceBundle newResources;

            in = ClassLoader.getSystemResourceAsStream("db.properties");

            resources = new PropertyResourceBundle(in);

            in.close();

            className = resources.getString("jdbc.driver");
            url = resources.getString("jdbc.url");
            System.out.println(url);
            user = resources.getString("jdbc.user");
            password = resources.getString("jdbc.password");
        }
        catch (Exception exp)
        {
            System.out.println("Couldn't load resources." + exp);
            System.exit(-1);
        }
        
         try
        {
            Class.forName(className);
        }
        catch (Exception e) 
        {
            System.out.println("Failed to load  driver.");
            return;
        }
    
    
    
    try{

            Connection con = DriverManager.getConnection(url,user,password);     
                
            Statement stmt = con.createStatement();


       resultset =stmt.executeQuery("SELECT MOVIETITLE FROM MOVIEINFO") ;
%>

<center>
        <select required style="font-size:15pt;color: #0066ff ">
        <%  while(resultset.next()){ %>
            <option><%= resultset.getString(2)%></option>
        <% } %>
        </select>
</center>

<%
        }
        catch(Exception e)
        {
             out.println("Error"+e);
        }
%>
    </body>
</html>
