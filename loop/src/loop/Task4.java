package loop;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	sc.close();

    	System.out.println("正の整数を入力してください:" + num);
        System.out.print(num + "の約数:");

    	for (int warukazu = 1; warukazu <= num; warukazu++) {

    		if (num % warukazu == 0){
    			if(warukazu == num) {
    				System.out.print(warukazu);

    			}else {
    				System.out.print(warukazu + ",");
    			}
    		}
    	}
    }
}
