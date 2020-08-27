import java.util.*;
public class SortSquare{
	public static void sortedSquares(int[] arr){
		for(int i=0;i<arr.length;i++){
			int square=arr[i]*arr[i];
			arr[i]=square;
		}
		Arrays.sort(arr);

	}
	public static void main(String arg[]){

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sortedSquares(arr);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+"");
		}
		
	}
}