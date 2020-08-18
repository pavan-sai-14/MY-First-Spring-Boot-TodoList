package com.PavanReddy.Spring_Boot_Aliens_Todo_List.Tasks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.PavanReddy.Spring_Boot_Aliens_Todo_List.Aliens.Aliens;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
public class Tasks {
	
	@Id
	private int id;
	
	private String task;
	
	@ManyToOne
	private Aliens alien;
	
	public Tasks() {
		super();
		
	}
	public Tasks(int id, String task,int alienId) {
		super();
		this.id = id;
		this.task = task;
		this.alien=new Aliens(alienId,"","");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Aliens getAlien() {
		return alien;
	}
	public void setAlien(Aliens alien) {
		this.alien = alien;
	}
	

}
