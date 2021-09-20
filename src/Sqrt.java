public class Sqrt {
    public static void main(String[] args) {
        long n = 8;
        long x = 8;
        long firstNum = 1;

        while (firstNum <= x) {
            long middle = firstNum + (x - firstNum) / 2;

            if (middle * middle > n) {
                x = middle - 1;
            } else if (middle * middle <= n) {
                firstNum = middle + 1;
            }
        }
        System.out.println(x);
    }
}
