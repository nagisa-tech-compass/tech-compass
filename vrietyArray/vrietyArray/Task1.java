package vrietyArray;
import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> prefecture = new ArrayList<>();
		prefecture.add("北海道");
		prefecture.add("東北");
		prefecture.add("関東");
		prefecture.add("中部");
		prefecture.add("近畿");
		prefecture.add("中国");
		prefecture.add("九州");
		
		for(String prefec : prefecture) {
			System.out.println("・" + prefec);
		}
	}
}
