import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        float num1 = input.nextFloat();
        System.out.println("Input second number");
        float num2 = input.nextFloat();
        System.out.println("Input third number");
        float num3 = input.nextFloat();
        float sum = num1 + num2 + num3;
        float average = sum / 3;
        float product = num1 * num2 * num3;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The product is " + product);
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The highest number is " + num1);
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("The highest number is " + num2);
            }
        }
        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("The highest number is " + num3);
            }
        }
        if (num1 < num2) {
            if (num1 < num3) {
                System.out.print("The lowest number is " + num1);
            }
        }
        if (num2 < num1) {
            if (num2 < num3) {
                System.out.print("The lowest number is " + num2);
            }
        }
        if (num3 < num1) {
            if (num3 < num2) {
                System.out.print("The lowest number is " + num3);
            }
        }
    }
}
