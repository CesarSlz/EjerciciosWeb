package com.slz.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultadoDiaServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		final String[] dias = {
				"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" 
		};
		
		String dia = request.getParameter("txtdia");
		int numDia = Integer.parseInt(dia) - 1;
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		salida.println("<h4>" + dias[numDia] + "</h4>");
		
	}

}
