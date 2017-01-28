package lesson1;

public class Calc {
    int firstNumber;
    int secondNumber;
    int sum;


    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
        System.out.println("Your input " + firstNumber + " as a first number.");
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
        System.out.println("Your input " + secondNumber + " as a second number.");

    }

    public void result() {
        sum = firstNumber + secondNumber;
        System.out.println("Sum is = " + sum);

        sum = firstNumber - secondNumber;
        System.out.println("Difference is = " + sum);

        sum = firstNumber * secondNumber;
        System.out.println("Multiplication is = " + sum);

        sum = firstNumber / secondNumber;
        System.out.println("Division is = " + sum);
    }
}
