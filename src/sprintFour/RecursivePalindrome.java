package sprintFour;

class RecursivePalindrome {
    static boolean isPalindrome(String str) {
        int input = 0, reverse = str.length() - 1;
        while (input < reverse) {
            if (str.charAt(input) != str.charAt(reverse)) return false;
            input++;
            reverse--;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "was it a Cat I sAW";
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if(isPalindrome(str)) System.out.println("yes");
        else System.out.println("no");
    }
}
