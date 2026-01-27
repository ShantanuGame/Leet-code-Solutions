class Solution {
public:
    bool isValid(string s) {
        // Array as stack for speed
        char stackArr[10005];  // s.length() <= 10^4 per constraints
        int top = -1;

        for (char c : s) {
            // Opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stackArr[++top] = c;
            } else {
                // If no opening to match, invalid
                if (top == -1) return false;
                char t = stackArr[top--];
                // Match pairs
                if ((c == ')' && t != '(') ||
                    (c == '}' && t != '{') ||
                    (c == ']' && t != '[')) {
                    return false;
                }
            }
        }

        return (top == -1);
    }
};