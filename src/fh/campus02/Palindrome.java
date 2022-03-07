package fh.campus02;

public class Palindrome {
    public static void main(String[] args) {
//        Was it a car or a cat I saw
//        Murder for a jar of red rum
//        Go hang a salami, I'm a lasagna hog
//        Otto
//        1122332211
        System.out.println(isPalindrome("anna"));
    }

    public static boolean isPalindrome(String potentialPalindrome) {
        potentialPalindrome = potentialPalindrome.toString();
        potentialPalindrome = potentialPalindrome.replace(",", "");
        potentialPalindrome = potentialPalindrome.replace("'", "");
        potentialPalindrome = potentialPalindrome.replace(" ", "");
        char firstLetter = potentialPalindrome.charAt(0);
        char lastLetter = potentialPalindrome.charAt(potentialPalindrome.length() - 1);
        if (firstLetter == lastLetter) {
            potentialPalindrome = potentialPalindrome.substring(1, potentialPalindrome.length() - 1);
            if (potentialPalindrome.length() <= 1) {
                return true;
            }
            return isPalindrome(potentialPalindrome);
        }
        return false;
    }
}
