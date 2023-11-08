package userCrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import userCrud.model.User;

@Component
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	
	public List<User> getAllUser(){
		
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		
		return users;
			
	}
	
	
	@Transactional
	public void deleteUser(int id) {
		
		User p = this.hibernateTemplate.load(User.class,id);
		this.hibernateTemplate.delete(p);
	}
	
	

	public User getUser(int id){
		User user = this.hibernateTemplate.get(User.class, id);
		
		return user;
	}
	
	
	
	
	
	
	
	
}
