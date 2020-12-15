import java.util.*;
class MatrixTranspose{
	public static void main(String args[]){
		int i,j,n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		 m=sc.nextInt();
		int[][] array=new int[n][m];
			
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				array[i][j]=sc.nextInt();
			}
		}
			System.out.println("The above matrix before Transpose is ");
  			for(i = 0; i < n; i++)
    		{
      	    	for(j = 0; j < m; j++)
            	{
          			System.out.print(array[i][j]+" ");
            	}
            	System.out.println(" ");
        }
 				System.out.println("The above matrix after Transpose is ");
  				for(i = 0; i < m; i++)
    			{
      	    		for(j = 0; j < n; j++)
            		{
                		System.out.print(array[j][i]+" ");
            		}
            		System.out.println(" ");
        }
    }
}