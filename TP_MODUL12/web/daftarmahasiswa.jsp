<%@page import="classes.JDBC, java.sql.ResultSet"%>

<table border="1"> 
    <% 
        JDBC db = new JDBC(); 
        if (db.isConnected) { 
        ResultSet rs = db.getData("select * from mahasiswa"); 
        while (rs.next()) { 
        out.print("<tr>"); 
        out.print("<td>" + rs.getString("nama") + "</td>"); 
        out.print("<td>" +rs.getString("jurusan")+ "</td>"); 
        out.print("<td>" +rs.getInt("angkatan")+ "</td>"); 
        out.print("<td>" +rs.getDouble("ipk")+ "</td>"); 
        out.print("</tr>"); 
        } 
        db.disconnect(); 
        } else { 
        out.print(db.message+"<br />"); 
        } 
    %> 
</table>