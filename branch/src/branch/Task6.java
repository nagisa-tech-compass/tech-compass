package branch;

import java.util.Scanner;

public class Task6{
	public static void main(String[] args){
		System.out.println("1から5までの数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		sc.close();

        String roma;


		switch(num) {
		    case 1:
			    roma  = "Ⅰ";
			    break;
		    case 2:
		    	roma = "Ⅱ";
		    	break;
		    case 3:
			    roma = "Ⅲ";
			    break;
		    case 4:
		    	roma = "Ⅳ";
		    	break;
		    case 5:
		    	roma =  "Ⅴ";
		    	break;
		    default:
		    	roma = "unknown";
		    	break;

		}

        System.out.println(num + "->"+ roma );
	}
}
