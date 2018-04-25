/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import datos.BD_Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Rutina;
import logica.RutinaMasaMuscular;
import logica.RutinaPeso;
import logica.Usuario;

/**
 *
 * @author GOLDS
 */
@WebServlet(urlPatterns = {"/GimnasioServlet"})
public class GimnasioServlet extends HttpServlet {

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
        
        Rutina r;
 
        Usuario s= new Usuario();
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GimnasioServlet</title>");
            out.println("<link rel=\"stylesheet\" href=\"estilo.css\">");
            out.println("<script type=\"text/javascript\" src=\"funciones.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GimnasioServlet at " + request.getContextPath() + "</h1>");
            s.setGenero(request.getParameter("generoSelect"));
            s.setNombre(request.getParameter("nombre"));
            s.setTelefono(request.getParameter("tel"));
            s.setEmail(request.getParameter("email"));
            s.setEdad(Integer.parseInt(request.getParameter("edad")));
            s.setPeso(Integer.parseInt(request.getParameter("peso")));
             
          
           
            
            if(request.getParameter("tipo").equals("p")){
                
                r=new RutinaMasaMuscular();
                
                out.println("<table border=1px>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Usted :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getNombre());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Con telefono :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getTelefono());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Con Email :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getEmail());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Con Peso de :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getPeso());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Edad :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getEdad());
                out.println("</td>" );
                out.println("</tr>");
                out.println("</table>");
                out.println("<h2>");
                out.println("Se le ha asignado la siguiente rutina");
                out.println("</h2>");
                out.println("<table border=1px>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 1 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>" );
                out.println("<td>");
                out.println("<a href='MMDia1html.html'>Ver imagen</a>");
                out.println("</td");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 2 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>");       
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 3 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 4 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>");
                out.println("</tr>");
                
                out.println("</table>");
            
            } else{
                r= new RutinaPeso();
                
                out.println("<table border=1px>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Nombre :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getNombre());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Telefono :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getTelefono());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Email :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getEmail());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Con Peso de :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getPeso());
                out.println("</td>" );
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Edad :");
                out.println("</td>");
                out.println("<td>");
                out.println(s.getEdad());
                out.println("</td>" );
                out.println("</tr>");
                out.println("</table>");
                out.println("<h2>");
                out.println("Se le ha asignado la siguiente rutina");
                out.println("</h2>");
                out.println("<table border=1px>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 1 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>" );
                out.println("<td>");
                out.println("<a href='PDia1html.html'>Ver imagen</a>");
                out.println("</td");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 2 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 3 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Dia 4 :");
                out.println("</td>");
                out.println("<td>");
                out.println(r.generarRutina());
                out.println("</td>");
                out.println("</tr>");
                
                out.println("</table>");
            
            
            }
            
            
            out.println("</body>");
            out.println("</html>");
            
        }
            
            BD_Usuario conDb= new BD_Usuario();
            conDb.insertarUsuario(s);
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
