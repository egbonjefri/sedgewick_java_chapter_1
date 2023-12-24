public class PowersOfK {
    public static void main(String[] args) {
        long k = Long.parseLong(args[0]);
        long power = 1;
        while (power > 0) {
            System.out.println(power);
            power = multiplyExact(power, k);
        }
    }

    public static long multiplyExact(long x, long y) {
        long r = x * y;
        /*
         * The ^ operator in the condition checks if the sign bit of the result
         *  is different from the sign bits of the operands, which indicates an overflow 12.
         */
        if (((x ^ r) & (y ^ r)) < 0) {
            throw new ArithmeticException("long overflow");
        }
        return r;
    }
}