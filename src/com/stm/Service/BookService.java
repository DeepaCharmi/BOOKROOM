package com.stm.Service;

import java.util.*;
import com.stm.Model.Book;
import com.stm.Model.Register;

public interface BookService {

	void create(Register r);

	void insert(Book b);

	List<Book> getDetails();

	Book getuserid(String id);

	void deleteuser(Book s);

}
