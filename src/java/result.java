

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author luis eduardo da silva reif 
 */
public class result extends HttpServlet {


   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        char q1, q2, q3, q4, q5, q6, q7, q8;
        q1  = request.getParameter("q1").charAt(0);
        q2  = request.getParameter("q2").charAt(0);
        q3  = request.getParameter("q3").charAt(0);
        q4  = request.getParameter("q4").charAt(0);
        q5  = request.getParameter("q5").charAt(0);
        q6  = request.getParameter("q6").charAt(0);
        q7  = request.getParameter("q7").charAt(0);
        q8  = request.getParameter("q8").charAt(0);
        
        int soma = this.calcTotal(q1, q2, q3, q4, q5, q6, q7, q8);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");            
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container-md m-6 text-center\">\n");
            out.println("<h2 class=\"text-center m-5\">voçe é :<br></h2>");
            out.println("<div class=\"alert alert-success  \" role=\"alert\">");
            out.println("<h1 class=\"text-center\">" + this.resultado(soma) + "</h1>");
            out.println("</div>");
            out.println("<br><a href=\".\\\" class=\"btn btn-primary btn-lg \">voltar</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private String resultado(int soma ){
       if(soma <= 10)
           return "Homen-Aranha";
       else if(soma <= 13)
           return "Doutor Estranho";
       else if(soma <= 16)
           return "Feiticera Escarlate";
       else if(soma <= 19)
           return "Thor";
       else if(soma <= 22)
           return "Hulk";
       else if(soma <= 25)
           return "Viuva-Negra";
       else if(soma <= 28)
           return "Homen de Ferro";
       else if(soma <= 32)
           return "Capitao America";
       else
           return "Sem Resultado ";
    }
           
    private int calcTotal(char q1, char q2, char q3, char q4, char q5, char q6, char q7, char q8){
     return this.calcQ1(q1) + this.calcQ2(q2) + this.calcQ3(q3) + this.calcQ4(q4)+ this.calcQ5(q5)
             + this.calcQ6(q6) + this.calcQ7(q7) + this.calcQ8(q8);
    }
    
    private int calcQ1(char r){
        switch(r){
            case 'a': return 4;
            case 'b': return 2;
            case 'c': return 3;
            case 'd': return 1;
            default : return 0;
            }
        }
    
    private int calcQ2(char r){
        switch(r){
            case 'a': return 4;
            case 'b': return 3;
            case 'c': return 2;
            case 'd': return 1;
            default : return 0;
            }
        }
    
     private int calcQ3(char r){
        switch(r){
            case 'a': return 3;
            case 'b': return 4;
            case 'c': return 1;
            case 'd': return 2;
            default : return 0;
            }
        }
     
    private int calcQ4(char r){
        switch(r){
            case 'a': return 1;
            case 'b': return 4;
            case 'c': return 2;
            case 'd': return 3;
            default : return 0;
            }
        }
    
    private int calcQ5(char r){
        switch(r){
            case 'a': return 1;
            case 'b': return 2;
            case 'c': return 3;
            case 'd': return 4;
            default : return 0;
            }
        }
    
    private int calcQ6(char r){
        switch(r){
            case 'a': return 2;
            case 'b': return 1;
            case 'c': return 4;
            case 'd': return 3;
            default : return 0;
            }
        }
    
    private int calcQ7(char r){
        switch(r){
            case 'a': return 3;
            case 'b': return 1;
            case 'c': return 2;
            case 'd': return 4;
            default : return 0;
            }
        }
    
    private int calcQ8(char r){
        switch(r){
            case 'a': return 2;
            case 'b': return 1;
            case 'c': return 3;
            case 'd': return 4;
            default : return 0;
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


