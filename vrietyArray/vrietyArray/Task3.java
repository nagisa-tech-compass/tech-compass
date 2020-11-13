package vrietyArray;
import java.util.HashMap;

public class Task3 {
	public static void main(String[] args) {
		HashMap<String, Integer> fruit = new HashMap<>();
		fruit.put("りんご", 130);
		fruit.put("メロン",6000);
		fruit.put("みかん",120);
		fruit.put("バナナ",98);
		
		for(HashMap.Entry<String, Integer>fru : fruit.entrySet()) {
			System.out.print(fru.getKey() + ":");
			System.out.println(fru.getValue() + "円");
			
		}
	}

}
