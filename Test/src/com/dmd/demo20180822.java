package com.dmd;

public class demo20180822 {
	public static void main(String[] args) {
		Person person1 = new Person();
//		person.name = "linda";
//		person.age = 23;
//		person.info();
		Person person2=person1;
	}
}

class Person {
	String name;
	int age;

	public void info() {
		System.out.println("name:" + name + ",age:" + age);
	}
}