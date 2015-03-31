package ADT;

/**
 *
 * @author darsh
 */
public abstract class List {
    
protected Listable[] list;  // Array of list’s elements
protected int numOfItems;  // Number of elements on this list
protected int currntPos;  // Current position  
  
public List(int maxItems) // constructor. This will instantiates and returns a reference
{
numOfItems = 0;
list = new Listable[maxItems];
}

public boolean isFull() // Returns whether this list is full
{
return (list.length == numOfItems);
}

public int length()
// Returns the number of elements on this list 
{
return numOfItems;
}

public abstract boolean isThere (Listable item);
// Returns true if found the searched item. Otherwise, returns false
public abstract Listable retrieve(Listable item);
// Returns a copy of the list element with the same key as item
public abstract void insert (Listable item);
// Adds a copy of item to this list 
public abstract void delete (Listable item);
// Deletes the element with the same key as item from this list 

public void reset()
// Initializes current position for an iteration through this list
{
currntPos = 0;
}
public Listable getNextItem ()
// Returns copy of the next element on this list 
{
Listable next = list[currntPos];
if (currntPos == numOfItems-1)
currntPos = 0;
else
currntPos++;
return next.copy();
}
}