//User function Template for Java

/*  
     arr[] is the array
     n = number of element in array
     mod = modulo value;
*/
class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        long multiple = 1;
        for(int i=0;i<n;i++)
        {
            multiple = ((multiple%mod)*(arr[i]%mod))%mod; // The property of modulo for multiplication is:
                                                          // (A*B)%C = ((A%C) * (B%C))%C
         
        }
        
        return multiple;
    }
}
