package standardClass;

public class Task5 {
	public static void main(String[]args){
		String text = "cat_mouse_mouse_cat_cat";
		int countcat = 0;
		int countmouse = 0;
		
		String[] strAray = text.split("_");
		for(String str : strAray){
		    if (str.indexOf("cat") >= 0){
			    countcat ++ ;
		    }else if(str.indexOf("mouse") >= 0){
		    	countmouse ++ ;
		    }
		}
		if(countcat > countmouse){
			System.out.println("catの方が多い");
		}else {
			System.out.println("mouseの方が多い");
		}
	}

}
