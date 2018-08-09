/*
 * Separate Int from Char into a String
 */
package strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mihai
 */
public class SeparateIntFromChar {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {

        Scanner scannerSourceString = new Scanner(System.in);
        System.out.print("Insert String: ");
        String toParse = scannerSourceString.next();
        
        Pattern patternint = Pattern.compile("[0-9]");
        // create a list of integers
        List<String> integers = new LinkedList<>();
        Matcher matcher = patternint.matcher(toParse);
        while (matcher.find()) {
            integers.add(matcher.group());
        }
        //go to all elements in the list and print integers
        for(String str1:integers){
             System.out.println("Integers are:" + str1);
        }     
    }
}
