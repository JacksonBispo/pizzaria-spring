package br.com.smartpizza.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizarPedido implements Command {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
//		this.saborDAO = new SaborDAO();
//		this.produtoDAO = new ProdutoDAO();
//		this.pessoa = new PessoaDAO();
//		String proximo = "realizar-pedido.jsp";
//		List<PessoaDTO> pessoas = pessoa.listaPessoas();
//		List<Sabor> sabores = saborDAO.listaSAbores();
//		List<ProdutoDTO> listaProdutos =  produtoDAO.listarProdutospizza(1);
//		List<ProdutoDTO> listaProdutosbroto =  produtoDAO.listarProdutoPizzaBroto("Personalizada",1, "broto");
//		request.setAttribute("prd", listaProdutos);
//		request.setAttribute("brotos", listaProdutosbroto);
//		request.getSession().setAttribute("sabores", sabores);
//		request.getSession().setAttribute("pessoas", pessoas);
		return "";
	}

}
