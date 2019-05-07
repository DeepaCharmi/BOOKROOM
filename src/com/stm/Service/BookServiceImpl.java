package com.stm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stm.Dao.BookDao;
import com.stm.Model.Book;
import com.stm.Model.Register;
@Service
public class BookServiceImpl implements BookService {
@Autowired
BookDao dao;
	@Override
	@Transactional
	public void create(Register r) {
		dao.create(r);
		}
	@Override
	@Transactional
	public void insert(Book b) {
		// TODO Auto-generated method stub
		dao.insert(b);
	}
	@Override
	@Transactional
	public List<Book> getDetails() {
		
		return dao.getDetails();
	}
	@Override
	@Transactional
	public Book getuserid(String id) {
		// TODO Auto-generated method stub
		return dao.getuserid(id);
	}
	@Override
	@Transactional
	public void deleteuser(Book s) {
		// TODO Auto-generated method stub
		dao.deleteuser(s);
		
	}

}
