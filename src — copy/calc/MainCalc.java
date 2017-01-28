package lesson1;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();

        System.out.print("Please input first number >>> ");
        calc.setFirstNumber(scanner.nextInt());

        System.out.print("Please input second number >>> ");
        calc.setSecondNumber(scanner.nextInt());

        calc.result();

    }
}
