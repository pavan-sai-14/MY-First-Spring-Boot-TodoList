package com.PavanReddy.Spring_Boot_Aliens_Todo_List.Aliens;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


public interface Alien_Repo extends JpaRepository<Aliens,Integer> {
	
	

}
