package test;

public class ExtendsConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student A = new Student();
	}

}

class Person1{
	String name;
	Person1(){
		System.out.println("父类构造方法");
		name = "jsz";
	}
	Person1(String a){
		System.out.println("父类构造方法"+a);
	}
}

class Student extends Person1{
	Student(){
		this("bbb");
		System.out.println("子类构造方法");
	}
	Student(String a){
		super();
		System.out.println("子类构造方法有参数"+a);
	}
}