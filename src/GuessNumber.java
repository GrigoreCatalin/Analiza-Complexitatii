public class GuessNumber {

    public static int checkNumber(int middle) {
       int pickNumber = 6;

        if (pickNumber < middle) {
            return -1;
        } else if (pickNumber > middle) {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 10;

        while (firstNumber <= lastNumber) {
            int middle = firstNumber + (lastNumber - firstNumber) / 2;

            int check = checkNumber(middle);
            if (check == 0) {
                System.out.println(middle);
                return;
            } else if (check == -1) {
                lastNumber = middle - 1;
            } else if (check == 1) {
                firstNumber = middle + 1;
            }
        }
    }
}
