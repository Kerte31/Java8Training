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
public class Test {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(args[args.length - 1]);
        int i = intObj.intValue();

        if (args.length > 1) {
            System.out.println(i);
        }
        if (args.length > 0) {
            System.out.println(i - 1);
        } else {
            System.out.println(i - 2);
        }
        int[][] x[];
 
    }
}
