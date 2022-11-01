package br.vemprafam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.vemprafam.dao.DaoUsuario;
import br.vemprafam.pojo.Usuario;

@Controller
public class LoginController {

	private DaoUsuario usuarioDao;

	@Autowired
	public LoginController( DaoUsuario usuarioDao ) {
		this.usuarioDao = usuarioDao;
	}

	@RequestMapping("loginForm")
	public String loginForm() {
		return "loginform";
	}

	@RequestMapping("menu")
	public String menu() {
		return "menu";
	}

	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if (usuarioDao.validarLogin(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		} else {
			return "redirect:loginForm";
		}
	}

	@RequestMapping("logout")
	  public String logout(HttpSession session) {
	      session.invalidate();
	      return "redirect:loginForm";
	  }
}
