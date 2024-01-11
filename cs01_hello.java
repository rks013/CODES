 import java.util.Scanner;

import java.util.*;
 
 
 
 
 class hello{
   public static void utility(int d, int n){
    //write your code here
    
    int roundOff = n%7;
    
    int dayBefore = d-roundOff;
    if(dayBefore < 0){
        System.out.println(dayBefore+7);
    }
    else  
       { System.out.println(dayBefore);
       }
      } 
    public static void main(String args[]){

         System.out.println("hello");
         utility(2,19);
         
    }

   
 }