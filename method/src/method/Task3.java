package method;

public class Task3 {
	public static  String add(String a, String b){
		return "文字列" + a + "文字列" + b;
	}
	public static int add(int a, int b){
		return a + b ;
	}
	public static double add(double a, double b){
		return a + b ;
	}

	public static void main(String[] args){
		System.out.println("---①文字列だけの場合---");
	    System.out.println(add("1", "2"));

		System.out.println("---②整数だけの場合---");
	    System.out.println(add(1, 2));

	    System.out.println("---③小数だけの場合---");
	    System.out.println(add(1.0, 2.0));
	}
}
