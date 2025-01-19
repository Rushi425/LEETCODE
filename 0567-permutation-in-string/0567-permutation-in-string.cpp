class Solution {
public:
    bool isFrequencySame(int f1[26], int f2[26]) {
        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i]) return false;
        }
        return true;
    }

    bool checkInclusion(string s1, string s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int frequencyOfS1[26] = {0};
        int windowFrequency[26] = {0};

        // Calculate the frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            int ascii = s1[i] - 'a';
            frequencyOfS1[ascii]++;
        }

        int windowSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            // Add the current character to the window frequency
            windowFrequency[s2[i] - 'a']++;

            // Remove the character that is sliding out of the window
            if (i >= windowSize) {
                windowFrequency[s2[i - windowSize] - 'a']--;
            }

            // Compare frequencies only when the window size matches s1
            if (i >= windowSize - 1 && isFrequencySame(frequencyOfS1, windowFrequency)) {
                return true;
            }
        }

        return false;
    }
};
