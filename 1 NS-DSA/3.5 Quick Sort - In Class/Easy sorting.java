// Easy sorting


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// An array of 5 string is given where each string contains 2 characters, Now you have to sort these strings, like in a dictionary.
// Input
// Input contains 5 strings of length 2 separated by spaces.
// String contains only uppercase English letters.
// Output
// Print the sorted array.
// Example
// INPUT :
// AS KF ER DD JK

// OUTPUT :
// AS DD ER JK KF



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String a[] = new String[n];

        for(int i=0; i<n; i++)
            a[i] = sc.next();

        //Bubble Sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                
                if(a[j].compareTo(a[j+1]) > 0){
                    //swap
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }


        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}