package cr.ac.tec.users;

import java.util.HashMap;

import cr.ac.tec.util.IntLinkedList;

public class Users {
	
	private IntLinkedList studentsList;
	private IntLinkedList driversList;
	private HashMap<Integer, Student> studentsHash;
	private HashMap<Integer, Driver> driversHash;
	
	public void addStudent(int id, int destination, String username, String password) {
		Student student = new Student(id, destination, username, password);
		studentsHash.put(id, student);
	}
	
	public void addDriver(int id, int destination, String username, String password) {
		Driver driver = new Driver(id, destination, username, password);
		driversHash.put(id, driver);
	}
	
	public Student getStudent(int id) {
		return studentsHash.get(id);
	}
	
	public Driver getDriver(int id) {
		return driversHash.get(id);
	}

}
