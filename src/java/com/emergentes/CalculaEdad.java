package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author facu_
 */
@WebServlet(name = "CalculaEdad", urlPatterns = {"/CalculaEdad"})
public class CalculaEdad extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular Edad</title>");
            out.println("</head>");
            out.println("<body>");
             out.println("<h1>Calcula la edad de una persona doGET</h1>");
            String nombre=request.getParameter("nombre");
            int anio=Integer.parseInt(request.getParameter("anio"));
            
            Calendar fecha=Calendar.getInstance();
            int añoActual=fecha.get(Calendar.YEAR);
            int edad;
            edad=añoActual-anio;
            if(nombre!=null && anio!=0){
                out.println("<br>Eres <strong>"+nombre+"</strong> <br> naciste el año "+anio+" y actualmente tienes : <strong>"+edad+"</strong>  años.");
            }
            else{
            out.println("debes introducir desde url ejemplo ?nombre=Juan Facundo Quispe Alvarado&anio=1988");  
            }
            
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
