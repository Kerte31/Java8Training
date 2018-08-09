/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author Mihai
 */
public class Division {
    
    public double division(double a, double b){
        double result = (a/b);
        return result;
    }
    static Division d = new Division();
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {    
        System.out.println("1/2= " + d.division(1, 2));
        System.out.println("4/1= " + d.division(4, 1));
        System.out.println("10/0= " + d.division(10, 0));
    }
}
