import java.io.*;
import java.util.*;
class thread implements  Runnable
{
public int ID; public static int m,n,div;
private static int[] indmax;
private static Thread[] threads;

public thread ( int ID )
{
this.ID = ID;
}

public void run()
{
int a[ ] = new int[div] ;  int  max;
Random nu = new Random();
for( int i=0;i<div;i++)
{
    a[i] = nu.nextInt();
}
max = a[0];
for( int i=1;i<div;i++)
    max = ( a[i] > max ) ? a[i] : max ;
indmax[ this.ID - 1 ] = max;
System.out.println("Maximum value for Thread with ID " + this.ID + " is " +  max );
}

public static void main( String [] args)
{
    long starttime = System.currentTimeMillis();

Scanner in = new Scanner(System.in);
System.out.println("Enter n : ");
 n = in.nextInt();
System.out.println("Enter m : ");
 m = in.nextInt();
 div = m/n;
threads = new Thread[n];
indmax = new int[n];
    
for( int i=0; i<n; i++)
    threads[i] = new  Thread (new thread(i+1));
for( int i=0; i<n; i++)
    threads[i].start();

for( int i=0; i<n; i++)
{
    try{ threads[i].join() ;}
catch(Exception e){ System.out.println(e); }
}
int fmax = indmax[0];
for( int i=0; i<n;i++)
    fmax = ( indmax[i] > fmax ) ? indmax[i] : fmax ;

System.out.println("The Global maximum = " + fmax );
long endtime=System.currentTimeMillis();
System.out.println("Overall Time = " +(endtime-starttime)   );




}
}
