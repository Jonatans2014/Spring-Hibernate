package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

//Entity tag is used to tell spring that
// this class needs to be save to the DB
@Entity
public class Topic {
	
	//to choose a primary key use the id anno
	@Id
	private String id;
	
	
	private String name;
	private String description;
	
	
	

	
	
	//constructor chaining
	public Topic() {
		
	}
	

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	

//Getter and Setters
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
