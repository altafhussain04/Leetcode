class Solution {

    void solve(String digits, StringBuilder output,
               ArrayList<String> ans, String[] keyword, int index) {

        if (index >= digits.length()) {
            ans.add(output.toString());
            return;
        }

        int value = digits.charAt(index) - '0';

        String validStr = keyword[value];

        for (int i = 0; i < validStr.length(); i++) {

            output.append(validStr.charAt(i));

            solve(digits, output, ans, keyword, index + 1);

            output.deleteCharAt(output.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        ArrayList<String> ans = new ArrayList<>();

        // Empty input check
        if (digits.length() == 0) {
            return ans;
        }

        StringBuilder output = new StringBuilder();

        String[] keyword = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(digits, output, ans, keyword, 0);

        return ans;
    }
}