/*
 * Class Circle that returns the definition of Circle
 */
package tdd;

/**
 * Class Circle that returns the definition of Circle
 * @author Mihai
 */
public class Circle extends Plane{
    
    private String definition;
    
    //constructor that builds complete definition of Circle
    public Circle() {
        definition = super.getDefinition()+ " whose boundary (the circumference) consists of points equidistant from a fixed point (the centre)";
    }
    
    //returns the definition of Circle
    @Override
    public String getDefinition(){
        return definition;
    }
    
}
