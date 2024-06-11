package lab8;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> LL = new LinkedList<>();
		
		//adding element to the linkedlist
		LL.add(2);
		LL.add(3);
		LL.add(4);
		LL.add(5);
		
		
		//iterating to print all elements
		Iterator<Integer> itr = LL.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println(i+" ");
		}
		
		
	}

}
