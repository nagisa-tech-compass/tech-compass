package branch;

import java.util.Scanner;

public class Task5{
	public static void main(String[] args){

		int a;

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		System.out.println("numA:" + numA);

        int numB = sc.nextInt();
        System.out.println("numB:" + numB);

        int numC = sc.nextInt();
        System.out.println("numC:" + numC);

        int max = numA;

        if(max < numB) {
            max = numB;
        }
        if(max < numC) {
        	max = numC;
        }


        System.out.println("最大値:" + max);

    }
}