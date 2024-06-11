package lab8;
import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[]= {7,2,1,5};
		//sorting array
		Arrays.sort(arr);
		//printing sorted array
		for(int i: arr) {
			System.out.print(i+" ");
		}
		

	}

}
