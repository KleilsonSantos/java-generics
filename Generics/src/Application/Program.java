package Application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.print("How many values? ");
        try {
            int value = scanner.nextInt();
            for (int i = 0; i < value; i++) {
                integerList.add(scanner.nextInt());
            }
            System.out.print("[ " + integerList.get(0));
            for (int y = 1; y < integerList.size(); y++) {
                System.out.print(", " + integerList.get(y));
            }
            System.out.println(" ]");
            System.out.println("First -> " + integerList.get(0));
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}