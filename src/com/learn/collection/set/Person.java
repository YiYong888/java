package com.learn.collection.set;

public class Person implements Comparable{

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "," + age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.age - p.age;
	}
}
