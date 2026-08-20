import java.util.Scanner;

public class arrays{

    public static void updatemarks(int akash[]){
        akash[4] = akash[4] + 3;
    }

    public static int binarySearch(int[] numbers, int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int akash[] = new int[5];

        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0 ; i<akash.length;i++){
                akash[i] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<akash.length;i++){
            System.out.println(akash[i]);
        }

        updatemarks(akash);
        System.out.println("after updating marks[4]:" + akash[4]);

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int result = binarySearch(numbers, key);
        System.out.println("binary search result: " + result);
    }
}

