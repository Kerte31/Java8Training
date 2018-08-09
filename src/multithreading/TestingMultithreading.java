/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class TestingMultithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread hw = new HelloWorld();
        Thread sl = new SalutLume();
        
        hw.start();
        sl.start();
        
        //see priorities of threads
        System.out.println("Prioritate HelloWorld thread: " + hw.getPriority());
        System.out.println("Prioritate SalutLume thread: " + sl.getPriority());
        
        //
        System.out.println("HelloWorld ID= " + hw.getId());
        System.out.println("SalutLume ID= " + sl.getId());
        
        //
        System.out.println("HelloWorld State= " + hw.getState());
        System.out.println("SalutLume State= " + sl.getState());
    }
    
}
