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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("LoginServlet funciona");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String contrasena = request.getParameter("password");

        Usuario usuario = UsuarioDao.buscarPorEmail(email);

        // Verificar si existe el usuario
        if (usuario != null) {

            // Verificar la contraseña
            if (usuario.getPassword().equals(contrasena)) {

                // Crear sesión
                HttpSession session = request.getSession();

                // Guardar el objeto Usuario en la sesión
                session.setAttribute("usuario", usuario);

                // Ir a la página principal
                response.sendRedirect(request.getContextPath() + "/bienvenido.jsp");

            } else {

                // Contraseña incorrecta
                request.setAttribute("error", "Contraseña incorrecta");

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher("/error.jsp");

                dispatcher.forward(request, response);
            }

        } else {

            // Usuario no encontrado
            request.setAttribute("error", "El usuario no existe");

            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("/error.jsp");

            dispatcher.forward(request, response);
        }
    }
}
