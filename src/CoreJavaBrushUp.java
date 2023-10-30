import java.util.ArrayList;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
//		for (int s : arr) {
//			
//			System.out.println(s);
//		}
		
		

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("samih");
		a.get(0);
		
		String name = "abdessamia hadjlarbi 1991";
		
//		String[] g = name.split(" ");
		
		for (int i = name.length()-1 ; i>= 0; i--) {
			
			System.out.print(name.charAt(i));
		}

	}

	
	
	
	
}
