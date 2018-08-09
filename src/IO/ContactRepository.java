/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mihai
 */
public class ContactRepository {
    String file;
    ContactRepository(String file){
        this.file = file;
    }
    void saveContact(String name, String email){
        String row = name + "," + email + "\n";
        writeRow(row);
        
    }
    void writeRow(String row){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter (file, true));
            out.write(row);
        } catch(IOException e){
            throw new RuntimeException (e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactRepository repo = new ContactRepository("C:\\Users\\Mihai\\Desktop\\teste");
        repo.saveContact("Mihai", "mihai.finaga@gmail.com");
    }
    
}
