public class max {
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        int arr[] = {1,2,56,8,9};
        for(int i= 0 ;i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i= 0 ;i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }        
        System.out.println("max: "+max + " min: "+min);
    }
}
