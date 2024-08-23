import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first number \n");
        int num1 = input.nextInt();
        System.out.print("Input your second number \n");
        int num2 = input.nextInt();
        int square1 = num1*num1;
        int square2 = num2*num2;
        int sum = square1 + square2;
        int diff = square1 - square2;
        System.out.print("The squares are:"+square1+"\t"+square2);
        System.out.print("The sum is: "+sum);
        System.out.print("The difference is :"+diff);



    }
}
