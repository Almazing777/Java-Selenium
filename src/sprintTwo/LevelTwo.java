//You need to create a program, which will accept a string and check if total count on characters within the string is even it should return:
// ?"String is even"?If not it should return:?"String is not even"



import java.util.*;

class LevelTwo{
    public static void main(String[] args) {
        System.out.println("Please type your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int count = name.length();
        System.out.println("the string lenght is " + count);

        if (count % 2 == 0) {
            System.out.println("The string is even");
        } else {
            System.out.println("The string is not even");
        }
    }
}