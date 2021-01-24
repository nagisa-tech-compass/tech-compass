package object;

public class Dog extends Animal{
	double weight;

	Dog(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	Dog(){

	}

	public void run(){
		System.out.println(name +"は走った");
	}
	public void sleep(){
		Animal sample = new Animal();
		sample.sleep();
		System.out.println(name + "は眠った");
	}
}

