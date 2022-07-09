package Application;

import Services.PrintService;

import java.util.*;

import static java.util.Locale.*;


public class Program {
    public static void main(String[] args) {
        setDefault(US);
        List<Integer> integers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)){
            PrintService<Double> doublePrintService = new PrintService<>();
            System.out.print("How many values? ");
            int var = scanner.nextInt();
            for(int i = 0; i < var; i++ ){
                var value = scanner.nextDouble();
                doublePrintService.addValue(value);
            }
            doublePrintService.print();
            System.out.println("First -> " + doublePrintService.first());
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}