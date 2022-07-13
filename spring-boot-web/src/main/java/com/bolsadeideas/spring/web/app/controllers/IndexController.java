package com.bolsadeideas.spring.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.spring.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;

	@GetMapping({ "/index", "/", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}

	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellido("Guzman");
		usuario.setEmail("lalala@hotmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Andres", "Guzman", "lalala@hotmail.com"));
		usuarios.add(new Usuario("Jhon", "Guzman", "lalalb@hotmail.com"));
		usuarios.add(new Usuario("Jane", "Guzman", "lalalc@hotmail.com"));
		return usuarios;
	}

}
