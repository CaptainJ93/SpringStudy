package singleInstance;

public class SingleInstance {

	public static void main(String[] args) {
		Person A = Person.getInstance();
		A.name = "jsz";
		Person B = Person.getInstance();	
		System.out.println(B.name);
	}

}

