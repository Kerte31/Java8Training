/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai
 */
public class SalutLumeTest {
    
    public SalutLumeTest() {
    }

    /**
     * Test of run method, of class SalutLume.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        SalutLume instance = new SalutLume();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
