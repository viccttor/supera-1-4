package br.com.challangeSupera.challangeOne;

import java.util.*;
import java.util.stream.Collectors;

public class challangeOne {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int quantityEntries = scanner.nextInt();

        for (int i=0; i<quantityEntries; i++) {

            int entries = scanner.nextInt();

            if (entries > 1 && entries < Math.pow(10,5)) {
                numbers.add(entries);
            }else {
                System.out.println("Operação não permitida! Somente números positivos e maiores que 1.");
                System.out.println("Número será desconsiderado!");
            }
        }

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        numbers.stream()
                .filter(n -> n % 2 == 1)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        scanner.close();
    }
}
