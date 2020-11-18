package method;

public class Task4 {
	public static void main(String[] args){

		String [] array = {"a", "b", "c"};
		System.out.println("---配列にnullがない場合---");
		nullCheck (array);	
		System.out.println(nullCheck(array));

	    array[1] = "null";
	    System.out.println("---配列にnullがある場合---");
	    nullCheck (array);	
	    System.out.println(nullCheck(array));
	}
	public static boolean nullCheck(String[] array){
		boolean a =false;
		for (int num = 0; num < array.length; num ++){
			if (array[num] == "null") {
			    a = true;
			}
	    }
	    return a;
    }
}