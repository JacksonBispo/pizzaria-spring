package br.com.smartpizza.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarSaboresPizza implements Command{

//	private IngredientaDAO igrDAO;

	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
//		this.igrDAO = new IngredientaDAO();
//		String proximo = "cadastrarSaboresPizza.jsp";
//		List<Ingrediente> listaLingredientes =  igrDAO.listaIngredientes();
//		
//		request.setAttribute("lista", listaLingredientes);
		return "";
	}
	

}
