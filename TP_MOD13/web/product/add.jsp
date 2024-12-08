<%@page import="classes.JDBC"%>
<!DOCTYPE html>
<html>
<head>
    <title>Tambah Barang</title>
</head>
<body>
    <h1>Tambah Barang</h1>
    <form action="add.jsp" method="POST">
        <label for="nama">Nama Barang:</label>
        <input type="text" id="nama" name="nama" required>
        <br><br>

        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required>
        <br><br>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" step="0.01" required>
        <br><br>

        <button type="submit">Tambah Barang</button>
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String nama = request.getParameter("nama");
            String quantityParam = request.getParameter("quantity");
            String priceParam = request.getParameter("price");

            if (nama != null && !nama.isEmpty() && quantityParam != null && priceParam != null) {
                try {
                    int quantity = Integer.parseInt(quantityParam);
                    double price = Double.parseDouble(priceParam);

                    JDBC db = new JDBC();
                    if (db.isConnected) {
                        String query = "INSERT INTO barang (nama, quantity, price) VALUES ('" + nama + "', " + quantity + ", " + price + ")";
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
