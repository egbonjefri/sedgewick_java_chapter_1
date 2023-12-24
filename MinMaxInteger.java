
public class MinMaxInteger {
    public static void main(String[] args) {
        System.out.println("Type integers and press enter.. (Ctrl-D to stop):");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

       while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if(value <= 0) {
               System.out.println("Only positive integers may be entered");
               break;
            }
          
           if(value < min) min = value;
           if(value > max) max = value;
        }
        
       
        System.out.println("The minumum value you entered was: " + min + ". And the maximum value you enetered was: " + max);
    }
}