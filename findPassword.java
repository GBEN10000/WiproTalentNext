import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

    public int findPassword(int[] input1) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequencyMap
        for (int num : input1) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        int firstMax = -1, secondMax = -1;
        int firstMaxFreq = 0, secondMaxFreq = 0;

        // Find the first and second maximum frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > firstMaxFreq || (freq == firstMaxFreq && num > firstMax)) {
                secondMax = firstMax;
                secondMaxFreq = firstMaxFreq;
                firstMax = num;
                firstMaxFreq = freq;
            } else if (freq > secondMaxFreq) {
                secondMax = num;
                secondMaxFreq = freq;
            }
        }

        return Integer.parseInt("" + firstMax + (secondMax != -1 ? secondMax : ""));
    }

    public static void main(String[] args) {
        UserMainCode code = new UserMainCode();
        int[] input1 = {1, 2, 3, 1, 2, 2, 3, 3, 3};
        System.out.println(code.findPassword(input1)); // Example usage
    }
}
