import java.util.*;
public class linersearch {

    public static int findkey(int numbers[],int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
            int numbers[] = {12,3,45,10,20,78};
            int key = sc.nextInt();
            int index = findkey(numbers,key);
            if(index==-1){
                System.out.println("Element not found in the given array");
            }
            else{
                System.out.println("given element is found at index:" + index);
            }
        }
    }
}
