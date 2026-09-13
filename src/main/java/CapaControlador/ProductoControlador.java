package CapaControlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import CapaDatabase.Producto;
import CapaDatabase.ProductoDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ProductoControlador")
public class ProductoControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "editar":
                  //  editarCliente(request, response);
                    break;
                case "eliminar": 
                  //  eliminarCliente(request, response);
                    break;
                default:
                    accionDefault(request, response);
            }
        } else {
            accionDefault(request, response);
        }
    }
    
    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Producto> producto = ProductoDao.listar();// metodo lista devuelve lista de tipo usuario
        //System.out.println("producto = " + producto);
        HttpSession session = request.getSession();
        session.setAttribute("usuario", producto);;
        session.setAttribute("usuariosTotal", producto.size());
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
        response.sendRedirect("usuario.jsp");
    }
    
    
}
