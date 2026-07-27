//Richest Customer wealth :-
/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
Example 2:
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */

package c05_arrays;

import java.util.Arrays;

public class RichestWealth {
	public static void main(String[] args) {
		int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		RichestWealth obj = new RichestWealth();
		System.out.println("the richest customer wealth is: " + obj.maximumWealth(accounts));

	}

	public int maximumWealth(int[][] accounts) {

		int maxWealth = 0;

		for (int[] customer : accounts) {
			int wealth = 0;
			for (int money : customer) {
				wealth += money;
			}

			maxWealth = Math.max(maxWealth, wealth);

		}

		return maxWealth;

	}

}
