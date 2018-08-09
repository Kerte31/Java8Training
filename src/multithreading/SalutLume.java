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
public class SalutLume extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Salut lume!");
        } catch (InterruptedException ex) {
            Logger.getLogger(SalutLume.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
