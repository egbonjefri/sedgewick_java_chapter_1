import java.util.Random;


public class MusicShuffle {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int[] array = new int[M];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < M; i++) {
                array[i] = i;
            }
                  // Shuffle the array
            for (int i = 0; i < M; i++) {
                int r = i + random.nextInt(M - i); // random index from i to M-1
                int temp = array[i];
                array[i] = array[r];
                array[r] = temp;
                
            }
            for(int i = 0; i < array.length-1; i++){
                if(array[i]+1 == array[i+1]){
                    count++;
                }
            }
        System.out.println(" ");
        double probability = (1.0-((double) count/(double) M))*100.0;
        System.out.println("The probability of not finding a sequential number is : "+((int) probability)+"%");
    }
}
