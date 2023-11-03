package userCrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import userCrud.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	public void createUser(User user) {
		this.hibernateTemplate.save(user);
	}
	
	
	public List<User> getAllUser(User user){
		
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		
		return users;
			
	}
	
	
	@Transactional
	public void deleteUser(int uid) {
		
		User p = this.hibernateTemplate.load(User.class,uid);
		this.hibernateTemplate.delete(p);
	}
	
	

	public User getUser(int uid){
		User u = this.hibernateTemplate.get(User.class, uid);
		
		return u;
	}
	
	
	
	
	
	
	
}
