package sprintThree;

//Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

public class FizzBuzz {
    public static void main(String[] args){
        for (int count = 1; count <= 100; count++) {
            if(count % 3 == 0){
                System.out.println("Fizz" + " ");
            }
            else if(count % 5 == 0){
                System.out.println("Buzz" + " ");
            }

            else if(count % 3 == 0 && count % 5 == 0){
                System.out.println("FizzBuzz" + " ");
            }

            else System.out.println(count + " ");

        }
    }
}
