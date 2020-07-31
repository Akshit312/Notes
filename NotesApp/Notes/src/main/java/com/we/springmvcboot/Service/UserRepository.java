package com.we.springmvcboot.Service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.we.springmvcboot.Model.Notes;

@Repository
public interface UserRepository extends JpaRepository<Notes, Long> {
    
    // Here Use, JPA naming convention to reduce the overhead of writing the native query.
	@Query(value="SELECT notes.notesID, notes.title, notes.message, notes.Date from usernotes JOIN notes on usernotes.notesID=notes.notesID where usernotes.notesID IN (Select usernotes.notesID from usernotes where usernotes.userID IN (Select User.userID from User where User.emailID=?1))", nativeQuery=true)
	List<Notes> getSqlbyuserID(String email);

	@Query(value="SELECT userID from User where emailID=?1", nativeQuery=true)
	int getUserIDfromEmail(String email);
	
	//List<com.we.springmvcboot.Model.User> findAllByEmail(String email);
}