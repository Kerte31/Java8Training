/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai
 */
public class TriangleTest {
    
    public TriangleTest() {
    }

    /**
     * Test of getDefinition method, of class Triangle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Triangle instance = new Triangle();
        String expResult = "figura geometrica plana with three straight sides and three angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
