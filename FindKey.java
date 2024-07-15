class User  {
    public int findKey(int inp1, int inp2, int inp3) {
        int thousandDigit = (inp1 / 1000) % 10;
        int hundredDigit = (inp2 / 100) % 10;
        int largestDigit = findLargestDigit(inp3);
        int key = (thousandDigit * hundredDigit) - largestDigit;
        return key;
    }

    public int findLargestDigit(int number) {
        int largest = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            number /= 10;
        }
        return largest;
    }
}
