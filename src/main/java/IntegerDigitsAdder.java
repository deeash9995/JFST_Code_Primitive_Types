import java.util.Scanner;

public class IntegerDigitsAdder {

    public static void main(String[] args) {
        int inputNumber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the input number: ");
        inputNumber = scan.nextInt();

        IntegerDigitsAdder adder = new IntegerDigitsAdder();
        System.out.println("The sum of the digits : " + adder.addDigits(inputNumber));
    }

    private int addDigits(int inputNumber) {
        // Write your implementation here
        return 0;
    }

}
