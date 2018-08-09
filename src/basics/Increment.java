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
public class Increment {

    static int a = 1111;
    static{
        a = a-- - --a;
     
    }
    {a = a++ + ++a;}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(a);
    }
    
}
