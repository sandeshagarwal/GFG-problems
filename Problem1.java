import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int j=0;j<T;j++)
	    {
	    int n = sc.nextInt();
	    int A[] = new int [n];
	    for(int i=0;i<n;i++)
	    {
	        A[i]=sc.nextInt();
	    }
	
		int sum =0;
		for(int i=0;i<n;i++)
		{
		    sum = sum + A[i];
		}
		System.out.println(sum);
	    }
	}
}
