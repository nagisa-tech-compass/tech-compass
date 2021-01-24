package object;

public class Person {
	String name;  //インスタンス変数
	int age;  //インスタンス変数

	public static int wallet = 0; //静的フィールド　クラス変数
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	Person(){
	    name = "広田渚";
	    age = 22;
	}
	
	Person(int wallet){
		this.wallet = wallet;
		wallet += wallet;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setNama(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}

