package loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        sc.close();
		System.out.println("数字を入力してください:" + num);

		int count = 0;

		while(num > 0){
			num /= 10;
			count++;
		}
		System.out.println("桁数:" + count);
	}

}
