//constructors of thread class.

class myThread implements Runnable{
    public void run(){System.out.println("thread s ruuning");};
}


class threadCLass {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new myThread(),   "ThreadName");//passing the reference and name in Thread class constructor.
        //some of the method of the Thread class
        System.out.println("name- "+t.getName());
        System.out.println("ID- "+t.threadId());
        System.out.println("Priority- "+t.getPriority());
        System.out.println("State- "+t.getState());
        System.out.println("Alive- "+t.isAlive());

        //let start the thread by Start() method
        t.start();
        System.out.println("After start method ,thread State- "+t.getState());
        
        //Setting priority by Programer- 
        t.setPriority(Thread.MIN_PRIORITY);
         System.out.println("Priority- "+t.getPriority());
    }
}
