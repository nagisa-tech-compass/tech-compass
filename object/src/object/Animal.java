package object;

public class Animal{
	String name;
	int age;

	//コンストラクタ　２つ作成
	public Animal(){};
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}

	public void sleep(){
		System.out.println("眠った");
	}
}

