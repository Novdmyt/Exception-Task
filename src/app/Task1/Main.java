package app.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");

        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.print("Введене число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Неправильний формат числа! Введіть ціле число. ");
        }

        scanner.close();
    }

}
