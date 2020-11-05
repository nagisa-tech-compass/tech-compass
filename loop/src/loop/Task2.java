package loop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
	
    	Scanner sc = new Scanner(System.in);
    	
    	    int num = sc.nextInt();
    	    System.out.println("数字を入力してください:" + num);
    	
    	    int i = 1;
    	    int sam = 1;
    	    String a = "1 + ";
    	    
    	        while(i < num){
    	    	i ++;
    	    	sam += i;
    	    	
    	    	if(i == num) {
    	    		a = a + i;
    	    	}
    	    	else {
    	    		a = a + i + " + " ;
    	    	}
    	    	
    	    }
    	        System.out.print(a + " = " + sam);
  }
}
