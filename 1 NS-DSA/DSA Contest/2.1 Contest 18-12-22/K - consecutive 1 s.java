// K - consecutive 1's


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an integer array, nums[], and an integer k. Nums comprises of only 0's and 1's. In one move, you can choose two adjacent indices and swap their values.

// Return the minimum number of moves required so that nums has k consecutive 1's.
// Input
// There is an integer n(size of array nums) is given as input.
// In second line. there are n integers are given.
// in third line an integer k is given.

// <>Constraints
// 1 <= nums.length <= 103
// nums[i] is 0 or 1.
// 1 <= k <= sum(nums)
// Output
// Return the minimum number of moves required so that nums has k consecutive 1's.
// Example
// Sample Input:
// 6
// 1 0 0 1 0 1
// 2

// Sample Output:
// 1

// Explanation: In 1 move, nums could be [1, 0, 0, 0, 1, 1] and have 2 consecutive 1's.





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {   
            public static int minMoves(int[] nums, int k) {
        ArrayList<Long> A = new ArrayList<Long>(), B = new ArrayList<Long>();
        for (int i = 0; i < nums.length; ++i)
            if (nums[i] == 1)
                A.add((long)i);
        long res = Long.MAX_VALUE;
        B.add(0L);
        for (int i = 0; i < A.size(); ++i)
            B.add(B.get(i) + A.get(i));
        for (int i = 0; i <  A.size() - k + 1; ++i)
            res = Math.min(res, B.get(i + k) - B.get(k / 2 + i) - B.get((k + 1) / 2 + i) + B.get(i));
        res -= (k / 2) * ((k + 1) / 2);
        return (int)res;
    }
     public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
                      int n=sc.nextInt();
                      int nums[]=new int[n];
                      for(int i=0;i<n;i++){
                          nums[i]=sc.nextInt();
                      }
                      int k=sc.nextInt();
                      System.out.print(minMoves(nums,k));
    }
}