import java.util.*;
public class Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        for(int i=0; i<breadth; i++)
        {
            for(int j=0; j<length; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }    

        for(int x=0; x<breadth; x++)
        {
            for(int y=0; y<x; y++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }    
}
