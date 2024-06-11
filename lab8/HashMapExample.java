package lab8;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String,Double> students = new HashMap<>();
		students.put("Sagar", 3.45);
		students.put("Smirti", 3.55);
		students.put("Kristu", 3.75);
		students.put("Sunit", 3.2);
		
		Double grade = students.get("Kristu");
		System.out.println(grade);
		
		for (Entry<String, Double> entry : students.entrySet()) {
		    String key = entry.getKey();
		    Double value = entry.getValue();
		    System.out.println("Key: " + key + ", Value: " + value);
		    }
	}

}
