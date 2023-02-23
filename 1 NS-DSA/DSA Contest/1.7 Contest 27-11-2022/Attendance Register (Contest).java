// Attendance Register (Contest)


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There is class of students. Their teacher is taking their attendance in the morning as usual. But this time, the list of students in the register feels weird. There are suddenly more names there. Apparently a few mischevious students have repeated their names in the register. Find the number of these mischevious students who have multiple names in the register.
// Input
// The first line of the input contains a single integer N - the number of names in the register.
// The next N lines of the input each contains a string.

// Constraints:
// 1 <= N <= 104
// 1 <= |Si| <= 100
// Output
// Find the number of mischevious students who have multiple names in the register.
// Example
// Sample Input:
// 5
// Newton
// Einstein
// Newton
// Bohr
// Einstein

// Sample Output:
// 2

// Explaination:
// Only two students have repeated names in the register.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer>map = new HashMap<>();
        for(int i=0; i<n; i++){
            String name = sc.next();
            if(!map.containsKey(name))
                map.put(name, 1);
            else
                map.put(name, map.get(name)+1);
        }
        int count=0;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                count++;
            }
        }
        System.out.println(count);
    }
}