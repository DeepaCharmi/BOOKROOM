package com.stm.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stm.Model.Book;
import com.stm.Model.Register;
@Repository
public class BookDaoImpl implements BookDao {
   @Autowired
    SessionFactory factory;
	@Override
	public void create(Register r) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(r);
		
	}
	@Override
	public void insert(Book b) {
		// TODO Auto-generated method stub
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(b);
		
	}
	@Override
	public List<Book> getDetails() {
		Session session=factory.getCurrentSession();
		Query query=session.createQuery("from Book");
		List<Book> b=query.list();
		return b;
	}
	@Override
	public Book getuserid(String id) {
		Session session=factory.getCurrentSession();
		Book g=session.get(Book.class, Integer.parseInt(id));
		return g;
	}
	@Override
	public void deleteuser(Book s) {
		Session session=factory.getCurrentSession();
		session.delete(s);
	
		
	}

}
