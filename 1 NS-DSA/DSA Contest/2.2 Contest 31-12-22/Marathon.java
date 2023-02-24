// Marathon


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There is a marathon to be run on a circular track. There are N checkpoints on the track where energy drinks are placed. Checkpoints are numbered from 1 to N (both inclusive). For each checkpoint, you know the distance to the next checkpoint and also the energy replenished by the drink at this checkpoint.
// Toros is going to take part in the marathon. For every 1 unit distance covered by him, his energy decreases by 1. He can't run further if he has 0 energy. Find the minimum index of the point where he should start so that he can visit every checkpoint at least once. Initially, he has 0 energy.
// Input
// The first line contains a single integer N, denoting the number of checkpoints.
// The next N lines contain two space-separated integers, E[i] and D[i], denoting the energy replenished by the energy drink kept at the ith checkpoint and the distance to the next checkpoint.

// Constraints
// 1 ≤ N ≤ 105
// 1 ≤ E[i], D[i] ≤ 109
// Output
// Print a single integer containing the minimum index of the checkpoint where Toros should start so that he can complete the race.
// If no such point exists, print -1
// Example
// Sample Input 1:
// 3
// 1 5
// 10 3
// 3 4

// Sample Output 1:
// 2

// Sample Input 2:-
// 3
// 2 4
// 5 4
// 2 7

// Sample Output 2:-
// -1

// Sample Input 3:-
// 5
// 1 4
// 5 6
// 3 1
// 7 2
// 5 8

// Sample Output 3:-
// 3

// Explanation 1:
// Toros starts at index 2 and drinks energy drinks. So, current energy = 10. At index 3, energy = 10 - 3 + 3 = 10. At index 1 energy = 10 - 4 + 1 = 7.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException{
        // Your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];
    int[] brr = new int[n];

    for(int i=0; i<n; i++){

        String str = br.readLine();
        String[] s1 = str.split(" ");
        arr[i] = Integer.parseInt(s1[0]);
        brr[i] = Integer.parseInt(s1[1]);

        }
        System.out.println(marathon(arr, brr));
    }
    public static int marathon(int[] energy, int[] distance){
        int n = energy.length;
        for(int i=0; i<n-1; i++){
            int sum = energy[i];
            boolean flag = true;

            int ind =i;
            for(int j=i+1; j!= i; j=(j+1)%n){
                sum = sum- distance[ind];
                if(sum < 0){
                    flag = false;
                    break;
                }
                sum = sum + energy[j];
                ind = (ind+1)%n;
            }
            if(flag) return i+1;
        }
        return -1;
    }
}