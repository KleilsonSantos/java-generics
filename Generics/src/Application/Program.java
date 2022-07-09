package Application;

import Services.PrintService;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        PrintService printService = new PrintService();

        System.out.print("How many values? ");
        try {
            var value = scanner.nextInt();
            for (int i = 0; i < value; i++) printService.addValue(scanner.nextInt());
            printService.print();
            System.out.println("First -> " + printService.first());
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}