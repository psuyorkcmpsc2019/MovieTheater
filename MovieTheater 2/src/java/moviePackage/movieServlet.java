/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviePackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author angeljoelperez
 */
public class movieServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
     
            
        }
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
 
        String url ="/Welcome.html";
        String action =request.getParameter("action");
        switch (action) {
            case "add" :
            url = "/BookingPage.html";
            break;
            case "film":
            url = "/Entername.html";
            break;
            case "final":
            url = "/Receipt.jsp";
            break;
            case "default":
            url = "/Welcome.html";
            break;
            

            }
       
            String locationName = request.getParameter("Location");
            String movieName = request.getParameter("Movielist");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String ticketQuantity = request.getParameter("ticketQuantity");
            System.out.println(locationName);
            System.out.println(movieName);
            System.out.println(firstName + lastName + ticketQuantity);
            movieData user = new movieData(firstName,lastName,ticketQuantity);

        // forward request and response objects to specified URL
        
            getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);

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
