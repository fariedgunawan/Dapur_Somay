/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import classes.JDBC;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author farie
 */

@WebServlet(name = "MahasiswaServlet", urlPatterns = {"/MahasiswaServlet"})
public class MahasiswaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    JDBC db = new JDBC();
    if (db.isConnected) {
        try {
            String nama = request.getParameter("nama");
            String jurusan = request.getParameter("jurusan");
            String angkatan = request.getParameter("angkatan");
            String ipk = request.getParameter("ipk");

            if (nama != null && jurusan != null && angkatan != null && ipk != null) {
                int angkatanInt = Integer.parseInt(angkatan);
                double ipkDouble = Double.parseDouble(ipk);

                String query = "insert into mahasiswa (nama, jurusan, angkatan, ipk) VALUES ('"
                        + nama + "', '"
                        + jurusan + "', "
                        + angkatanInt + ", "
                        + ipkDouble + ")";
                db.runQuery(query);
            } else {
                System.out.println("Input tidak valid.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.disconnect();
        }
    } else {
        System.out.println("Koneksi ke database gagal: " + db.message);
    }
    response.sendRedirect("daftarmahasiswa.jsp");
}



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
