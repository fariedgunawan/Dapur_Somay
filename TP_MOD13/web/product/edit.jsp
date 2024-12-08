<%@page import="classes.JDBC"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Barang</title>
</head>
<body>
    <h1>Edit Barang</h1>
    <%
        JDBC db = new JDBC();
        int id = 0;
        String nama = "";
        int quantity = 0;
        double price = 0.0;

        if (request.getParameter("id") != null) {
            id = Integer.parseInt(request.getParameter("id"));
        }

        if (db.isConnected && id > 0) {
            ResultSet rs = db.getData("SELECT * FROM barang WHERE id = " + id);
            if (rs.next()) {
                nama = rs.getString("nama");
                quantity = rs.getInt("quantity");
                price = rs.getDouble("price");
            }
            db.disconnect();
        }
    %>
    <form action="edit.jsp" method="POST">
        <input type="hidden" name="id" value="<%= id %>">
        <label for="nama">Nama Barang:</label>
        <input type="text" id="nama" name="nama" value="<%= nama %>" required>
        <br><br>

        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" value="<%= quantity %>" required>
        <br><br>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" step="0.01" value="<%= price %>" required>
        <br><br>

        <button type="submit">Update Barang</button>
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            id = Integer.parseInt(request.getParameter("id"));
            String namaInput = request.getParameter("nama");
            String quantityInput = request.getParameter("quantity");
            String priceInput = request.getParameter("price");

            if (namaInput != null && !namaInput.isEmpty() && quantityInput != null && priceInput != null) {
                try {
                    int updatedQuantity = Integer.parseInt(quantityInput);
                    double updatedPrice = Double.parseDouble(priceInput);

                    db = new JDBC();
                    if (db.isConnected) {
                        String query = "UPDATE barang SET nama = '" + namaInput + "', quantity = " + updatedQuantity + ", price = " + updatedPrice + " WHERE id = " + id;
                        db.runQuery(query);
                        db.disconnect();
                        response.sendRedirect("view.jsp");
                    } else {
                        out.println("<p>Error: " + db.message + "</p>");
                    }
                } catch (NumberFormatException e) {
                    out.println("<p>Error: Format input tidak valid.</p>");
                }
            } else {
                out.println("<p>Error: Semua field wajib diisi.</p>");
            }
        }
    %>
</body>
</html>
