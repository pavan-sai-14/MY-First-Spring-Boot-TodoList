package com.PavanReddy.Spring_Boot_Aliens_Todo_List.Aliens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="Alien")
public class Aliens {
	
	@Id
	private int id;
	
	
	private String name;
	
	@Column(name="task")
	private String taskDescription;
	
	public Aliens() {
		super();
		
	}
	public Aliens(int id, String name, String task) {
		super();
		this.id = id;
		this.name = name;
		this.taskDescription = task;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTask() {
		return taskDescription;
	}
	public void setTask(String task) {
		this.taskDescription = task;
	}
	

}
