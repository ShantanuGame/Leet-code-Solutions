class Solution {
public:
    int romanToInt(string s) {
        int values[26] = {};  // for 'A'..'Z'
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        for (int i = 0; i < s.size(); i++) {
            int curr = values[s[i] - 'A'];
            int next = (i + 1 < s.size()) ? values[s[i+1] - 'A'] : 0;
            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }
};