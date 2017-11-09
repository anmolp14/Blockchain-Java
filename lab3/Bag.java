import java.util.*;

public class Bag<Item> implements Iterable<Item> {

public static class Node<Item> 
{
    public Node<Item> nextNode;
    public Item itm;
}

public int sizeOfBag;
public Node<Item> initial;

public Bag()
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
    Node<Item> previousInitial = initial;
    initial = new Node<Item>();
    initial.itm = I;
    initial.nextNode = previousInitial;
}

public class FuncIterator<Item> implements Iterator<Item>
{

public Node<Item> present;

public FuncIterator( Node<Item> initial  )
{
present = initial;
}

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
    return new FuncIterator<Item>( initial  );
}



    public static void main(String[] args) {

Bag<String> nayabag = new Bag<String>();
nayabag.add( "book"  );
nayabag.add( "copy"  );
nayabag.add( "pen"  );
nayabag.add( "mint"  );
nayabag.add( "book"  );

System.out.println("The bag has the following size : " + nayabag.size());
System.out.println("The bag has the following things : ");

Iterator itr = nayabag.iterator();
while( itr.hasNext() )
            System.out.println(itr.next());

    }

}
