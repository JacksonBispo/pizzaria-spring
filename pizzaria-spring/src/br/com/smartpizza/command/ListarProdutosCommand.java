package br.com.smartpizza.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarProdutosCommand implements Command {
	
	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
//		this.produtoDAO = new ProdutoDAO();
//		this.tipoDAO = new TipoProdutoDAO();
//		this.saborDAO = new SaborDAO();
//		String proximo = "gerenciar-produto.jsp";
//		String produto = request.getParameter("produto");
//		List<ProdutoDTO> listaProdutos = produtoDAO.listarProdutos();
//		List<ProdutoDTO> listaPizza = produtoDAO.listarProdutospizza(1);
//		List<ProdutoDTO> broto = produtoDAO.listarProdutoPizzaBroto("Personalizada", 1, "broto");
//				List<Sabor> sabores = saborDAO.listaSAbores();
//
//		request.setAttribute("produtos", listaProdutos);
//		request.setAttribute("broto", broto);
//		request.getSession().setAttribute("sabores", sabores);
//		
//		List<TipoProduto> tipos = tipoDAO.listaTipos();
//		request.setAttribute("produtos", listaPizza);
//		request.setAttribute("tiposProdutos", tipos);
//	
//		
		
		return "";
	}

}
