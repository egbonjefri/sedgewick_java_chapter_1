public class MSD {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Type " + n + " float point numbers, followed by ENTER...(Ctrl-D to stop):");
        double[] array1 = StdIn.readAllDoubles();
         
        double total = 0.0;
        for(int i = 0; i < array1.length; i++){
           total += array1[i];
        }
        double mean = total / array1.length;
        double sd = 0.0;
        for(int i = 0; i < array1.length; i++){
            double diff = (array1[i] - mean)*(array1[i]-mean);
            sd += diff;
            double ssd = Math.sqrt(diff);
            if(ssd>1.5){
                System.out.println("The number: " + array1[i] + " is " + ssd + " standard deviations away from the mean");
            }
        }
        System.out.println("The mean of the numbers entered was : " + mean);
        System.out.println("The Standard Deviation of the numbers entered was : "+ Math.sqrt(sd/(array1.length)));
}
}