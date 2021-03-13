package ttn.bootcamp.EmployeeJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employee")
@Entity
public class Employee {

	@Id
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee(String name, int id, int age, String location) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.location = location;
	}
	public Employee() {
		super();
	} 
	
}
