import java.util.*;

public class LinkedBag<Item> implements Iterable<Item> {

public class Node
{
    public Node nextNode;
    public Item itm;
}

public int sizeOfBag;
public Node initial;

public LinkedBag()
{
    sizeOfBag = 0;
    initial = null;
}

public int size()
{
    return sizeOfBag;
}

public boolean isEmpty()
{
    return initial == null;
}


public void add(Item I)
{
    sizeOfBag++;
    Node previousInitial = initial;
    initial = new Node();
    initial.itm = I;
    initial.nextNode = previousInitial;
}

public class FuncIterator implements Iterator<Item>
{

public Node  present = initial;
public FuncIterator()
{}


public Item next() 
{
    Item tempItem = present.itm;
    present = present.nextNode;
    return tempItem;
}

public boolean hasNext()  
{
    return present != null; 
}


public void remove()   
{
}
}

public Iterator<Item> iterator() 
{
    return new FuncIterator();
}



    public static void main(String[] args) {

LinkedBag<String> nayabag = new LinkedBag<String>();
nayabag.add( "new book"  );
nayabag.add( "copy new"  );
nayabag.add( " new pen"  );
nayabag.add( "mint new"  );
nayabag.add( "book new "  );

System.out.println("The bag has the following size : " + nayabag.size());
System.out.println("The bag has the following things : ");

Iterator itr = nayabag.iterator();
while( itr.hasNext() )
            System.out.println(itr.next());

    }

}
