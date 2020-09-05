package br.com.smartpizza.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditarProdutoCommand implements Command {
	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
		String proximo  = "gerenciar-produto.jsp";
		
//		int idProduto = Integer.parseInt(request.getParameter("idProduto"));
//		ProdutoDTO prod = produtoDAO.getProdutoById(idProduto);
//		request.setAttribute("produto",prod );
//		List<ProdutoDTO> listaProdutos = produtoDAO.listarProdutos();
//		request.setAttribute("produtos", listaProdutos);
		return proximo;
	}

}
