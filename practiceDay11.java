import java.util.Arrays;

public class practiceDay11 {

    /*
     * public static void main(String[] args) {
     * String str = "abhsKKtsbIoboshoie";
     * 
     * int count = 0;
     * for (int i = 0; i < str.length(); i++) {
     * 
     * if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
     * str.charAt(i) == 'o'
     * || str.charAt(i) == 'u') {
     * count++;
     * }
     * }
     * 
     * System.out.println(count);
     * }
     * 
     * 
     */

    // Detrmine if 2 strings are Anagrams of each other or not

    public static void main(String[] args) {
        String str1 = "Earth";
        String str2 = "Heart";

        // convert the whole string into lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check the length of the strings

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the character of the string
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are Anagrams of each other !");
            } else {
                System.out.println(str1 + " and " + str2 + " are not the Anagrams of each other !");
            }
        }
        // for length are not equal case
        else {
            System.out.println(str1 + " and " + str2 + " are not the Anagrams of each other !");
        }
    }

}