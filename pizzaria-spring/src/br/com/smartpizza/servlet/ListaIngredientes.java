package br.com.smartpizza.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/admin/saborServlet","/saborServlet"})
public class ListaIngredientes extends HttpServlet {

	private static final long serialVersionUID = -2907232175023620317L;
//	private SaborDAO saborDAO;
//	private IngredientaDAO ingreDAO;
//	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		this.saborDAO = new SaborDAO();
//		this.ingreDAO = new IngredientaDAO();
//		response.setContentType("application/json");
//		response.setCharacterEncoding("UTF-8");
//		int idSabor = Integer.parseInt(request.getParameter("idSabor"));
//		PrintWriter out = response.getWriter();
//		String resp="";
//		List<Ingrediente> ingredientes = ingreDAO.listIngredienteSabor(idSabor);
//		resp = new Gson().toJson(ingredientes);
//		out.print(resp);
//		System.out.println(resp);
	}

}
