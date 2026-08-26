//Brute Force - T.C - 0(n), S.C - 0(n)
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder clean = new StringBuilder();

        // Step 1: Clean the string
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Reverse it
        String reversed = new StringBuilder(clean).reverse().toString();

        // Step 3: Compare
        return clean.toString().equals(reversed);
    }
}

// T.C - 0(n), S.C - 0(1)
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if (l != r) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
