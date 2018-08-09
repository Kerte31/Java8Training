/*
 * Creates the sum of two sin and cos
 */
package basics;
import java.util.Scanner;
/**
 *
 * @author Mihai
 */
public class SinCosSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Insert x(double value): ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double sinus = Math.sin(x);
        double cosinus = Math.cos(x);
        double result = Math.hypot(sinus, cosinus);
        System.out.println("sin^2(x)+sin^2(y) " + result);
    } 
}