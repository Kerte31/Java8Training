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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5;
        System.out.println(s);
        
        int i = 10+ +11- -12+ +13- 14+ +15;
        System.out.println(i);
        
        String one ="Random";
        String two ="RAndom";
        if(one==two){
            System.out.println("one == two");
        }else{
            System.out.println("one != two");
        }
    } 
}
