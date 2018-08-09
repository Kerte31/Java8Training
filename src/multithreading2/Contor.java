/*
 * Class Counter
 */
package multithreading2;

/**
 * Syncronised method
 * @author Mihai
 */
public class Contor {
    private volatile int contor = 0;
    
    public synchronized void add(){
        contor++;
        System.out.println("Add one = " + contor);
    }
    
    public synchronized void sub(){
        contor--;
        System.out.println("Substract one = " + contor);
    }
    
}
