package userCrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String start(Model model) {
		
		
		List<User> users = userDao.getAllUser();
		model.addAttribute("userAdded", users);
		
		
		
		return "userData";
	}
	
	
	@RequestMapping("/add")
	public String addUser() {
		
		return "addUser";
		
	}
	
	
//	Adduser Handler
	
	
	@RequestMapping(path = "/addProcess" , method = RequestMethod.POST)
	public RedirectView userDataSubmit(@ModelAttribute User user ,Model model ,HttpServletRequest request) {
		
		System.out.println(user);
		userDao.createUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		
		
		
		
		return redirectView;
	}
	
	
//	DeleteUser Handler
	
	
	@RequestMapping(path = "/delete/{id}")
	public RedirectView deleteUser(@PathVariable("id") int id,HttpServletRequest request) {
		
		
		this.userDao.deleteUser(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		
		return redirectView;
	}
	
	
	
//	updateUser Handler
	
	
	@RequestMapping("UpdateUser/{id}")
	public String Updateuser(@PathVariable("id") int id,Model model) {
		
		
		User user = this.userDao.getUser(id);
		model.addAttribute("user",user);
		
		
		return "updateUser";
	}
		
	
}
