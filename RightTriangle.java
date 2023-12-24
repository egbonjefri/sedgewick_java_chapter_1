// java that takes three int command-line arguments and 
//determines whether they constitute the side lengths of some right triangle

public class RightTriangle {
    public static void main(String[] args){
        int hypotenuse = Integer.parseInt(args[2]);
        int sideA = Integer.parseInt(args[0]);
        int sideB = Integer.parseInt(args[1]);
        if(sideA < 0 || sideB < 0 || hypotenuse < 0) {
            System.out.println("false");
            return;
        }
        if((sideA * sideA) + (sideB * sideB) == (hypotenuse * hypotenuse)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
