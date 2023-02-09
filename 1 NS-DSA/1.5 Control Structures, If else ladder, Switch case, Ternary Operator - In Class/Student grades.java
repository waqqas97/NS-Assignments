// Problem Statement:
// Given marks of a student in 5 subjects(any). You need to find the grade he/she would get on the 
// basis of percentage obtained. Grades computed are as follows:

// If the percentage of marks is >= 80 then print Grade ‘A’
// If the percentage is <80 and >=60 then print Grade ‘B’
// If the percentage is <60 and >=40 then print Grade ‘C’
// else prints Grade ‘D’

// Input:
// The input contains 5 integers separated by spaces.

// Constraints:
// 1 <= marks <= 100

// Output:
// You need to print the grade obtained by him/her.

// Example:
// Sample Input: 1
// 75 70 80 90 100

// Sample Output: 1
// A


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Studentgrades
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int p = (a+b+c+d+e)/5;
        if(p>=80)
        {
            System.out.println('A');
        }
        else if(p<80 && p>=60)
        {
           System.out.println('B');
        }
        else if(p<60 && p>=40)
        {
            System.out.println('C');
        }
        else
        {
            System.out.println('D');
        }
    }
}