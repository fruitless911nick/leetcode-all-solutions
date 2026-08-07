class Solution {
    String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                      "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                      "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        String result = "";
        int i = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                String chunk = helper(num % 1000);
                result = chunk + thousands[i] + " " + result;
            }
            num /= 1000;
            i++;
        }

        return result.trim();
    }

    private String helper(int num) {
        String result = "";
        if (num >= 100) {
            result += ones[num / 100] + " Hundred ";
            num %= 100;
        }
        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }
        if (num > 0) {
            result += ones[num] + " ";
        }
        return result;
    }
}