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
public class IntegerOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this is needed to verify that command line argument is not empty
        if(args.length>0){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        System.out.println(a + "+" + b + "=" + sum);
        // implement other operations and print results!
        }
    } 
}
