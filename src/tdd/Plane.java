/*
 * Class Plane, the mother of all plane figures
 */
package tdd;

/**
 * Class Plane, the mother of all plane figures
 *
 * @author Mihai
 */
public class Plane extends Shape {

    String definition;

    //constructor
    public Plane() {
        definition = super.getDefinition()+" plana";
    }

    /**
     * Return definitions composed from shape
     *
     * @return complete definition
     */
    
    //return definition
    @Override
    protected String getDefinition() {
        return definition;
    }

}
