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
public class Test extends FruitImplement{
        @Override
        public void talk(){
        System.out.println("BlaBlaBla");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //talk method can't be used because is abstract, thus it can't be used in static context
        //talk();
        FruitImplement.speak();
        System.out.println(FruitImplement.TYPE);
        System.out.println(FruitExtend.Name);
    } 
}
