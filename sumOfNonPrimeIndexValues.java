public class UserMainCode {
    public int sumOfNonPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;

        for (int i = 0; i < input2; i++) {
            if (!isPrime(i)) {
                sum += input1[i];
            }
        }

        return sum;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        UserMainCode userMainCode = new UserMainCode();
        int[] array = {3, 5, 8, 10, 15, 18};
        int result = userMainCode.sumOfNonPrimeIndexValues(array, array.length);
        System.out.println("Sum of non-prime index values: " + result);
    }
}
