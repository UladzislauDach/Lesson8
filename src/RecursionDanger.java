import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionDanger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //   RecursionDanger.getUserInput(scanner, 1, 5);
        //   getUserInputNoRecursion(scanner, 1, 5);
        createArray(scanner);

    }

    public static int getUserInput(Scanner sc, int min, int max) {
        System.out.println("Введите чисдло от " + min + " до " + max);
        int result;
        try {
            result = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            return getUserInput(sc, min, max);
        }
        if (result < min || result > max) {
            System.out.printf("Вы ввели число не от %d до %d \n", min, max);
            return getUserInput(sc, min, max);
        }
        return result;
    }

    public static int getUserInputNoRecursion(Scanner scanner, int min, int max) {
        System.out.println("enter number from " + min + " to " + max);
        int result;
        while (true) {
            try {
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("not a number");
                continue;
            }
            if (result < min || result > max) {
                System.out.println("number not from " + min + " to " + max);
                continue;
            }
            return result;
        }
    }


    private static int[] createArray(Scanner sc) {
        System.out.println("Введитье длинну");
        int length = sc.nextInt();
        int[] array = new int[length];
        if (length == 0 || length > 10) {
            System.out.println("Длинна масчсива должна быть от 0 до 10");
            array = createArray(sc);
        }
        System.out.println("Последний элемент массива = " + array[length - 1]);
        return array;
    }
}
