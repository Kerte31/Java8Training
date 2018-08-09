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
public class IndexException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lenght of array is 5
        int ar[] = {1, 2, 3, 4, 5};
        //this loop has 6 elements, thus the exception
        //solve this by making i<ar.lenght instead of i<=ar.lenght
        for (int i=0; i<ar.length; i++)
            System.out.println(ar[i]);   
        //use the command line arguments
        for (int i=0; i<args.length; i++)
            System.out.println(ar[i]); 
    }   
}
