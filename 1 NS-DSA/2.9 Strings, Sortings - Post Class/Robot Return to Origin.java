// Robot Return to Origin



// medium
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
// You have given a string of moves that represents the move sequence of the robot where moves[i] represent its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
// Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
// Note:
// The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
// Input
// There is a single line containing a string as input.

// Constraints:
// 1 ≤ s. length ≤ 105
// s contains only characters 'L', 'R', 'U', 'D'
// Output
// Print True if the robot returns to the origin after it finishes all of its moves, or False otherwise.
// Example
// Sample Input:
// UD

// Sample Output:
// True



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.next();

                char ch[] = str.toCharArray();

                int count = 0;
                for(int i=0; i<ch.length; i++){
                        if(ch[i] == 'R' || ch[i] =='U'){
                            count+=1;
                        }else{
                            count-=1;
                        }
                }
                if(count==0){
                    System.out.print("True");
                }
                else{
                    System.out.print("False");
                }
    }
}