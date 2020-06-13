<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2 style="color:red;"align="center">Durga Software Solutions</h2>
    <h3 style="color:blue;"align="center">User Hello page</h3>

     <form method="POST" action="login">
            <table align="center">
               <tr>
                   <td>User Name</td>
                   <td><input type="text" name="uname"></td>
               </tr>
               <tr>
                   <td>Password</td>
                   <td><input type="text" name="upwd"></td>
               </tr>
               
               <tr>
                   <td><input type="submit" value="login">
                </td></tr>
           </table>
     </form>

</body>
</html>