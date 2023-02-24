// Longest Unique characters Substring


// medium
// asked in interviews by 4 companies
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a string s, find the length of the longest substring without repeating characters.

// Note : String contains spaces also.
// Input
// First Line contains the input of the string.

// Constraints
// 1 <= string.length <= 50000
// s consists of English letters, digits, symbols, and spaces.
// Output
// Print the length of the longest substring without repeating characters.
// Example
// Sample Input:
// abcabcbb

// Sample Output:
// 3

// Explanation: The answer is "abc", with a length of 3.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int longest(String s){
        String test= "";
        int maxlength=-1;
        if(s.isEmpty()){
            return 0;
        }
        else if(s.length()==1){
            return 1;
        }
        for(char c: s.toCharArray()){
            String current=String.valueOf(c);
            if(test.contains(current)){
                test = test.substring(test.indexOf(current)+1);
            }
            test = test +String.valueOf(c);
            maxlength=Math.max(test.length(),maxlength);
        }
            return maxlength;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int len=longest(s);
        System.out.print(len);

    }
}