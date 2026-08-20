import java.util.*;
public class Reversearray {
    public static void arrayreverse(int numbers[]){
         int first =0;
         int last = numbers.length-1;
         int temp;

         temp =  numbers[last];
         numbers[last] = numbers[first];
         numbers[first] = temp;
         first++;
         last--;
    }

    public static void main(String args[]){
        System.out.println("enter the array elements:");
        int numbers[] = new int[5];
        Scanner sc = new S canner(System.in);
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
    arrayreverse(numbers);
    System.out.println("reversed array is :");
    for(int i = 0;i<numbers.length;i++){
        System.out.println(numbers[i]);

        System 
    }



    }
}
