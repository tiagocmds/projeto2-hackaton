package br.com.stefanini.treinamento.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.treinamento.entity.Cachorro;

@WebServlet("/listaCachorro")
public class ListaCachorroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		List<Cachorro> lista = new ArrayList<>();
		
		Cachorro c1 = new Cachorro("Pimpao");
		lista.add(c1);
		Cachorro c2 = new Cachorro("Bidu");
		lista.add(c2);
		Cachorro c3 = new Cachorro("Mona");
		lista.add(c3);
		
		request.setAttribute("listaCachorros", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCachorros.jsp");
		rd.forward(request, response);
		
	}
}
 


