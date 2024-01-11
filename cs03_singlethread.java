 class singleThread{
    static void display(){
        int i = 1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String[] args){
        display();
        int i =0;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}