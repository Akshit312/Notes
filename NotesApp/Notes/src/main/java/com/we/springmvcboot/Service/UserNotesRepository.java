package com.we.springmvcboot.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.we.springmvcboot.Model.UserNotes;

@Repository
public interface UserNotesRepository extends JpaRepository<UserNotes, Integer> {
//	@Query(value="SELECT * from UserNotes where userID?=1", nativeQuery=true)
//	List<Object> getSqlbyuserID(int user);

	//Object getSqlbyuserID(int user);

}
