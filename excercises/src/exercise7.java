import java.util.Scanner;
public class exercise7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius?");
        float radius = input.nextFloat();
        System.out.printf("The diameter is: %f%n", 2*radius);
        System.out.printf("The circumference is: %f%n", 2*radius*3.142);
        System.out.printf("The area is : %f%n", 3.142*radius*radius);
    }
}
