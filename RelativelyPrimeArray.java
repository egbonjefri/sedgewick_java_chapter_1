public class RelativelyPrimeArray {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        String[][] a = new String[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < a[i].length; j++){
                  if (gcd(i, j) == 1) {
                  a[i][j]= "* ";
                  } else {
                  a[i][j]= "  ";
                  }
            }
        }
                // Print the table header
          System.out.print("  ");
          for (int j = 0; j < n; j++) {
              System.out.print(j + "  ");
          }
          System.out.println();
          for (int i = 0; i < n; i++) {
          System.out.print(i + " ");
          for (int j = 0; j < n; j++) {
              System.out.print(a[i][j] + " ");
          }
          System.out.println("");
       
          }
        
  
      }
      
          public static int gcd(int a, int b) {
          if (b == 0) {
              return a;
          }
          return gcd(b, a % b);
      }
}
