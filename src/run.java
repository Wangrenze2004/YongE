public class run implements Runnable {

    
    @Override
    public void run() {


        String s;
        int r=0;
        while (true) {
           
            r = ++r;
            s = Integer.toString(r);

            Thread t= new Thread(this, s);
            t.start();
            System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        }
    }


}