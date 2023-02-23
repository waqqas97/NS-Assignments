// Find Bad Number


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Alex always skips math class. As a punishment, his teacher has given him an array of size n where every number except one is the power of x.
// Being poor in mathematics, Alex has asked for your help to solve the problem. Can you help him to find the bad number which is not a power of x?

// NOTE:
// It is guaranteed that there always exists an answer.
// Input
// The first line of the input contains the integers n and x
// The following line contains n integers describing the array a

// Constraints
// 2 ≤ n ≤ 1000
// 1 ≤ x ≤ 20
// 1 &le ai ≤ 108
// Output
// For each test case, output a single line containing the bad number.
// Example
// input
// 6 7
// 16807 343 50 823543 2401 5764801

// output
// 50


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int len = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for(int j=0; j<len; j++){
            if(!isPower(x, arr[j])){
                System.out.println(arr[j]);
                break;
            }
        }
    }

    public static boolean isPower(int x, int y){
        if(x ==1){
            return y==1;
        }
        int pow = 1;
        while(pow<y){
            pow = pow * x;
        }
        return (pow ==y);
    }
}