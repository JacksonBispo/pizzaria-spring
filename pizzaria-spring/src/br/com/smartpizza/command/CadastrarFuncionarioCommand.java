package br.com.smartpizza.command;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarFuncionarioCommand implements Command {
//
//	private PessoaDAO dao = new PessoaDAO();
//	private CargoDAO cargoDAO = new CargoDAO();
//	private String proximo;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String proximo = "adminis?acao=listaEstado&param=adminFun";

//		try {
//			String nome = request.getParameter("nome");
//			String cpf = request.getParameter("cpf");
//			String sobreNome = request.getParameter("sobrenome");
//			String telefone = request.getParameter("telefone");
//
//			String email = request.getParameter("email");
//			String senha = request.getParameter("senha");
//
//			String[] logradouro = request.getParameterValues("logradouro");
//			String cep = request.getParameter("cep");
//			String bairro = request.getParameter("bairro");
//			String cidade = request.getParameter("cidade");
//			String idEstado = request.getParameter("estado");
//			String referencia = request.getParameter("complemento");
//			String numero = request.getParameter("numero");
//			String dataAdmissao = request.getParameter("dataAdmissao");
//
//			String status = request.getParameter("status");
//
//			String descricao = request.getParameter("descricao");
//
//			Funcionario f = new Funcionario();
//			Cidade cid = new Cidade();
//			Usuario usuar = new Usuario();
//			Endereco endereco = new Endereco();
//			Estado est = new Estado();
//			Cargo cargo = new Cargo();
//			f.setNome(nome);
//			f.setSobrenome(sobreNome);
//			f.setCpf(cpf);
//
//			f.setTelefone(telefone);
//
//			f.setDataAdmissao(dataAdmissao);
//			
//			f.setCargo(cargo);
//			cargo.setDescricao(descricao);
//
//			f.setUsuario(usuar);
//			usuar.setLogin(email);
//			usuar.setSenha(senha);
//			usuar.setGpUs("Funcionario");
//			System.out.println(idEstado);
//			List<Endereco> listEndereco = new ArrayList<Endereco>();
//
//			for (String end : logradouro) {
//
//				endereco.setDsLogradouro(end);
//				endereco.setNumEndereco(numero);
//				endereco.setCep(cep);
//				endereco.setBairro(bairro);
//
//				endereco.setCidade(cid);
//				cid.setIdCidade(Integer.parseInt(cidade));
//
//				cid.setEstado(est);
//				est.setIdEstado(Integer.parseInt(idEstado));
//
//				listEndereco.add(endereco);
//
//			}
//			f.setEndereco(listEndereco);
//
//			int idCargo = cargoDAO.cadastroCargo(cargo);
//			dao.cadastroFuncionario(f, idCargo);
//			request.setAttribute("msgSucesso", "Funcionario cadastrado com sucesso!");
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//
//			request.setAttribute("msg", "Erro ao cadastrar funcionario");
//
//		}

		return proximo;
	}

}
