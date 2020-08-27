import java.util.*;
class Remove {
    public static int removeElement(int[] nums, int val) {
        int i=0;
for(int j=0;j<nums.length;j++ ){
int first = nums[j];
if(first != val){
nums[i++] = first;
}
}
return i;   
    }
    public static void main(String arg[]){
    	Scanner sc=new Scanner(System.in);
    	int nums[]=new int[6];
    	for(int i=0;i<6;i++){
    		nums[i]=sc.nextInt();
    	}
    	int val=sc.nextInt();
    	System.out.println(removeElement(nums,val));
    	}
    }
