public class Main {
    public static void main(String[] args)
    {
        short ten = 10;
        float a = 8.5f;
        float b = 9.45f;
        boolean number1 = ten - a < ten - b;
        boolean number2 = ten - a > ten - b;
        if (number1) {
            System.out.println(a + " ближе к " + ten);
        } else if (number2) {
            System.out.println(b + " ближе к " + ten);
        } else if (ten - a == ten - b) {
            System.out.println(a + " и " + b + " одинаково близки к " + ten);
        }
    }
}