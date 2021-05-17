package curso.cap.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.cap.spring.beans.Login;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public ModelAndView home() {

		ModelAndView modelAndView = new ModelAndView("home");
		Login login= new Login();
		login.setUsuario("federico");
		login.setClave("1234");
		modelAndView.addObject("login", login);
		return modelAndView;
	}

	//@RequestMapping(value = "verTexto", method = RequestMethod.POST)
	
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("verTexto")
	public String verTexto(@RequestParam String texto, Model model) {

		model.addAttribute("textoDevuelto",
				"Has escrito " + texto.toUpperCase() + " y tiene " + texto.length() + " letras");

		return "verTexto";
	}

	@RequestMapping(value = "verTextoFriendly/{texto}", method = RequestMethod.GET)
	public String verTextoFriendly(@PathVariable String texto, Model model) {

		model.addAttribute("textoDevuelto",
				"Has escrito " + texto.toUpperCase() + " y tiene " + texto.length() + " letras");

		return "verTexto";
	}

	@RequestMapping(value = "verNombre/{nombre}/{apellido}", method = RequestMethod.GET)
	public String verTextoFriendly(@PathVariable String nombre, @PathVariable String apellido, Model model) {

		model.addAttribute("textoDevuelto", "Tu nombre es " + nombre + " y tu apellido es " + apellido);

		return "verTexto";
	}

	
	@RequestMapping("verLogin")
	public ModelAndView verLogin(Login login) {
		
		ModelAndView modelAndView= new ModelAndView();
		
		if(login.getUsuario().equals("pepe") && login.getClave().equals("1234")) 
			modelAndView.setViewName("ok");
			else
				modelAndView.setViewName("ko");
		return modelAndView;
		
		
	}

}
