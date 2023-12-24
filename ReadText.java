public class ReadText {
    public static void main(String[] args) {
        System.out.println("Enter words here: ");

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            StdOut.println(s.length());

        }
}
}