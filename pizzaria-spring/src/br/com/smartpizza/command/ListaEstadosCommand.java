package br.com.smartpizza.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaEstadosCommand implements Command {
	
	
	
	private String proxima;
	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
		
//		String permission = request.getParameter("admin");
//		
//		if(permission.equals("true")) {
//			proxima ="cadastrar-cliente.jsp";
//			List<Estado> listEstados = estadoDAO.listarEstados();
//			request.setAttribute("estados", listEstados);
//		} else {
//			proxima ="cadastroCliente.jsp";
//			List<Estado> listEstados = estadoDAO.listarEstados();
//			request.setAttribute("estados", listEstados);
//		}
//	
		return proxima;
		
	}

}
