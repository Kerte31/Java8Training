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
public class DoubleOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this is needed to verify that command line argument is not empty
        if(args.length>0){
        double a = Double.parseDouble(args[0]);
        a = Math.toRadians(a);
        System.out.println("Math.sin(" + a + ") = " + Math.sin(a));
       }
        double b = 1.2;
        double c;
        c = Math.toRadians(b);
        System.out.println("sin(" + b + ") = " + Math.sin(b));
    }  
}
