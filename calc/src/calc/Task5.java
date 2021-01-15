package calc;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		String str = "ノートPCの値段";
		int nedan = 89800;
		char unit = '円';
		System.out.println(str + nedan + unit);

		Scanner sc = new Scanner(System.in);
	    String str1 =sc.nextLine();
	    String str2 =sc.nextLine();

	    System.out.println(str1);
	    System.out.println(str2);
	    sc.close();

	    System.out.println(str1 + str2);
	}

}
