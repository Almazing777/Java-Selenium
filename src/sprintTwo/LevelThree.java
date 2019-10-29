//A palindrome is a word, phrase, number or sequence of words that reads the same backwards as forwards. Punctuation and spaces between the words or lettering is allowed.
//        YOU CAN'T USE BUILD IN REVERSE METHOD
//        Examples:
//        Racecar?dad?Was it a cat I saw

//        Create a method which will check if given string is palindrome. If it is it should print "This string is palindrome" if not print "This string is not palindrome"
//        Upload it to gitlab and share a link in gitlab with your exercise

package sprintTwo;
import java.util.*;

public class LevelThree{
    public static void main(String[] args){

        String input, reverse = ""; //initiate blank strings for 1st input and reversed version

        System.out.println("Please type your first input");

        Scanner scanner = new Scanner(System.in); //initiate input stream
        input = scanner.nextLine(); //save the input
        input = input.replaceAll("[^a-zA-Z]+", "").toLowerCase(); //clean up the string

        for (int x = input.length()-1; x >= 0; x--) {  //this forloop iterates through each index of the input length. Forloop will keep running from last index to first, printing each character
            reverse += input.charAt(x); //charAt method returns the character at specified index, meaning from last to first
            System.out.println(reverse); //checking results
        }

        if(input.equals(reverse)) System.out.println("Input is palindrome");  //.equals method will compare both strings to see if it is palindrome
        else System.out.println("Input is not a palindrome");

    }
}