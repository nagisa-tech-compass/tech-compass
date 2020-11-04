package loop;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
    	
    	//数字を入力してください
    	
    	Scanner sc = new Scanner(System.in);
    
    	int sa = 0;
    	int num = sc.nextInt();
        
    	System.out.println("数字を入力してください:" + num);
    	
    	for(int num2 = num ; num2>0; num2--){
    		sa += num2 ;
    	}
    	
    	System.out.println("1～" + num + "までの合計:" + sa);
    	
    }
}
