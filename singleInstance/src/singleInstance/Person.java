package singleInstance;

class Person{
	String name;
	private Person(){}
	static Person p = new Person();
	public static Person getInstance(){
		return p;
	}
}