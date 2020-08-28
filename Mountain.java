class Mountain {
    public boolean validMountainArray(int[] a) {
        
        
        int i=0,j=a.length-1;
        if(a.length==0|| a.length==1)
            return false;
        
        while(i<a.length-1)
        {
            if(a[i]<a[i+1])
            {i++;}
            else
                break;
        }
        
        while( j>0)
        { if(a[j]<a[j-1])
                j--;
            else
                break;      
            
        }
        
        if((i!=a.length-1&& j!=0)&&(i==j || j<i))
            return true;
        else
            return false;

        }
}