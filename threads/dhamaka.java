import java.util.*;
import java.io.*;
class dhamaka{
	public static Queue <Integer> queue = new LinkedList<>();
	private static Thread[] threads = new Thread[2];
	synchronized void removecostumer()
	{
		if(queue.size() != 0 )
		{
			queue.remove(); notify();
		}
		else
		{
			try
			{wait();}
			catch(Exception e){System.out.println(e);}
			queue.remove(); notify();
		}
			System.out.println("A costumer is removed");
	}
	synchronized void insertcostumer(int costumer)
	{
		if( queue.size() >= 100 )
		{
			try{ wait(); }
			catch(Exception e){ System.out.println(e); }
		}
		queue.add(costumer); notify();
		System.out.println( "Costumer " + costumer + " is added " );
	}


	public static void main(String[] args){


		dhamaka p1 =new dhamaka();
		threads[0]= new Thread(){  public void run(){p1.insertcostumer(1);}  }; threads[0].start();
		threads[1]= new Thread(){ public void run(){p1.removecostumer();} }; threads[1].start(); 
		threads[0]= new Thread(){  public void run(){p1.insertcostumer(2);}  }; threads[0].start();
		threads[0]= new Thread(){  public void run(){p1.insertcostumer(3);}  }; threads[0].start();
		threads[1]= new Thread(){ public void run(){p1.removecostumer();} }; threads[1].start(); 
		threads[1]= new Thread(){ public void run(){p1.removecostumer();} }; threads[1].start(); 
		threads[1]= new Thread(){ public void run(){p1.removecostumer();} }; threads[1].start(); 
		threads[0]= new Thread(){  public void run(){p1.insertcostumer(4);}  }; threads[0].start();
		threads[0]= new Thread(){  public void run(){p1.insertcostumer(5);}  }; threads[0].start();
		threads[1]= new Thread(){ public void run(){p1.removecostumer();} }; threads[1].start(); 
		threads[0]= new Thread(){  public void run(){p1.insertcostumer(6);}  }; threads[0].start();
		Iterator it=queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
