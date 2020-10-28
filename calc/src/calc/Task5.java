package calc;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int nedan = 89800;
		System.out.println("ノートPCの値段:" + nedan + "円");
		
		Scanner sc = new Scanner(System.in);
	    String str1 =sc.nextLine();
	    System.out.println(str1);
	    sc.close();   
	    
	    String str2 =sc.nextLine();
	    System.out.println(str2);
	    sc.close();   
	    
	    System.out.println(str1 + str2);
	}

}
