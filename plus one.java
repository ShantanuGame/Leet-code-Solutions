class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();

        // Traverse from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // simply increment
                return digits;
            }
            digits[i] = 0;  // set 9 to 0 and carry will go to next
        }

        // If all digits were 9 (e.g. 999), result will be 1000
        digits.insert(digits.begin(), 1);
        return digits;
    }
};