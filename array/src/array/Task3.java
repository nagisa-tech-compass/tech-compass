package array;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {

		int [] array = new int [6];
		System.out.print("[");
		int number;

		for (number = 0; number < array.length ; number ++){
			Random r = new Random();
			array[number] = r.nextInt(10);
		}

		for (number = 0; number < array.length; number ++) {
			if (number < 5){
            	System.out.print(array[number] + ",");
            }else {
            	System.out.println(array[number]+ "]");
            }
		}
        number = 0;
		int max = array[number];
		int mini= array[number];


		for (number = 0; number < 5; number ++) {
		        if (array[number] < array[number + 1] ){
			    max = array[number + 1] ;
		        }else {

		        }

		        if (array[number] > array[number + 1] ) {
		        	mini = array[number + 1] ;
		        }else {
               
		        }
		    }

		System.out.println("最大値: " + max);
		System.out.println("最小値: " + mini);
    }
}
