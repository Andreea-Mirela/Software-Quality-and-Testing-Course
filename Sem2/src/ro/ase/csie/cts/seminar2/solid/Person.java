package ro.ase.csie.cts.seminar2.solid;

import java.util.Date;
//pt principiul single responsability (Solid)
public class Person {
	
	private String name;
	
	private String address;
	
	private Date birthdate;
	
	private long salary;

	public Person(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	
}
