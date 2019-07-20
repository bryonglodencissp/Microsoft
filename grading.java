import java.util.*; 
  
class GRADE  
{ 
    // Prints numbers from 1 to n 
    public static void howOdd()
    {
        Scanner ape = new Scanner(System.in);
        System.out.println("Type a number, then press enter.");
        int input = ape.nextInt();
        int sum = 0;

        System.out.println("You entered " + input);
        for(int i = 1; i <= input; i+=2)
        {
            sum = sum + i;
        }
        // The sum of all odd numbers between 0 and input
        System.out.println("The sum is " + sum);
    }
    // Driver Code 
    public static void main(String[] args)  
    { 
        howOdd();
    } 
} 