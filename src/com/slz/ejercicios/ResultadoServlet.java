package com.slz.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultadoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String edad = request.getParameter("txtedad");
		int numEdad = Integer.parseInt(edad);
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		if(numEdad >= 18) {
			salida.println("<h4>Ingresaste " + numEdad + ". Eres mayor de edad.</h4>");
		}else {
			salida.println("<h4>Ingresaste" + numEdad + ". Eres menor de edad.</h4>");
		}
		
		
	}
}
