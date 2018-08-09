/*
 * Program returns the list 
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author Mihai
 */
public class ListofDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a list of shapes
        LinkedList<Shape> listofShapes = new LinkedList<>();
        //create concrete Shapes
        Rectangle dr1 = new Rectangle ();
        Rectangle dr2 = new Rectangle ();
        Circle c = new Circle ();
        Triangle tr1 = new Triangle ();
        Triangle tr2 = new Triangle ();
        Square s = new Square ();
        //add concrete Shapes in the list
        listofShapes.add(dr1);
        listofShapes.add(dr2);
        listofShapes.add(c);
        listofShapes.add(tr1);
        listofShapes.add(tr2);
        listofShapes.add(s);
        //go to all elements in the list and print definitions
        for(Shape currentShape: listofShapes){
            System.out.println(currentShape.getDefinition());
        }
        
    }
    
}
