package loop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int num = sc.nextInt();
    	System.out.println("数字を入力してください:" + num);

    	int sum = 0;

    	for(int i = 1 ; i <= num ; i ++){
    	    	sum += i;

    	    	if(i == num) {
    	    		System.out.println(i + "=" + sum);
    	    	}
    	    	else {
    	    		System.out.print(i + " + ") ;
    	    	}
    	    }
  }
}
