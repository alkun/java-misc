package com.kunzen.java;


public class OverridingOverloading {
public static void main(String[] args) {
	Animal a= new Animal();
	a.eating();
	a.running();
	Animal a1= new Dog();
	a1.eating();
	a1.running();
	//throw ClassCastException @Runtime
	Dog d= (Dog) new Animal();
	d.bark();
	d.eating();
	d.running();
	Dog d1= new Dog();
	d1.bark();
	d1.eating();
	d1.running();
}
}

class Animal {
	void running(){
		System.out.println("Animal running");
	}
	void eating(){
		System.out.println("Animal eating");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("dog barking");
	}
	void running(){
		System.out.println("dog running");
	}
	void eating(){
		System.out.println("dog eating");
	}
}