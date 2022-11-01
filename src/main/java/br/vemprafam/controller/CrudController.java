package br.vemprafam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.vemprafam.dao.DaoFuncionario;
import br.vemprafam.pojo.Funcionario;

@Controller
public class CrudController {

	DaoFuncionario daoFuncionario;
	
	@Autowired
	public CrudController(DaoFuncionario daoFuncionario) {
		this.daoFuncionario = daoFuncionario;
	}
	
	@RequestMapping("cadastrar")
	public String abrirTelaCadastro() {
		return "cadastro";
	}
	
	@RequestMapping("gravarCadastro")
	public String cadastrar(Funcionario funcionario, HttpSession session) {
		daoFuncionario.inserirFuncionario(funcionario);
		return "menu";
	}
	
	@RequestMapping("listar")
	public String listar(HttpSession session) {
		session.setAttribute("dao", daoFuncionario);
		return "lista-taglib";
	}
	
	@RequestMapping("abrirExcluir") 
	public String abrirExcluir() {
		return "excluir";
	}
	
	@RequestMapping("excluir")
	public String excluir(Funcionario funcionario, HttpSession session) {
		daoFuncionario.excluirFuncionario(funcionario);
		return "menu";
	}
	
	@RequestMapping("chamarAlteracao")
	public String chamarAlteracao() {
		return "iniciarAlteracao";
	}
	
	@RequestMapping("iniciarAlteracao")
	public String iniciarAlteracao( Funcionario funcionario, HttpSession session) {
		Funcionario func = daoFuncionario.buscarPeloRe(funcionario.getRe());
		session.setAttribute("funcionario", func);
		return "alterar";
	}
	
	@RequestMapping("alterar") 
	public String alterar(Funcionario funcionario, HttpSession session) {
		daoFuncionario.atualizarFuncionario(funcionario);
		return "menu";
	}
}
