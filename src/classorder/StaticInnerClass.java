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
public class StaticInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final class Constants {public final static String name ="PI";}
        Thread thread = new Thread(new Runnable(){
        @Override
        public void run(){
            System.out.println(Constants.name);
        }
        });
        thread.start();
    }
}
