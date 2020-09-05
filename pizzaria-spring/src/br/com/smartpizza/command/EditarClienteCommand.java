package br.com.smartpizza.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditarClienteCommand implements Command {
	

	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
		String proxima = "editar-cliente.jsp";
//		this.pessoaDAO = new PessoaDAO();
//		this.estadoDAO = new EstadoDAO();
//		try {
//			
//		Integer idcliente = Integer.parseInt(request.getParameter("idCliente"));
//		PessoaDTO p = pessoaDAO.getPessoa(idcliente);
//		List<Estado> listaEstado = estadoDAO.listarEstados();
//		request.setAttribute("estados", listaEstado);
//		request.setAttribute("pessoa", p);
//		}catch(Exception e) {
//			request.setAttribute("msg", "erro ao recuperar cliente"+ e);
//		}
	
		return proxima;
	}

}
