package com.we.springmvcboot.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.we.springmvcboot.Model.Notes;
import com.we.springmvcboot.Model.OrderResponse;
import com.we.springmvcboot.Model.Todo;
import com.we.springmvcboot.Model.User;

	@Service
	public class TodoService {

	@Autowired UserRepository userrepo;
	
	public List<Notes> findBySql(String email) {
		return userrepo.getSqlbyuserID(email);
		
	}
	public int getUserID(String email) {
		return userrepo.getUserIDfromEmail(email);
	}
	
	}


