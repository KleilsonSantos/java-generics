package Application;

import Services.PrintService;

import java.util.*;

import static java.util.Locale.*;


public class Program {
    public static void main(String[] args) {
        setDefault(US);
        List<Integer> integers = Arrays.asList(10,8,23);
        try (Scanner scanner = new Scanner(System.in)) {
            PrintService<Integer> printService = new PrintService<>();
            for (Integer integer: integers) printService.addValue(integer);
            printService.print();
            System.out.println("First -> " + printService.first());
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}