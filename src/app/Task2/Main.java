package app.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[ ]  prices = {1.5, 712.4, 109.7, 177.2, 17.9};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть значення в діапазоні 0-4: ");
            int index = scanner.nextInt();
            if( index < prices.length){
                double price = prices[index];
                System.out.print("Ціна за індексом " + index + ": " + price);
            } else {
                System.out.println("Неправильний індекс. Введіть значення в діапазоні 0-4.");
            }
        }catch ( InputMismatchException e ) {
            System.out.println("Помилка введення. Введіть ціле число в діапазоні 0-4.");
        }

      }
            }

