public class ClassUserMan {
    public int findPIN(int input1, int input2, int input3, int input4) {
        int[] numbers = {input1, input2, input3};
        int sumEvenPositions = 0;
        int sumOddPositions = 0;

        for (int number : numbers) {
            String numStr = String.valueOf(number);
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                if ((i + 1) % 2 == 0) {
                    sumEvenPositions += digit;
                } else {
                    sumOddPositions += digit;
                }
            }
        }

        int pin;
        if (input4 % 2 == 0) {
            pin = sumEvenPositions - sumOddPositions;
        } else {
            pin = sumOddPositions - sumEvenPositions;
        }

        return pin;
    }

    public static void main(String[] args) {
        ClassUserMan userMan = new ClassUserMan();
        int pin = userMan.findPIN(1234, 5678, 9101, 4);
        System.out.println("The calculated PIN is: " + pin);
    }
