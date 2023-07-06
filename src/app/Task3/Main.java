package app.Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 500.00;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть суму покупки: ");
            double cash = scanner.nextDouble();

            if (cash <= 0) {
                throw new IllegalArgumentException("Сума покупки повинна бути більше 0");
            }

            if (cash <= money) {
                double price = money - cash;
                System.out.println("Стан рахунку після покупки складає: " + price);
            } else {
                System.out.println("На Вашому рахунку не достатньо коштів.");
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException("Некоректний формат введеної суми.");

        }
    }
}
