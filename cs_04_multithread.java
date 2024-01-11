/*  
 * to acheive multithreading -java provide : Thread class & Runnable Interface.
 * use of thread class-> a class extends Thread class
 * use of runnable interface -> a class already extends another class inplements Runnable Interface. 
 */

/* use of Thread class 
 * need to override run() method to acheive multithraeding.
 * there is only one method - run()
 * run() - starting point of a thread.
 *  t.start(); //predefined method of Thread class. - to run the thread.
 */
class multithread extends Thread {
    //need to override run() method to acheive multithraeding.
     public void run(){
        int i = 1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String[] args){

        //oblect of multithread class.
        multithread t = new multithread();
        t.start(); //predefined method of Thread class.

        
        int i =1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
//both while loop run simmultaneously.
}
