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
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        do {
            i--;//executed before check statement
        } while (i > 2);
        System.out.println(i);
    }

}
