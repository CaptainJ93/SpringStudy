package test;

public class ConstructCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person A = new Person();
		Person B = new Person("wd","US");
		System.out.println(B.country);
	}

}

class Person{
	String name;
	String country;
	{
		this.country = "China";
		System.out.println("��������");
	}
	Person(){
		this.name = "jsz";
		System.out.println("�޲ι��췽��");
	}
	Person(String name){
		this.name = name;
		System.out.println("�вι��췽��");
	}
	Person(String name,String country){
		this(name);
		this.country = country;
		System.out.println("���������췽��");
	}
}
