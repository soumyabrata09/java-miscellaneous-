/**
 * 
 */
package com.Exercises;

import java.util.ArrayList;
/**
 * @author Sam
 *
 */
/* Dynamic Programming Java implementation of Coin
Change problem */
import java.util.Arrays;
import java.util.List;

public class CoinChangeProblem
{
	static long countWays(int S[], int m, int n)
	{
		//Time complexity of this function: O(mn)
		//Space Complexity of this function: O(n)

		// table[i] will be storing the number of solutions
		// for value i. We need n+1 rows as the table is
		// constructed in bottom up manner using the base
		// case (n = 0)
		long[] table = new long[n+1];
        int j ;
		// Initialize all table values as 0
		Arrays.fill(table, 0); //O(n)

		// Base case (If given value is 0)
		table[0] = 1;
        List list = new ArrayList();
		// Pick all coins one by one and update the table[]
		// values after the index greater than or equal to
		// the value of the picked coin
		for (int i=0; i<m; i++){
			for ( j=S[i]; j<=n; j++){
				table[j] += table[j-S[i]];
			//	list.add(table[j]);
          }
			System.out.print("{");
			for(int i1=0; i1< table.length; i1++) {
				
			System.out.print(table[i1]);
				
			}
			System.out.println("}");
			System.out.println("---------------");
		}
		return table[n];
	}

	// Driver Function to test above function
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3};
		int m = arr.length;
		int n = 7;
		System.out.println(countWays(arr, m, n));
	}
}
// This code is contributed by Pankaj Kumar
