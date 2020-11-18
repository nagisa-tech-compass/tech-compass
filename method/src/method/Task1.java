package method;

public class Task1 {
    public static void main(String[] args) {
    	myProfile("広田渚");
    	myProfile(22);
    	myProfile(154.5);
    	System.out.println("よろしくお願いします。");
    }
    public static void myProfile(String name) {
    	System.out.println("私の名前は" + name + "です。");
    }
    public static void myProfile(int nenrei) {
    	System.out.println("年齢は" + nenrei + "です。");
    }
    public static void myProfile(double sintyou) {
    	System.out.println("身長は" + sintyou + "です。");
    }
}
