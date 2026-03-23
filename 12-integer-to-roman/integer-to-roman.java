// class Solution {
//     public String intToRoman(int num) {
//         int[] values = {
//             1000, 900, 500, 400,
//             100, 90, 50, 40,
//             10, 9, 5, 4, 1
//         };
//         String[] symbols = {
//             "M", "CM", "D", "CD",
//             "C", "XC", "L", "XL",
//             "X", "IX", "V", "IV", "I"
//         };
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < values.length; i++) {
//             while (num >= values[i]) {
//                 result.append(symbols[i]);
//                 num -= values[i];
//             }
//         }
//         return result.toString();
//     }
// }
class Solution {
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] +
               hundreds[(num % 1000) / 100] +
               tens[(num % 100) / 10] +
               ones[num % 10];
    }
}