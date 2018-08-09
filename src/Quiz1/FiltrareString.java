/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai
 */
public class FiltrareString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please introduce your string:");
        String input = sc.next();
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(input);
        //create a list of integers
        List<String> integers = new ArrayList<>();
        while (matcher.find()) {
            integers.add(matcher.group());
            
        }
        //go through all elements of the list
        for (String list:integers) {
            System.out.println("Integers from string:" + list);
        }

    }
}
