package Day6cw;
import java.util.*;
public class SingleElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
	int arr[]= new int[5];	
			for(int i=0 ; i<arr.length ; i++)
			{
			arr[i] = sc.nextInt();	
			}
			
			for(int i=0; i<arr.length ; i++)
			{
				sum=sum+arr[i];
			}
}

}
