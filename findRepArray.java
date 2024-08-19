import java.util.HashSet;

class UserMainCode {
    public int findRepArray(int[] input1, int input2) {
        HashSet<Integer> seen = new HashSet<>();
        boolean allNegative = true;
        int lastElement = input1[input2 - 1];

        for (int i = input2 - 1; i >= 0; i--) {
            int num = input1[i];
            if (num > 0) {
                allNegative = false;
            }
            if (num > 0 && seen.contains(num)) {
                return num;
            }
            if (num > 0) {
                seen.add(num);
            }
        }

        if (allNegative) {
            return 0;
        }

        return lastElement;
    }
}
