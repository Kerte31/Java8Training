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
public interface IFruit {
    //in interfaces all variables are static and final by default
    public String TYPE = "Apple";
    //in interfaces all methods are abstract by default so that they can be overriden
    //the next method is abstract and waits to be overriden
    void talk();
}
