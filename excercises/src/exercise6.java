import java.util.Scanner;
public class exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your first number");
        int num1 = input.nextInt();
        System.out.println("Input your second number");
        int num2 = input.nextInt();
        int tripled = num1*num1*num1;
        int doubled = num2*num2*num2;
        if(tripled%doubled == 0){
            System.out.print(tripled/doubled);
        }
        else{
            System.out.print("It is not a multiple");
        }
    }
}
