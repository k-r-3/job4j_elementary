
public class DigitSum {
    public static int sum(int a, int b) {
        int sum = 0;
        int size = b - a;
        for (int i = 0; i <= size; i++) {
            if (i % 2 == 0) {
                sum += a + i;
                System.out.println(sum);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }
}
