package ro.ase.csie.cts.seminar4.banking;


import java.util.Date;
//pt principiul single responsability (Solid)
public class Person {
	
	private String name;
	
	private String address;
	
	private Date birthdate;
	
	private Integer age;
	
	private long salary;
	
	private String email;
	
	private String mobile;
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	private NotificationType notificationType;
	
	public static enum NotificationType {
		EMAIL,
		SMS
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", birthdate=" + birthdate + ", salary=" + salary
				+ ", email=" + email + ", mobile=" + mobile + ", notificationType=" + notificationType + "]";
	}

	
}
