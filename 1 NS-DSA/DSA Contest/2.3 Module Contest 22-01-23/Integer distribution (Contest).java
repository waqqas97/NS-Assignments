// Integer distribution (Contest)


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Bob has N integers. He will divide these integers into three non- empty sets S1, S2 and S3.
// After that bob will take one integer from each set X1, X2 and X3. It can be any integer of the set.

// Variation of the distribution of integer is defined as
// V = | X1 - X2 | + | X2 - X3 |

// What is the best way to distribute integers in three sets so that variation is minimum?
// Print the minimum variation of any Integer distribution.
// Input
// First line contains N.
// Next line contains N space separated integers.

// Constraints
// 3 ≤ N ≤ 105
// 1 ≤ arr[i] ≤ 109
// Output
// Output a single integer denoting the minimum possible variation of an integer distribution.
// Example
// Input:
// 5
// 3 1 5 2 3

// Output:
// 1

// Explanation:
// S1 => 2 5 => say X1 = 2
// S2 => 1 3 => say X2 = 3
// S3 => 3 => say X3 = 3
// V = |X1 - X2| + |X2 - X3| = |2 - 3| + |3-3| = 1




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<n-1; i++){
            int val = Math.abs(a[i-1] -a[i])+Math.abs(a[i]-a[i+1]);
            min = Math.min(min,val);
        }        
        System.out.print(min);
    }
}