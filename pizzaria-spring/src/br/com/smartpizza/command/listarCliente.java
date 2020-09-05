package br.com.smartpizza.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class listarCliente implements Command {
	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
		String proxima = "gerenciar-cliente.jsp";
//		
//		List<PessoaDTO> lista = pessoaDAO.listaPessoas();
//		request.setAttribute("pessoas", lista);
		return proxima;
	}

}
