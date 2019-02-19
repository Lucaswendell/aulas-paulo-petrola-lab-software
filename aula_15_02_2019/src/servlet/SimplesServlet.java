package servlet;

import javax.servlet.*;
import java.io.*;

public class SimplesServlet extends GenericServlet{
	
	//inicialização a servlet e suas configurações
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	//service -> será chamado a cada nova requisição do usuario
	//request -> traz  dados que podem ter sido enviados pelo usuario
	//reponse -> devolve dados processados
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		//obtem o stream de resposta
		PrintWriter out = response.getWriter();
		out.print("Bem vindo ao servlet!");	
	}
}