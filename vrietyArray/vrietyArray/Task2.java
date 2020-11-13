package vrietyArray;
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args){
	    ArrayList<Integer>kisu = new ArrayList<>();
	    ArrayList<Integer>gusu = new ArrayList<>();

	    int[] suzi = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};

	    for(int i : suzi){
	    	if (i % 2 == 1) {
	    		kisu.add(i);

	    	}else {
	    		gusu.add(i);
	    	}
	    }
	    System.out.print("奇数: [" );
	    for (int kis : kisu ) {
	    	if(kis == 11){
	    		System.out.println(kis + "]");
	    	}else {
	    		System.out.print(kis + ",");
	    	}
	    }
	    System.out.print("偶数: [");
	    for (int gus : gusu){
	    	if(gus == 60) {
	    		System.out.println(gus + "]");
	    	}else {
	    		System.out.print(gus + ",");
	    	}
	    }
	}
}

