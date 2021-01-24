package object;

public class Main2 extends Dog{
	public static void main(String[]args){
		Dog sample = new Dog("ポチ", 5, 12.3);
		//フィールドの呼び出し
		System.out.println("名前:" + sample.name);
		System.out.println("年齢:" + sample.age + "歳");
		System.out.println("体重:" + sample.weight+ "㎏");
		//メソッドの呼び出し
		sample.run();
		sample.sleep();
	}
}
