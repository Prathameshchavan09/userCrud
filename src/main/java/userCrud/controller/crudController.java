package userCrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import userCrud.dao.UserDao;
import userCrud.model.User;

@Controller
public class crudController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/")
	public String start() {
		
		return "register";
	}
	
	
	@RequestMapping("/add")
	public String addUser() {
		
		return "addUser";
		
	}
	
	
	@RequestMapping(path = "/addProcess" , method = RequestMethod.POST)
	public RedirectView userDataSubmit(@ModelAttribute User user , Model model ,HttpServletRequest request) {
		
		System.out.println(user);
		userDao.createUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
	    return redirectView;
		
	}
	
}
