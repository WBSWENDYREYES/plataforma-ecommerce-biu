package CapaControlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import CapaDatabase.Usuario;
import CapaDatabase.UsuarioDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet  extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("email");
        String contrasena = request.getParameter("password");

        // Lógica de validación simple (ejemplo)
        if ("admin".equals(usuario) && "1234".equals(contrasena)) {
            // Inicio de sesión exitoso
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            response.sendRedirect("bienvenido.jsp");
        } else {
            // Fallo en el inicio de sesión
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
            
        
    }   

    
    
}
