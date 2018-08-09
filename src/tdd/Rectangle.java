/*
 * Class Rectangle that returns the definition of Rectangle
 */
package tdd;

/**
 * Class Rectangle that returns the definition of Rectangle
 *
 * @author Mihai
 */
public class Rectangle extends Plane {

    private String definition;

    //constructor that builds complete definition of Rectangle
    public Rectangle() {
        definition = super.getDefinition()+ " with four straight sides and four right angles,especially one with unequal adjacent sides, in contrast to a square";
    }

    //returns the definition of Rectangle
    @Override
    public String getDefinition() {
        return definition;
    }

}
