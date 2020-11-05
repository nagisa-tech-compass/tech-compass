package loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("数字を入力してください:" + num);

		int count = 1;

		for(int i = num; i >= 10; count++) {
			i = i / 10 ;
		}
		System.out.println("桁数:" + count);
	}

}
