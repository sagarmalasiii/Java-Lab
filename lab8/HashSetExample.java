package lab8;
import java.util.HashSet;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		//adding elements to the HashSet
		hs.add("Batman");
		hs.add("Superman");
		hs.add("Ironman");
		hs.add("x-man");
		
		//checks if the element is present or not
		if(hs.contains("Nullman")) {
			System.out.println("Element present");
		}
		else
			System.out.println("Element not present");
		
		
		for(String i: hs) {
			System.out.println(i);
		}
		
	}

}
