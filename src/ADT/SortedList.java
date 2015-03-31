package ADT;

/**
 *
 * @author darsh
 */
public class SortedList extends List{
   
public SortedList (int maxItms)//Instantiates and returns a reference
{
super(maxItms);
}

public SortedList()// No parameter  constructor 
{
 super(100);   
}

public boolean isThere (Listable item) // Using binary search
// Returns true if an element with the same key as item is on this list; 
// otherwise, returns false
{
int compareResult;
int midPoint;
int first = 0;
int last = numOfItems - 1;
boolean moreToSearch = (first <= last);
boolean found = false;
while (moreToSearch && !found) 
{
midPoint = (first + last) / 2;
compareResult = item.compareTo(list[midPoint]);
if (compareResult == 0)
found = true;
else if (compareResult < 0) // item is less than element at location
{
last = midPoint - 1;
moreToSearch = (first <= last);
}
else  // item is greater than element at location
{
first = midPoint + 1;
moreToSearch = (first <= last);
}
}
return found;
}

public Listable retrieve (Listable item)
// Returns a copy of the list element with the same key as item
{
int compareResult;
int first = 0;
int last = numOfItems - 1;
int midPoint = (first + last) / 2;
boolean found = false;
while (!found) 
{
midPoint = (first + last) / 2;
compareResult = item.compareTo(list[midPoint]);
if (compareResult == 0)
found = true;
else if (compareResult < 0) // item is less than element at location
last = midPoint - 1;
else  // item is greater than element at location
first = midPoint + 1;
}
return list[midPoint].copy();
}
public void insert (Listable item)
// Adds a copy of item to this list 
{
int location = 0;
boolean moreToSearch = (location < numOfItems);
while (moreToSearch) 
{
if (item.compareTo(list[location]) < 0) // item is less
moreToSearch = false;
else  // item is more
{
location++;
moreToSearch = (location < numOfItems);
}
}
for (int index = numOfItems; index > location; index--)
list[index] = list[index - 1];
list[location] = item.copy();
numOfItems++;
}
public void delete (Listable item)
// Deletes the element that matches item from this list 
{
int location = 0;
while (item.compareTo(list[location]) != 0)
location++;
for (int index = location + 1; index < numOfItems; index++)
list[index - 1] = list[index];
numOfItems--;
}
    
}
