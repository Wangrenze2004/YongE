import java.util.*;
public class Main  {
	
	public static void main(String[] args) {
	 run run = new run();
        String s;
        int  r = 1;
		while(true)
		{
          
          r=++r;
         s= Integer.toString(r);
          
            Thread t= new Thread(run,s);
            t.start();
            System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            
					}
	}
}