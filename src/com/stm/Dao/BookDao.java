package com.stm.Dao;

import java.util.List;

import com.stm.Model.Book;
import com.stm.Model.Register;

public interface BookDao {

	void create(Register r);

	void insert(Book b);

	List<Book> getDetails();

	Book getuserid(String id);

	void deleteuser(Book s);

}
