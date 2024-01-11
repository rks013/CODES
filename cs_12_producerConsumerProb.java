public class cs_12_producerConsumerProb {
    
}
class whiteBoard {
    String text;
    noOfStudent = 0;

    public void write(msg){
        text =text+ msg;
    }
    public String read(){
        return text;
    }
    public void attendence(){
        noOfStudent++;
    }

}
//producer class
class teacher extends Thread{
    whiteBoard wb;
    String txt;
    public teacher(String txt, whiteBoard w){wb = w;}
    public void run(){

    }
}
