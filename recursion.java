import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit of sum: ");
        int input = s.nextInt();
        int result = sum(input);
       
        System.out.println("Sum of all natural numbers to the input limit is: "+result);
    }

    public static int sum(int x){
        if (x==0){
            return 0;
        }
        else{
            return x + sum(x-1);
        }
    }
    
}
