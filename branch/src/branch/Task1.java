package branch;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		sc.close();
		System.out.println("数字を入力してください");
		System.out.println(num);

		if (num < 10) {
			num *= 10;
		}
		 System.out.println("値:" + num);

	}

}
