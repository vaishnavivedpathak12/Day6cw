package Day6cw;
import java.lang.reflect.Array;
import java.util.*;
public class StoreThirdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {5, 4, 3, 2, 1};
	        int[] resultArray = new int[array1.length];
	        for (int i = 0; i < array1.length; i++) {
	            resultArray[i] = array1[i] + array2[i];
	        }
	        System.out.print("Store in third arrays: ");
	        for (int i = 0; i < resultArray.length; i++) {
	            System.out.print(resultArray[i] + " ");
	        }
	    }
	}

	


