// DNA Sequence

// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
// For example, "ACGAATTCCG" is a DNA sequence.
// When studying DNA, it is useful to identify repeated sequences within the DNA.
// Given a string s that represents a DNA sequence, return all the 10-letter long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order. This is a functional problem you have to complete the solve function.
// Input
// The first line of the input contains the string s.

// Constraints
// 1 <= s. length() <= 1e5
// s[i] is either 'A', 'C', 'G', or 'T'
// Output
// Complete the function and return the relevant strings.
// Example
// Sample Input:-
// GGGGGGGGGGGGG

// Sample Output:-
// GGGGGGGGGG


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void DNASequence(String input) {
        // Your code here
     int n = input.length();
     HashSet<String> set = new HashSet<>();
     HashSet<String> res = new HashSet<>();
     ArrayList<String> list = new ArrayList<>();
     for(int i=0; i<=n-10; i++){
         String result = input.substring(i, i+10);

         if(set.contains(result)){
             res.add(result);
         }
         set.add(result);
     } 
     for(String r : res){
         list.add(r);
     }
     Collections.sort(list);
     for(String r : list){
     System.out.println(r);
    }
}
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    DNASequence(input);
}
}