public class cs_10_synchronisationProb {
    public static void main(String[] args) {
            ATM atm = new ATM();//creating only one atm object.
            customer cust1 = new customer("rah", 500, atm);
            customer cust2 = new customer("krk", 300,  atm);
            customer cust3 = new customer("kv", 640,  atm);

            Thread tx = new Thread(cust1);
            Thread ty = new Thread(cust2);
            Thread tz = new Thread(cust3);

            tx.start();
            ty.start();
            tz.start();

    }
}
class ATM{

    synchronized public void checkBalance(String name){
        System.out.println(name+ " is checking account balance");
        try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
    }
    synchronized public void withdraw(String name , int amount){
        System.out.println(name+" wiithdraw "+amount+" rupees");
        try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}

    }
}
class customer extends Thread{

    public void run(){
        atmx.checkBalance(this.getNameOfCustomer());
        atmx.withdraw(this.getNameOfCustomer(), this.getAmmount());
    };

    ATM atmx;
    String name;
    int ammount;
    customer(String name , int ammount, ATM atmx){
        this.name = name;
        this.ammount = ammount;
        this.atmx = atmx;
    }

    public  String getNameOfCustomer(){return this.name;}
    public  int getAmmount(){return this.ammount;}
    
    
  
    

}