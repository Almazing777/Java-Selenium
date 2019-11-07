package sprintFour;

class RecursiveFizzBuzz {
    private static void evaluate(int a, int b) {

        if(a <= b){
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }

            evaluate(++a, b);
        }
    }
    public static void main(String[] args){
        evaluate(1, 100);
    }
}