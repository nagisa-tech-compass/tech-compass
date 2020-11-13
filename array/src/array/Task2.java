package array;

public class Task2 {
	public static void main(String[] args) {
		int[] array;
		int a = 7;
		array = new int[7];
		
		for (int i = 6; i >= 0; i --) {
			array[i] = a ;
			
	        if (i > 0) {
	        	System.out.print(a + ",");
	        }else {
	        	System.out.println(a);
	        }
		    a --;
		}
		int [] array2;
		int a2 = 1;
		array2 = new int [7];
		
		for (int i2 = 0; i2 < 7; i2 ++ ){
		    array2[i2] = a2;
		    
		    if (i2 < 6) {
		    	System.out.print(a2 + ",");
		    }else {
		    	System.out.println(a2);
		    }
		    a2 ++;
	    }
    }
}