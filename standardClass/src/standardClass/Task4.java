package standardClass;
import java.util.Scanner;

public class Task4 {
	public static void main(String[]args) {
		String text = "ABCDGOPQRSYZ";
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("探したい文字:" + str);
		
		scan.close();
		
		if(text.indexOf(str) >= 0){
			System.out.println("ABCDGOPQRSYZは" + str + "を含む");
		}else {
			System.out.println("ABCDGOPQRSYZは" + str + "を含まない");
		}
	}

}
