
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author facu_
 */
@WebServlet(name = "Aritmetica", urlPatterns = {"/Aritmetica"})
public class Aritmetica extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operaciones Aritmeticas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Operaciones Fundamentales de la aritmetica</h1>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Primer numero : ");
            out.println("<input type='text' name='num1' required>");
            out.println("<br><br> Operador ");
            out.println("<input type='text' name='operador' placeholder='Seleccione un operador' list='operadorList'>");
            out.println("<datalist id='operadorList'>");
            out.println("<option value='sumar'>");
            out.println("<option value='restar'>");
            out.println("<option value='multiplicar'>");
            out.println("<option value='dividir'>");
            out.println("</datalist>");
            out.println("<br><br>");
            out.println("Segundo numero: ");
            out.println("<input type='text' name='num2' required>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        double num1=Double.parseDouble(request.getParameter("num1"));
        double num2=Double.parseDouble(request.getParameter("num2"));
        String operador=request.getParameter("operador");
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operaciones Aritmeticas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Operaciones Fundamentales de la aritmetica</h1>");
            out.println("<br><br>");
            switch(operador){
            case "sumar":
                double suma=num1+num2;
                out.println("la suma de "+num1+" + "+num2+ " = "+suma);
                break;
            case "restar":
                double resta=num1-num2;
                out.println("la resta de "+num1+" - "+num2+ " = "+resta);
                break;
            case "multiplicar":
                double producto=num1*num2;
                out.println("el producto de "+num1+" * "+num2+ " = "+producto);
                break;
            case "dividir":
                double cociente=num1/num2;
                out.println("el cociente de "+num1+" / "+num2+ " = "+cociente);
                break;
            default:
                out.println("Debe seleccionar un operador aritmetico");
                break;
            }
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
