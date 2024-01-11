
import java.util.*;
public class stackIterator{

     public static void main(String []args){
           System.out.println("Hello, World!");
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 1 ; i<= 5 ; i++){
            
            stack.push(i);
        }
        Iterator<Integer> it = stack.iterator();
        
        //here iterator will start from bottom.
        while(it.hasNext()){
           System.out.print(it.next()+" ");
        }
        System.out.print("==============::::::::::: ");
        Stack<Integer> stack1 = new Stack<Integer>();
        for(int i = 1 ; i<= 5 ; i++){
            
            stack1.push(i);
        }
        Iterator<Integer> it2 = stack1.iterator();
        
        //here iterator will start from top.
        while(it2.hasNext()){
           System.out.print(stack1.pop()+" ");
        }
     }
}