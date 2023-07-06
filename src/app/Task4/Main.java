package app.Task4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
         private static final int MIN_TEMPERATURE = -10;
        private static final int MAX_TEMPERATURE = 35;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Введіть значення температури: ");
                int temperature = scanner.nextInt();
                checkTemperature(temperature);
                System.out.println("Пристрій працює за заданою температурою.");
            } catch (InputMismatchException e) {
                System.out.println("Помилка: введено некоректне значення температури.");
            } catch (TemperatureRangeException e) {
                System.out.println("Попередження: пристрій не може працювати за даних температур.");
            }
        }

        private static void checkTemperature(int temperature) throws TemperatureRangeException {
            if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
                throw new TemperatureRangeException();
            }
        }
    }





