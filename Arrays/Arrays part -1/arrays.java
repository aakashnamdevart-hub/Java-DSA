import java.util.Scanner;

public class arrays{

    public static void updatemarks(int akash[]){
        
    akash[4] = akash[4] + 3;
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
    System.out.println("after updating marks[4]:"+ akash[4]);
    

    }
}





