package Day6cw;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] array = {100,200,300,400, 500};
		        int element = 300;

		        int position = -1; 
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] == element) {
		                position = i;
		                break;  
		            }
		        }
 
		        if (position != -1) {
		            System.out.println("Element " + element + " found at position: " + position);
		        } else {
		            System.out.println("Element " + element + " not found in the array.");
		        }
		    }
		}

	


