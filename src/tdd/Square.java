/*
 * Class Square that returns the definition of Square
 */
package tdd;

/**
 * Class Rectangle that returns the definition of Square
 * @author Mihai
 */
public class Square extends Plane{
    
    private String definition;
    
    //constructor that builds complete definition of Square
    public Square() {
        definition = super.getDefinition()+ " with four equal straight sides and four right angles..";
    }
    
    //returns the definition of Square
    @Override
    public String getDefinition(){
        return definition;
    }
    
}
