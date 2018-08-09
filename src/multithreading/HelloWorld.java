/*
 * Hello World as new Thread
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class HelloWorld extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Hello world!");
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloWorld.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    
}
