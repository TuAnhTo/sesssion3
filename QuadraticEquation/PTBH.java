package QuadraticEquation;

import java.util.Scanner;

public class PTBH {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a  = ");
        double a = scanner.nextDouble();
        System.out.println("Enter b = ");
        double b = scanner.nextDouble();
        System.out.println("Enter c  = ");
        double c = scanner.nextDouble();
        QuadraticEquation qd = new QuadraticEquation(a , b, c);
        System.out.println(a+"x^2" + " + " + b+"x" + " + " +"c");
        System.out.println(" Discriminant = " + qd.getDiscriminant());
    }
}
