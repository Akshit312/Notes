package com.we.springmvcboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.we.springmvcboot.Model.OrderResponse;
import com.we.springmvcboot.Model.Todo;
import com.we.springmvcboot.Service.TodoService;
import com.we.springmvcboot.Service.UserNotesRepository;

import antlr.collections.List;

import java.sql.Date;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TodoController {
@Autowired
private TodoService todoservice;
private UserNotesRepository userRepo;


@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
		public @ResponseBody HashMap<String, Object> createPerson(@RequestParam("email") String email) {
				

    HashMap<String, Object> map = new HashMap<>();
    map.put("Status", 200);
    map.put("Message", "Request Successful");
    
    map.put("Data", new OrderResponse(todoservice.findBySql(email),todoservice.getUserID(email)));
	 
    return map;

}

//@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
//public String createPerson(@RequestParam("email") String email) {
//	System.out.println(email);
//return "index.jsp";
//
//  //  return "index.jsp";
//}

//	@GetMapping("listTodo")
//	public String listTodo(@RequestParam("email") String email, ModelMap model){
//		model.put("todos", todoservice.findByEmail(email));
//		return "list-todos.jsp";
//	}
//
//
//	@RequestMapping(value = "/deleteTodo", method = RequestMethod.DELETE)
//	public String deleteTodo(@RequestParam int id, ModelMap model)
//	{
//		Todo item=todoservice.getTodoByID(id);
//		if(item!=null) {
//			todoservice.deleteTodo(id);
//		}
//		
//		return "list-todos.jsp";
//	}
//	
//	@GetMapping("addTodo")
//	public String addTodo(@RequestParam("email") String email, @RequestParam("title") String title, @RequestParam("message") String message, ModelMap model) {
//	
//	    java.util.Date date=new java.util.Date();  
//		todoservice.addTodo(email, title, message, date);
//		return "redirect://list-todo";
//	}
	
}
