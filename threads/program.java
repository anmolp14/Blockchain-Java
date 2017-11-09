import java.util.*;
class q1 extends Thread
{
    public int a;
    public int c;
    public int d;
    public q1( int a1 , int c1 , int d1 )
    {
        a = a1;
        c=c1;
        d=d1;
    }
    public void run()
    {
        int count = 1 ;
        while(true)
        {
try{
            System.out.println( this.a * count );
            count = count + 1 ;
            sleep( d *  c)  ;}
            catch(InterruptedException e) {
			System.out.println(e);
		}

        }
    }

}

class program {
    public static void main(String [] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter a : ");
int a = in.nextInt();
System.out.println("Enter b : ");
int b = in.nextInt();
System.out.println("Enter c : ");
int c = in.nextInt();
		q1 thr1 = new q1( a , c , 1000  );
		q1 thr2 = new q1( b , c ,  1500 );
		thr1.start();
		thr2.start();

 
    }}
