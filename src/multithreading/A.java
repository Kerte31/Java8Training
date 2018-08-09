/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Mihai
 */
public class A extends Thread {

    public void run() {
        System.out.println("A");
        Thread t = new Thread(new B());
        t.start();
    }
}