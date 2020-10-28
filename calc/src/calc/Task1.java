package calc;

public class Task1 {
	public static void main(String[]args) {

		int a = 3, b = 2, c = 6, d = 5;
		
		System.out.println("修正前:" + (a + b * c + d));

		System.out.println("修正後:" + ((a + b) * c + d));

		int e = 25, f = 3;
		System.out.println("25/3の商" + e / f + " : 余り" + e % f );

	}

}
