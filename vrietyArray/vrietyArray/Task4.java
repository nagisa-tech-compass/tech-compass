package vrietyArray;
import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {
	public static void main(String[] args){
	    ArrayList<Integer>kisu = new ArrayList<>();
	    ArrayList<Integer>gusu = new ArrayList<>();

	    int[] suzi = {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};

	    for(int i : suzi){
	    	if (i % 2 == 1) {
	    		kisu.add(i);

	    	}else {
	    		gusu.add(i);
	    	}
	    }    	    
	    HashMap<String, ArrayList<Integer>> kisulabel = new HashMap<>();
	    HashMap<String, ArrayList<Integer>> gusulabel = new HashMap<>();

	    for(Integer label : kisu) {
	        kisulabel.put("奇数", kisu);
	    }
	    for(Integer label2 : gusu){
	    	gusulabel.put("偶数", gusu);
	    }
	    System.out.println(gusulabel);
	    System.out.println(kisulabel); 
	}
}
