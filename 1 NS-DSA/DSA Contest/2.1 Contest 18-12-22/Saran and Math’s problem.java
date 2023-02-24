// Saran and Math’s problem

// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Saran is the intelligent boy of the whole kindergarten. One day his Maths teacher gave him a stream of characters and asked him to find length of the longest substring in the stream of letters which has not more than 2 distinct letters in it.
// Saran is too small to deal with this and wants you to help him out

// Note that, string ‘B’ is a substring of a string ‘A’ if ‘B’ that can be obtained by deletion of, several characters(possibly none) from the start of ‘A’ and several characters(possibly none) from the end of ‘A’.
// Input
// The first line contains a single integer ‘T’ denoting the number of test cases, then each test case follows:
// The first line of each test case contains a string ‘S’, denoting the input string.

// Constraints:
// 1 ≤ T ≤ 10
// 1 ≤ |S| ≤ 1000
// Where 'S' contains lowercase English alphabets
// Output
// For each test case, print the length of the longest substring containing at most two distinct characters.
// Output for each test case will be printed in a separate line.
// Example
// input
// 2
// aabbccdd
// aaaxzyyyy


// output
// 3
// 5


// Explanation:
// In the first test case, Saran has been given ‘aabbccdd’ where he can form 3 words ‘aabb’, ‘bbcc’ and ‘ccdd’ each of them has a size of 4 and 2 distinct letters in it
// Maximum of which is of size 4.

// In the second test case, Saran has been given ‘aaaxzyyyy’ he can form ‘aaax’, ’ax’, ’xz’, ’zyyyy’ with 2 disctinct letters in each so the maximum of them ‘zyyyy’ has length 5


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chs = s.toCharArray();
        int n = s.length();
        HashMap<Character, Integer> count = new HashMap<>();
        int longest = 0;
        int firstIdx = 0;
        for (int i = 0; i < n; i++) {
            count.put(chs[i], count.getOrDefault(chs[i], 0) + 1);
            while (count.size() > 2) {
                count.put(chs[firstIdx], count.get(chs[firstIdx]) - 1);
                if (count.get(chs[firstIdx]) == 0) {
                    count.remove(chs[firstIdx]);
                }
                firstIdx++;
            }
            longest = Math.max(longest, i - firstIdx + 1);
        }
        return longest;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String str = sc.next();
            System.out.println(lengthOfLongestSubstringTwoDistinct(str));
            t--;
        }
    }
}