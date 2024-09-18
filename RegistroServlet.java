package com.genova.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los datos del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String cargo = request.getParameter("cargo");

        // Establecer el tipo de respuesta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Responder al usuario con los datos ingresados (puedes modificarlo para guardar en una base de datos más adelante)
        out.println("<html><body>");
        out.println("<h2>Registro Exitoso</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Apellido: " + apellido + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Cargo: " + cargo + "</p>");
        out.println("</body></html>");
    }
}
