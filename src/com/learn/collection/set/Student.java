package com.learn.collection.set;

public class Student{

	public String name;
	public int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		if (this.name.equals(stu.name) && this.age == stu.age) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}
}
