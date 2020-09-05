package br.com.smartpizza.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAdmCommand implements Command{
	


	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
//		this.userBO = new UsuarioBO();
//		this.pessoaLog = new PessoaDTO();
//		// TODO Auto-generated method stub
//		userDAO = new UsuarioDAO();
//		pessoaDAO = new PessoaDAO();
//		
//		String proximo = "login.jsp";
//		HttpSession session = request.getSession();
//		
//			
//			String usuario = request.getParameter("usuario");
//			String senha = request.getParameter("senha");
//			
//			Usuario user = new Usuario();
//			user.setLogin(usuario);
//			user.setSenha(senha);
//			
//			try {
//				if(usuario.equals("")&&senha.equals("")) {
//					request.setAttribute("msgErro", "usuario ou senha inválidos!");
//				}else {
//				Usuario us = userDAO.consultarUsuario(user);
//					if(us.getGpUs().equals("Admin")) {
//							proximo = "admin?acao=listarClientes";
//							pessoaLog = pessoaDAO.getFuncionarioUsuario(us.getId());
//							session.setAttribute("loginUser", us);
//							session.setAttribute("id", pessoaLog);
//							session.setMaxInactiveInterval(60*10);
//					}else if(us.getGpUs().equals("Funcionario")) {
//						proximo = "admin?acao=listarClientes";
//						pessoaLog = pessoaDAO.getFuncionarioUsuario(us.getId());
//						session.setAttribute("loginUser", us);
//						session.setAttribute("id", pessoaLog);
//						session.setMaxInactiveInterval(60*10);
//					}
//					else {
//							request.setAttribute("msgErro", "usuario sem permissão!");
//					}
//				
//		}			
//	}catch(Exception e) {
//			e.printStackTrace();
//			proximo = "login.jsp";
//			request.setAttribute("msgErro", "falha na autenticação");
//		}
	return "";
		
}

}
