import java.util.*;
class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]*2==arr[j] && i!=j){
                    return true;
                
            }
        }
    
    }
    return false;
}
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int n=5;
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println(checkIfExist(arr));
}
}