import java.util.Scanner;
public class FizzBizz {
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        if(n % 3 == 0)
        {
            System.out.println("Fizz");
        } else if(n % 5 == 0) {
            System.out.println("Buzz");
        } else if (n % 15 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(n);
        }

    }   
}    