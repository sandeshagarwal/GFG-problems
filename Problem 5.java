/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int flag = 0;
		for(int j=0;j<T;j++)
		{
		    int n = sc.nextInt();
		    long Arr[] = new long[n];
		    for(int i=0;i<n;i++)
		    {
		        Arr[i] = sc.nextLong();
		    }
		    long x = sc.nextLong();
		    for(int i=0;i<n;i++)
		    {
		        if(Arr[i] == x)
		        {
		             flag = i;
		             break;
		        }
		       else{
		           flag = -1;
		       }
		    }
		    if(flag == -1)
		    {
		        System.out.println("-1");
		    }
		    else{
		        System.out.println(flag);
		    }
		}
	}
}
