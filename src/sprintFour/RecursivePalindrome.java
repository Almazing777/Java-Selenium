package sprintFour;

class RecursivePalindrome {
    static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(str.length() < 2){
            System.out.println("string is a Palindrome");
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length() - 1)){
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        System.out.println("string is not a Palindrome");
        return false;
    }

    public static void main(String[] args){
        isPalindrome("was it a cat i saw");
    }
}
