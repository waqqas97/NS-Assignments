// Linear Probing in Hashing


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Linear probing is a collision handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.

// In this question, we'll learn how to fill up the hash table using linear probing technique. You are given hash table size which you'll use to insert elements into their correct position in the hash table i.e.(arr[i]%hashSize). You are also given an array arr of size n. You need to fill up the hash table using linear probing and print the resultant hash table.

// Note: All the positions that are unoccupied are denoted by -1 in the hash table.
// If there is no more space to insert, then just drop that element.
// Input
// The first line of input contains T denoting the number of test cases. T-test cases follow. Each test case contains 2 lines of input. The first line contains the size of the hashtable and the size of the array. The third line contains elements of the array.

// Constraints:-
// 1 ≤ T ≤ 100
// 1 ≤ hashSize ≤ 103
// 1 ≤ sizeOfArray ≤ 103
// 0 ≤ Array[] ≤ 105
// Output
// For each testcase, in a new line, print the hash table as shown in example.
// Example
// Input:
// 2
// 10 4
// 4 14 24 44
// 10 4
// 9 99 999 9999

// Output:
// -1 -1 -1 -1 4 14 24 44 -1 -1
// 99 999 9999 -1 -1 -1 -1 -1 -1 9

// Explanation:
// Testcase1: 4%10=4. So put 4 in hashtable[4]. Now, 14%10=4, but hashtable[4] is already filled so put 14 in the next slot and so on.
// Testcase2: 9%10=9. So put 9 in hashtable[9]. Now, 99%10=9, but hashtable[9] is already filled so put 99 in the (99+1)%10 =0 slot so 99 goes into hashtable[0] and so on.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] ans = new int[k];
        Arrays.fill(ans,-1);
        int arr [] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            int temp =arr[i]%k;
            if(ans[temp]==-1){
                ans[temp]=arr[i];
            }
            else{
                int count=1;
                while(count<=k &&ans[temp]!=-1){
                    temp = (arr[i]+count)%k;
                    count++;
                }
                if(ans[temp]==-1)ans[temp]=arr[i];
            }
        }
        for(int i:ans)System.out.print(i+" ");
        System.out.println();
    }
    }
}