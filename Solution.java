import java.util.*;
class Solution {
    public static int findMaxConsecutiveOnes(boolean[] nums,int n) {
        // Hint: Initialise and declare a variable here to 
        // keep track of how many 1's you've seen in a row.
        int count=0;
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
            if(nums[i]==false){
            	count=0;
            }
            else{
            	count++;
            	result=Math.max(result,count);
            }
        }
        return result;
    }
    public static void main(String arg[]){
    	
        boolean nums[] = {true, true, false, false,  
                         true, false, true, false, 
                           true, true, true, true}; 
                             
        int n = nums.length;
    	System.out.println(findMaxConsecutiveOnes(nums,n));
        
   }
 }

