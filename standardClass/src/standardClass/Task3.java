package standardClass;

public class Task3 {
	public static void main(String[]args){
		String str ="ABCDEFG";
		System.out.println("文字列:" + str);
		
		for(int i = 1; i < 8; i++){
			char text = str.charAt(str.length() - i);
			System.out.print(text);
		}
		System.out.print(":列字文");
	}

}
