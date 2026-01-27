class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";

        // Start with first string as prefix
        string prefix = strs[0];

        // Compare with each string
        for (int i = 1; i < strs.size(); i++) {
            while (strs[i].find(prefix) != 0) {
                // chop off last char from prefix
                prefix = prefix.substr(0, prefix.size() - 1);
                if (prefix.empty()) return "";
            }
        }

        return prefix;
    }
};