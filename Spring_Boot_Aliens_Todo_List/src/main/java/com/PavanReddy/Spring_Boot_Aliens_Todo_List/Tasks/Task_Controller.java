package com.PavanReddy.Spring_Boot_Aliens_Todo_List.Tasks;

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

import com.PavanReddy.Spring_Boot_Aliens_Todo_List.Aliens.Aliens;

@RestController
public class Task_Controller {
	
	@Autowired
	private Task_Repo taskRepo;
	
	@GetMapping("/Aliens/{alienId}/Tasks")
	public List<Tasks> getAllTask(@PathVariable int alienId)
	{
		return taskRepo.findByAlienId(alienId);
	}
	
	@GetMapping("/Aliens/{alienId}/Tasks/{id}")
	public Optional<Tasks> getTask(@RequestBody Tasks task,@PathVariable int id)
	{
		return taskRepo.findById(id);
	}
	
	@PostMapping("/Aliens/{alienId}/Tasks")
	public void addTask(@RequestBody Tasks task,@PathVariable int alienId)
	{
		task.setAlien(new Aliens(alienId,"",""));
		taskRepo.save(task);
	}
	
	@PutMapping("/Aliens/{alienId}/Tasks/{id}")
	public void updateTask(@RequestBody Tasks task,@PathVariable int alienId)
	{
		task.setAlien(new Aliens(alienId,"",""));
		taskRepo.save(task);
	}
	
	@DeleteMapping("/Aliens/{alienId}/Tasks/{id}")
	public void deleteTask(@PathVariable int id)
	{
		taskRepo.deleteById(id);
	}
}
