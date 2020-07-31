package com.we.springmvcboot.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(name="todo")
	public class Todo{
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int ID;
		
		//@Column(name="email")
		private String email;
		
		//@Column(name="notes")
		private String title;
		
		private String message;
		
		//@Column(name="LastModified")
		private Date LastModified;
		
		public Todo() {
			
		}
		public Todo(String email,String title,String message, Date LastModified) {
			super();
			this.email=email;
			this.title=title;
			this.message=message;
			this.LastModified=LastModified;
		}

		public int getID() {
			return ID;
		}

		public void setID(int ID) {
			this.ID = ID;
		}

		public String gettitle() {
			return title;
		}

		public void settitle(String title) {
			this.title = title;
		}

		public String getmessage() {
			return message;
		}

		public void setmessage(String message) {
			this.message = message;
		}
		public Date getLastModified() {
			return LastModified;
		}

		public void setLastModified(Date LastModified) {
			this.LastModified = LastModified;
		}
		public String getUserName() {
			return email;
		}

		public void setUserName(String email) {
			this.email = email;
		}
			
		
	}
