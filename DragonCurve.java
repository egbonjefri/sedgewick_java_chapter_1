public class DragonCurve {
    public static void main(String[] args) {
        int maxOrder = 5;

        for (int order = 0; order <= maxOrder; order++) {
            System.out.println("Dragon Curve of Order " + order + " Instructions:");
            dragonCurveInstructions(order);
            System.out.println();
        }
    }

    private static void dragonCurveInstructions(int order) {
        if (order == 0) {
            System.out.println("F");
            return;
        }

        dragonCurveInstructions(order - 1);

        System.out.print("L");
        dragonCurveInstructionsReverse(order - 1);
        System.out.print("F");
    }

    private static void dragonCurveInstructionsReverse(int order) {
        if (order == 0) {
            return;
        }

        System.out.print("F");
        dragonCurveInstructions(order - 1);
        System.out.print("R");
        dragonCurveInstructionsReverse(order - 1);
    }
}
