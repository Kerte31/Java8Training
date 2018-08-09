/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classorder;

/**
 *
 * @author Mihai
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1==i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3==i4);
    }  
}
