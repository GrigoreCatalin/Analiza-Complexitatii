public class ValidPerfectSquare {

    public static boolean isPerfectSquareV1(int num) {
        for (int i = 0; i <= num; i++) {
            long aux = i * i;
            if (aux == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectSquareV2(int num) {
        int left = 0;
        int right = num;

        while (left <= right) {
            int mijloc = left + (right - left) / 2;
            long aux = mijloc * mijloc;
            if (aux == num) {
                return true;
            } else if (aux > num) {
                right = mijloc - 1;
            } else {
                left = mijloc + 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquareV2(num));
        System.out.println(isPerfectSquareV1(num));
    }
}
