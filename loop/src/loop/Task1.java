package loop;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    
    	int sam = 0;
    	int num = sc.nextInt();
        sc.close();

    	System.out.println("数字を入力してください:" + num);
    	
    	for(int num2 = 1 ; num2 <= num ; num2++){
    		sam += num2 ;
    	}
    	
    	System.out.println("1～" + num + "までの合計:" + sam);
    	
    }
}
