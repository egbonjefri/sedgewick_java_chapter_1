public class EulerSumOfPowers {
        public static void main(String[] args) {
            int maxLimit = 200; // Set a limit for searching positive integers
    
            for (int a = 1; a <= maxLimit; a++) {
                for (int b = a; b <= maxLimit; b++) {
                    for (int c = b; c <= maxLimit; c++) {
                        for (int d = c; d <= maxLimit; d++) {
                            int sumOfFifthPowers = a * a * a * a * a + b * b * b * b * b + c * c * c * c * c + d * d * d * d * d;
    
                            int e = (int) Math.pow(sumOfFifthPowers, 1.0 / 5); // Calculate the fifth root
    
                            if (e <= maxLimit && a * a * a * a * a + b * b * b * b * b + c * c * c * c * c + d * d * d * d * d == e * e * e * e * e) {
                                System.out.println("Counterexample found:");
                                System.out.println("a = " + a);
                                System.out.println("b = " + b);
                                System.out.println("c = " + c);
                                System.out.println("d = " + d);
                                System.out.println("e = " + e);
                                return; // Exit the program after finding the counterexample
                            }
                        }
                    }
                }
            }
    
            System.out.println("No counterexample found within the specified limit.");
        }

    
}
