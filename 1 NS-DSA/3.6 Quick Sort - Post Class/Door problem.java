// Door problem



// hard
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There is a door at Newton School that can be used only by one person at a time i. e either a person can enter from the door or exit but no two people can do it simultaneously. If two people going in the opposite direction arrived at the door at the same time then these 3 cases should be considered:-
// 1. If the door was not used before or it was not used in the previous second then the person who wants to exit goes first.
// 2. If the door has been used in the previous second for entering, then the person who wants to enter goes first.
// 3. If the door has been used in the previous second for exiting, then the person who wants to exist goes first.

// If two people arrive at the same time and go in the same direction then the person whose name in the given list comes first will go first.

// Note:- To cross the door, it will take exactly one second for each person.
// Input
// The first line of input contains a single integer N containing the number of people The second line of input contains N space-separated integers depicting the arrival time of the ith person. The last line of input containing N space-separated integers which are either 0 or 1. 0 indicates that the person wants to enter and 1 indicates he wants to exit.

// Constraints:-
// 1 ≤ N ≤ 50000
// 0 ≤ Arrival[i] ≤ Arrival [i+1] ≤ 109
// Output
// Print N space-separated integers denoting the time at which the ith person will cross the door.
// Example
// Sample Input 1:-
// 4
// 0 0 1 5
// 0 1 1 0

// Sample Output 1:-
// 2 0 1 5


// Sample Input 2:-
// 5
// 0 1 1 3 3
// 0 1 0 0 1

// Sample Output 2:-
// 0 2 1 4 3

// Explanation:-
// At t = 0:- the first and the second person wants to enter and exit. As per the case, 1 2nd person will go first.
// At t=1, the first and the 3rd person wants to enter and exit. As per case 3, the 3rd person goes first.
// At t= 2, only 1st is the only person standing so he goes.
// At t = 3, and 4 no one wants to cross
// At t = 5, the 4th person is the only one who wants to cross.




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long arrival[] = new long[n];   //arrival time
        int status;

        boolean flag = false; int i; long time = 0; 
        int exit_index,enter_index;
        long exit_time,enter_time;

        Queue<Integer> entry = new LinkedList<>();

        Queue<Integer> exit = new LinkedList<>();

        long res[] = new long[n];

        for(i=0;i<n;i++){
            arrival[i] = sc.nextLong();
        }
        for(i=0;i<n;i++){
            status = sc.nextInt();
            if(status==0){   //status -> entry(0)
                entry.add(i);
            }
            else{            //status -> exit(1)
                exit.add(i);
            }    
        }

        while(!entry.isEmpty() && !exit.isEmpty()){
            exit_index = exit.peek();

            enter_index = entry.peek();

            exit_time = arrival[exit_index]-time;

            enter_time = arrival[enter_index]-time;

            //System.out.println("exit diff "+exit_time+" entry diff "+enter_time);

            while(arrival[exit_index]>time && arrival[enter_index]>time){
                time++;
                
                flag = false;

                //System.out.println("time is-> "+time);
            }
            if((flag==false&&(exit_time<=0))||(flag==true&&(exit_time<=0&&enter_time>0))){   //exiting people
                exit.remove();

                res[exit_index] = time;

                //System.out.println("exiting "+exit_index+"th person at time "+time+" "+flag);

                time++;

                flag = false;
            }
            else if((flag==false&&(exit_time>0&&enter_time<=0))||(flag==true&&(enter_time<=0))){ //entry people
                entry.remove();

                res[enter_index] = time;

                //System.out.println("entering "+enter_index+"th person at time "+time+" "+flag);

                time++;

                flag = true;
            }

        }
        while(!entry.isEmpty()){
                enter_index = entry.peek();

                entry.remove();

                if(time<arrival[enter_index]){

                    res[enter_index] = arrival[enter_index];
                    //System.out.println("entering "+enter_index+"th person at time "+arrival[enter_index]+" "+flag);
                    time = 1 + arrival[enter_index];
                }  
                else{

                    res[enter_index] = time;
                    //System.out.println("entering "+enter_index+"th person at time "+time+" "+flag);
                    time++;
                }
        }
        while(!exit.isEmpty()){
            exit_index = exit.peek();

            exit.remove();

                if(time<arrival[exit_index]){

                    res[exit_index] = arrival[exit_index];
                    //System.out.println("exiting "+exit_index+"th person at time "+arrival[exit_index]+" "+flag);
                    time = 1 + arrival[exit_index];
                }
                    
                else{
                    res[exit_index] = time;
                    //System.out.println("entering "+exit_index+"th person at time "+time+" "+flag);
                    time++;
                }
        }
        for(i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}