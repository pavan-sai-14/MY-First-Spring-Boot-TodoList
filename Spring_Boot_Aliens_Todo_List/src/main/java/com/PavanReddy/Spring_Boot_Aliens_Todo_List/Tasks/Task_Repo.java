package com.PavanReddy.Spring_Boot_Aliens_Todo_List.Tasks;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


public interface Task_Repo extends JpaRepository<Tasks,Integer> {
	
	public List<Tasks> findByAlienId(int alienId);

}
