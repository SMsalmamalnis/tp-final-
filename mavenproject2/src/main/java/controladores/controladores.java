/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controladores;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDao.SedeDao;
import modelos.Sede;


/**
 *
 * @author salma
 */
@WebServlet(name = "controladores", urlPatterns = {"/controladores"})
public class controladores extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String accion = request.getParameter("Access");

        SedeDao s = new SedeDao();
        List<Sede> listaSede = s.listaSede;
        if (accion.equalsIgnoreCase("verSedes")) {
            acceso = "vistas/verSedes.jsp";
            
        } else {
            // Handle the case when the "access" parameter is not provided or has an invalid value
            // For example, you can redirect to an error page or set a default view.
            acceso = "vistas/error.jsp";
        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }
}
