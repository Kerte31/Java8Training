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
public class Long {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long longWithL = 1000*60*60*24*365L;
        long longWithoutL = 1000*60*60*24*365;
        System.out.println(longWithL);
        System.out.println(longWithoutL);
    }
    
}
