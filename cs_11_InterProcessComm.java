/*  INTER PROCESS COMMUNICATION
 * PRODUCER-CONSUMER SOLUTION
 * USE OF WAIT() , NOTIFY() METHOD IS USED.
 * HERE, PRODUCER- producing  values , CONSUMER- reading those values.
 **/


class myData{
    int value;
    boolean flag = true;
    synchronized public void set(int v){
        while(flag !=true){
            try{wait();}catch(Exception e){}
            
        }
        value = v;
        flag = false;
        notify();
    }
    synchronized public int get(){
        while (flag != false ) {
            try{wait();}catch(Exception e){}
        }
        int x=0;
        x=value;
        flag = true;
        notify();
        return x;
    }
}
//producer class
class producer extends Thread{
    myData d;
    producer(myData dt){d= dt;}//constructor.
    //override run() method
    public void run(){
        int count = 0;
        while(true){
            d.set(count);//GO ON producing values
            System.out.println("producer produced "+d.value);
            count++;
        }
    }
}

//consumer class
class consumer extends Thread{
    myData d;
    consumer(myData dt){d= dt;}//constructor.
    //override run() method
    public void run(){
        int readValue = 0;
        while(true){
            readValue = d.get();//GO ON reading values
            System.out.println("consumer consumed "+readValue);//printing the read value.
        }
    }
}


public class cs_11_InterProcessComm {
    public static void main(String[] args) {
        myData obj  = new myData();
       
        //creating objects of producer & consumer class
        
        producer p = new producer(obj);
        consumer c = new consumer(obj);
        //both are a thread so need to start.
        p.start();
        c.start();
    }
}


