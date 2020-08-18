package com.PavanReddy.Spring_Boot_Aliens_Todo_List.Aliens;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alien_Controller {
	
	@Autowired
	private Alien_Repo alienRepo;
	
	@GetMapping("/Aliens")
	public List<Aliens> getAllAliens()
	{
		List<Aliens> aliens=new ArrayList<>();
		alienRepo.findAll()
		.forEach(aliens::add);
		return aliens;
	}
	
	@GetMapping("/Aliens/{id}")
	public Optional<Aliens> getAlien(@RequestBody Aliens alien,@PathVariable int id)
	{
		return alienRepo.findById(id);
	}
	
	@PostMapping("/Aliens")
	public void addAlien(@RequestBody Aliens alien)
	{
		alienRepo.save(alien);
	}
	
	@PutMapping("/Aliens/{id}")
	public void updateAlien(@RequestBody Aliens alien)
	{
		alienRepo.save(alien);
	}
	
	@DeleteMapping("/Aliens/{id}")
	public void deleteAlien(@PathVariable int id)
	{
		alienRepo.deleteById(id);
	}
}
