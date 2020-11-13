package array;

public class Task1 {
	public static void main(String[] args) {

	    int [] array = {4,9,19,5,8,21,42,64,73,18,2};

	    System.out.print("配列:[");



	    for (int a = 0; a < array.length; a ++) {

	    	if (a == array.length-1){
	    		System.out.println(array[a] + "]");
	    	}else {
	    		System.out.print(array[a] + ",");
	    	}
	    }

	    int sum = 0;
 	    for(int date : array) {
	        sum += date;
 	    }
 	    System.out.println("合計:" + sum);
	}

}
