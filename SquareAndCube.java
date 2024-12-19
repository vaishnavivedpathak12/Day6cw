package Day6cw;
import java.util.*;
public class SquareAndCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[]StoreArray= {1,2,3,4,5};
		int[]SquareArray=new int[StoreArray.length];
		int[]CubeArray=new int[StoreArray.length];
		for(int i=0;i<StoreArray.length;i++) {
			SquareArray[i]=StoreArray[i]*StoreArray[i];
			CubeArray[i]=StoreArray[i]*StoreArray[i]*StoreArray[i];
			System.out.print("store Array:");
			for(int i1=0;i1<StoreArray.length;i1++) {
				System.out.println(StoreArray[i1]+"");
			}
			for(int i1=0;i1<SquareArray.length;i1++) {
				System.out.println(SquareArray[i1]+"");
			}
			for(int i1=0;i1<CubeArray.length;i1++) {
				System.out.println(CubeArray[i1]+"");
			}
		}
	}

}
