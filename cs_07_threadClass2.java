 class threadClass2 {
    public static void main(String[] args) {
        Thread t = new Thread(new mythreadDemo(), "treadDell");
        t.start();

    }
}
class mythreadDemo implements Runnable{
    public void run(){System.out.println("thread s ruuning");

    /*for sleep() method */
    int i = 1;
    while(true){
        
        System.out.println(i++);
      
        try{
            //sleep() method will sleep thread for certain millisecond.
            Thread.sleep(500);// throws EXception
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        
    }
}
}