import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your first number");
        int num1 = input.nextInt();
        System.out.println("Input your second number");
        int num2 = input.nextInt();
        System.out.println("Input your third number");
        int num3 = input.nextInt();
        if(num1%3 == 0){
            System.out.println("The first number is divisible by 3");
        }
        if(num2%3 == 0){
            System.out.println("The second number is divisible by 3");
        }
        if(num3%3 == 0){
            System.out.println("The third number is divisible by 3");
        }
    }
}
