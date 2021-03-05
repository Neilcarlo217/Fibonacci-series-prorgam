import java.util.Scanner;

public class test1{
	public static int fib(int n){#function
	if(n == 0)
	{
		return 0;
	}
	else if(n == 1 || n == 2)
	{
		return 1;
    }
	else
	{
		return fib(n-2) + fib(n-1);#recursive function
    }
}
    public static void main(String args[]) {
	Scanner scan = new Scanner(System.in); #to get the no from user
        System.out.print("Enter how many fibonacci no's are needed: ");#gives how many numbers need to be printed
        int num = scan.nextInt();
	    System.out.print("Fibonacci Series of "+num+" numbers: ");# to print the series of numbers
	    for(int i = 0; i < num; i++){
			System.out.print(fib(i) +" ");#calls the function
		}
	}
}
