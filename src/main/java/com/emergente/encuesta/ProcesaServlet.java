
package com.emergente.encuesta;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre= request.getParameter("nombre");
        String lenguajes[]= request.getParameterValues("Lenguajes");
        
        //crear un objeto para encapsular la informacion
        
        Encuesta encu = new Encuesta();
        
        //llenar datos en el objeto encu
        
        encu.setNombre(nombre);
        encu.setLenguajes(lenguajes);
        
        //colocamos el objeto encu como atributo de request
        
        request.setAttribute("encu", encu);
        
        //enviar el objeto request a salida.jsp
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }


}
