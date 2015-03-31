package ADT;

/**
 *
 * @author darsh
 */
public interface Listable // Objects of classes that implement this interface can be used with lists
{
public abstract int compareTo(Listable other); // Compares this Listable object to "other". If they are equal, 0 is 
//   returned 
// If this is less than the argument, a negative value is returned
// If this is more than the argument, a positive value is returned
public abstract Listable copy(); 
// Returns a new object with the same contents as this Listable object
}
