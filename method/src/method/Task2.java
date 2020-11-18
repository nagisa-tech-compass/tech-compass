package method;

public class Task2 {
	
	public static double getTriangleArea(double bottom, double height){
		return Math.round( bottom * height / 2.0);
	}
	
	public static void main(String[] args){
		System.out.println("三角形の面積");
		double area = getTriangleArea(5.0, 9.0);
		System.out.println(area);
	}

}
