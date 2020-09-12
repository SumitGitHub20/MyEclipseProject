package main;

public class Student {
	protected String name;
	protected int rollNumber;
	protected int marks;
	
	public Student() {
		super();
		this.name = "";
		this.rollNumber = 0;
		this.marks = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
