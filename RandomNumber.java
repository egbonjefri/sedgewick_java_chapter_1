public class RandomNumber {
    public static void main(String[] args){
        double a = Math.random() * 1;
        double b = Math.random() * 1;
        double c = Math.random() * 1;
        double d = Math.random() * 1;
        double e = Math.random() * 1;
        double min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        double max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
        double average = ((a+b+c+d+e)/5);

        System.out.println("The numbers are: " + a + " "+ b + " "+ c + " "+ d + " "+ e + " ");
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);



    }
    
}
