package apresentacao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index")
public class Index extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//String cpf = request.getParameter("cpf");
		//String senha = request.getParameter("senha");

		String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");

	    if (cpf.isEmpty()|| senha.isEmpty()) 
	    {
	        System.out.println("Todos os campos devem ser preenchidos");
	        response.sendRedirect("index.jsp");
	        
        }else
        {
        	System.out.println(cpf);
        }
	}
	
}
