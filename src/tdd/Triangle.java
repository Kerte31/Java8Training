/*
 * Class Triangle that returns the definition of Triangle
 */
package tdd;

/**
 * Class Triangle that returns the definition of Triangle
 * @author Mihai
 */
public class Triangle extends Plane{
    
    private String definition;
    
    //constructor that builds complete definition of Triangle
    public Triangle() {
        definition = super.getDefinition()+ " with three straight sides and three angles.";
    }
    
    //returns the definition of Triangle
    @Override
    public String getDefinition(){
        return definition;
    }
    
}
