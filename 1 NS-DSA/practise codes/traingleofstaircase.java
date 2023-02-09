// Problem Statement:
// Print a right angled triangle of given height N as shown in example.

// Input:
// The input contains a single integer N.

// Constraints:-
// 1 <= N <= 10

// Output:
// Print the Right angled triangle of height N.

// Example:
// Sample Input:1
// 3

// Sample Output:1
// *
// **
// ***

// Sample Input:2
// 4

// Sample Output:2
// *
// **
// ***
// ****



import java.util.*;

public class traingleofstaircase
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        // int hashes=1;
        // int spaces = n-1;
        // for(int i=1; i<=n; i++)
    // {
    //     for(int j=1; j<=hashes; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     for(int j=1; j<=spaces; j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    //     hashes=hashes+1;
    //     spaces=spaces-1;
    // }

    for (int x=0; x<n; x++)
    {
        for(int y=0; y<=x; y++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}