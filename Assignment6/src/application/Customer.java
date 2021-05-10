package application;

public class Customer {
	private String name;
	private int age;
	  

	public Customer(String n, int a) {
	name = n;
	age = a;
	}
	public Customer(Customer c) {
	name = c.getName();
	age = c.getAge();
	}
	  

	public String toString() {
	return name +", " +age +"y/o";
	}
	  
	
	public String getName() {
	return name;
	}
	public int getAge() {
	return age;
	}
	  
	
	public void setName(String n) {
	name = n;
	}
	public void setAge(int a) {
	age = a;
	}
}
