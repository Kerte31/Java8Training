/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author Mihai
 */
public class Someinc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        boolean t = true;
        boolean f = false, b;
        b = (t || ((i++) == 0));
        b = (f || ((i += 2) > 0));
        System.out.println(i);
    }
    //If a is false then a && b will return false without even evaluating b.
    //Same goes for a || b: If the first operand, a is true, the whole expression is true and the second operand, b is never evaluated. 
    //For a | b however, both a and b will be evaluated.
}
