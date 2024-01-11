

//Synchronization 
/*Resource sharing , Critical Section(peice of code that is shared), Mutual Exclusion(Accesing shared resources prevent other to access.)
 * technique:
 * 1)Locking / Mutex (integer Variable MUTEX is used.)
 * 2)Semaphore  - wait() , signal() ;
 * 3)Monitor : java uses MONITOR . 
 * 
 * race condition , Inter-thread Communicaton.
 */



//creating a shared resource.
class Mydata{
    //EXAMple : NOT using SYnchronization
    void display(String info){
        for(int i = 0 ; i <info.length() ; i++)
        {System.out.print(info.charAt(i)+" ");}//critical section
    }

    //to acheive SYNCHRONIZATION 
    
     synchronized void displayNew(String info){
        for(int i = 0 ; i <info.length() ; i++)
        {System.out.print(info.charAt(i)+" ");}
    }
}
 
//creating 2 Thread 
class myThreadX extends Thread{

    Mydata obj1 ; //creating instance
    //calling constructor
    myThreadX(Mydata d1){obj1 =d1;}
    //overiding RUN() method
    public void run(){
        obj1.display("HELLOWORld");
    }
}
class myThreadY extends Thread{

    Mydata obj2 ;
    //calling constructor
    myThreadY(Mydata d2){obj2=d2;}
    //overiding RUN() method
    public void run(){
        obj2.display("namaeste");
    }
}






public class cs_09_synchronization {
    public static void main(String[] args) {
        //creating object of shared resouorce
        Mydata d = new Mydata();

        myThreadX t1 = new myThreadX(d);
        myThreadY t2 = new myThreadY(d);

        //starting thread
        t1.start();
        t2.start();
    }
}
