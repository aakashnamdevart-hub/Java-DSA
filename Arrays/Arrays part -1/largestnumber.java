    public class largestnumber{
    public static int findlarge(int numbers[]){
           int largest = Integer.MIN_VALUE;
           int smallest = Integer.MAX_VALUE;
           for(int i = 0; i<numbers.length;i++){
                 if(largest<numbers[i]){
                    largest =numbers[i];
                 }
                 if(smallest>numbers[i]){
                    smallest = numbers[i];
                 }
           }
           System.out.println("largest is:"+largest); 
           System.out.println("smallest is:"+smallest); 
           return largest;
    }
    public static void main(String args[]){
        int numbers[] = { 1,23,10,50,3,56,};
        findlarge(numbers);
        

    }
}
