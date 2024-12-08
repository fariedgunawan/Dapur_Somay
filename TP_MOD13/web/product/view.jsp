<%-- 
    Document   : view
    Created on : 8 Dec 2024, 21.15.34
    Author     : farie
--%>

<%@page import="java.sql.*" %>
<%@page import="classes.JDBC" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Barang</title>
</head>
<body>
    <h1>Daftar Barang</h1>
    <button onclick="location.href='add.jsp'">Tambah Barang</button>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <%
                JDBC db = new JDBC();
                if (db.isConnected) {
                    ResultSet rs = db.getData("SELECT * FROM barang");
                    while (rs.next()) {
            %>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("nama") %></td>
                <td><%= rs.getInt("quantity") %></td>
                <td><%= rs.getBigDecimal("price") %></td>
                <td>
                    <button onclick="location.href='edit.jsp?id=<%= rs.getInt("id") %>'">Edit</button>
                </td>
            </tr>
            <%
                    }
                    db.disconnect();
                } else {
                    out.println("<tr><td colspan='5'>Error: " + db.message + "</td></tr>");
                }
            %>
        </tbody>
    </table>
</body>
</html>

