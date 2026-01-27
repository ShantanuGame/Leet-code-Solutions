class Solution {
public:
    int lengthOfLastWord(string s) {
        int i = s.size() - 1;
        int count = 0;

        // Start from end and move backwards
        while (i >= 0) {
            if (s[i] != ' ') {
                count++;
            } else if (count > 0) {
                // we’ve already started counting and hit a space: stop
                break;
            }
            i--;
        }

        return count;
    }
};