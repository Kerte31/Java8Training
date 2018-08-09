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
public class FruitImplement implements IFruit  {
    //this is inherited from IFruit
    //public static final String TYPE = "Apple"; 
    @Override
    public void talk(){
        System.out.println("BlaBla");
    }
    //if a method is static in can't be overriden
    //the next method is static and can't be overriden
    static void speak(){
        System.out.println("Hi");
    }
}
