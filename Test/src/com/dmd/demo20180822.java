package com.dmd;

public class demo20180822 {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.age = 23;
		person1.name = "linda";
//		person.info();
		Person person2 = person1;
		person2.name = "jack";
		person2.info();
	}
}

class Person {
	String name;
	int age;

	public void info() {
		System.out.println("name:" + name + ",age:" + age);
	}
}
