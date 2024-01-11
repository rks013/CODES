
//use of runnable interface  to acheive multithraeding.
 //creating instance of thead class, and attaching the object of multithreading2 class that implement runnable.
 //if thread runs - then object will also run.
 //only one method i.e run() method is present in Runnable() interface.
 
 class multithreading2 implements Runnable{
    //need to override run() method of Runnable interface to acheive multithraeding.
     public void run(){  
        int i = 1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }

     public static void main(String[] args){

        //object of multithread2 class.
        multithreading2 mt = new multithreading2();

        Thread t = new Thread(mt);//creating instance of thead class, and attaching the object of multithreading2
        t.start(); //predefined method of Thread class.

        
        int i =1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
//both while loop run simmultaneously.
    
}
