package com.amil.amil_parcial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExamen extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Evaluacion e = new Evaluacion();
        
        DAOApoyo daoa = new DAOApoyo();
        
        try {
            daoa.guardar(e);
            RequestDispatcher despachador = request.getRequestDispatcher("/respuesta.jsp");
            despachador.forward(request,response);
            
        } catch (Exception ex) {
            
        }
    }

}
