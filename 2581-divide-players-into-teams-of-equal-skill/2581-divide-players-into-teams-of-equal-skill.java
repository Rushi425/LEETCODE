import java.util.*;

class Solution {
    public long dividePlayers(int[] skill) {
        int sum = 0;
        for (int i : skill) {
            sum += i;
        }

        int n = skill.length;
        if (sum % (n / 2) != 0) {
            return -1; // can't divide players equally
        }

        int requiredSum = sum / (n / 2);
        long chemistry = 0;

        Arrays.sort(skill); // sort array for optimal pairing

        int left = 0, right = n - 1;
        while (left < right) {
            int currSum = skill[left] + skill[right];
            if (currSum != requiredSum) {
                return -1; // pairing not possible
            }
            chemistry += (long) skill[left] * skill[right];
            left++;
            right--;
        }

        return chemistry;
    }
}
