  	
package calc;

import java.util.Scanner;

 public class Task3 {
    public static void main(String[] args){
    	
    
 	    Scanner sc = new Scanner(System.in);
    	int num1 =sc.nextInt();
    	System.out.println(num1);
    	sc.close();   
    
    	int num2 =sc.nextInt();
    	System.out.println(num2);
    	sc.close();   
    	
    	int num3 =sc.nextInt();
    	System.out.println(num3);
    	sc.close();   
    	
    	
    	int a = num1 + num2 + num3;
    	int b = 3;
    	double c = 3.0;
    	
    	System.out.println("合計:" + a );
    	System.out.println("平均(3で割った時):" + (a / b));
    	System.out.println("平均(3.0で割った時):" + (a / c));
    	
    }
    
}
