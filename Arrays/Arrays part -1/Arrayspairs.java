public class Arrayspairs {
    
    public static void pair(int numbers[]){
        for(int i = 0;i <numbers.length;i++){
            int current = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                System.out.println("(" + current + "," + numbers[j] + ")");
                        }

        }
    }
    public static void main(String args[]){
    int numbers[] = {2,3,4,5,6};
    pair(numbers);
    }
}
