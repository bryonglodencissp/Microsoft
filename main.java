import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 
  
class TEALS  
{ 
    // Prints numbers from 1 to n 
    static void printNos(int n) 
    { 
        if(n > 0) 
        { 
            printNos(n - 1); 
            System.out.print(n + "\n"); 
        } 
        return; 
    } 
    // Prints odd numbers from 1 to n
    static void printNosLoop(int n)
    {
        for (int i = 1; i <= n; i+=2)
        {
            System.out.println(i); 
        }
    }
    // Driver Code 
    public static void main(String[] args)  
    { 
        //printNos(1000); 
        printNosLoop(1000);
    } 
} 