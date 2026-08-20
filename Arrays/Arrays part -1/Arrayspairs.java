public class Arrayspairs {
    public static void pairsinarrays(int numbers[]){
             for(int i = 0 ; i < numbers.length;i++){
                int current = numbers[i];
                 for(int j = i + 1;j<numbers.length;j++){
                    System.out.println("(" + current + "," + numbers[j] + ")");
                 }
             }
    }
    public static void main(String args[]){
        int numbers[] = {
}