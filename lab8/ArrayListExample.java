package lab8;
import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> aL = new ArrayList<>();
		
		//adding the elements to the array list
		aL.add("Sagar");
		aL.add("Smirti");
		aL.add("Kristu");
		aL.add("Sunit");
		
		//removing elements from arraylist
		aL.remove(2);
		
		//printing every element on array list
		for(String i: aL) {
			System.out.println(i);
		}
		
		
		
	}

}
