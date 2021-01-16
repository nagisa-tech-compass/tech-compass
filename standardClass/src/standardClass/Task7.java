package standardClass;
import java.util.Calendar;

public class Task7 {
	public static void main(String[]args){
		Calendar cal = Calendar.getInstance();
		
		System.out.print("現在日時:");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");
		
		cal.add(Calendar.DAY_OF_MONTH, 7);
		
		System.out.print("１週間後:");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");
		
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.YEAR, cl.get(Calendar.YEAR) + 1);	
		String[] week = {"","日","月","火","水","木","金","土"};
		int i = cl.get(Calendar.DAY_OF_WEEK);
		
		System.out.print("１年後　:");
		System.out.print(cl.get(Calendar.YEAR) + "年");
		System.out.print(cl.get(Calendar.MONTH) + 1 + "月");
		System.out.print(cl.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.println("(" + week[i] + ")");
	}
}
