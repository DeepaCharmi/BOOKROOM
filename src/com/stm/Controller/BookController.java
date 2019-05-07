package com.stm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import com.stm.Model.Book;
import com.stm.Model.Register;
import com.stm.Service.BookService;

@Controller
public class BookController {
	@Autowired
	  BookService service;
	@RequestMapping("/")
	   public String display(Model themodel)
	   {
		   themodel.addAttribute("reg",new Register());
		   return "initial";
	   }
   @RequestMapping("/login")
   public String displayreg(Model themodel)
   {
	   themodel.addAttribute("reg",new Register());
	   return "home";
   }
   @RequestMapping("/register")
   public String displaylogin(Model themodel)
   {
	   themodel.addAttribute("reg",new Register());
	   return "register";
   }
   @RequestMapping("/bookroom")
   public String bookroom(Model themodel)
   {
	   themodel.addAttribute("book",new Book());
	   return "bookroom";
   }
   @RequestMapping("/insert")
   public String insertuser(@RequestParam("name") String name,@RequestParam("pass")String pass,@RequestParam("cpass")String cpass,Model model)
   {
	   Register r=new Register();
	   r.setName(name);
	   r.setPass(pass);
	   r.setCpass(cpass);
	   service.create(r);
	   return "redirect://login";
   }
   @RequestMapping("/display")
   public String insertrrom(@RequestParam("name") String name,@RequestParam("id") String id,@RequestParam("roomno")String roomno,@RequestParam("mobileno")String mobileno,Model model)
   {
	   Book b=new Book();
	   b.setGname(name);
	   b.setId(Integer.parseInt(id));
	  b.setMobno(mobileno);
	  b.setRoomno(roomno);
	  service.insert(b);
	  model.addAttribute("books", new Book());
	   List<Book> details=service.getDetails();
	   model.addAttribute("books", details);
	   return "success";
   }
   
   @RequestMapping("/deleteuser")
   public String delete(@RequestParam("id") String id,Model themodel)
   {
	   Book s=service.getuserid(id);
	   service.deleteuser(s);
	   List<Book> details=service.getDetails();
	   themodel.addAttribute("books", details);
	   return "success";
   }
}
