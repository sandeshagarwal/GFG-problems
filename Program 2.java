/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int j=0;j<T;j++)
		{
		    int N = sc.nextInt();
		    int A[] = new int [N];
		    for(int i=0;i<N;i++)
		    {
		        A[i]= sc.nextInt();
		    }
		    for(int i=N-1;i>=0;i--)
		    {
		        System.out.print(A[i]+" ");
		    }
		    System.out.println();
		}
	}
}
