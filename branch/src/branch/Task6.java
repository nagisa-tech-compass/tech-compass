package branch;

import java.util.Scanner;

public class Task6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
        String roma;
        

		switch(num) {
		    case 1:
			    roma  = num + " ->Ⅰ";
			    break;
		    case 2:
		    	roma = num + " ->Ⅱ";
		    	break;
		    case 3:
			    roma = num + " ->Ⅲ";
			    break;
		    case 4:
		    	roma = num + " ->Ⅳ";
		    	break;
		    case 5:
		    	roma = num + " ->Ⅴ";
		    	break;
		    default:
		    	roma = "unknown";
		    	break;

		};
		
        System.out.println("1から5までの数字を入力してください\n" + num + roma );
	}
}
