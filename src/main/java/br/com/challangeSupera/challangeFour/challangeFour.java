package br.com.challangeSupera.challangeFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class challangeFour {
    private static final List<String> encryptedlist = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdTests = scanner.nextInt();

        while (qtdTests >= 0) {
            String encryptedText = scanner.nextLine();
            encryptedlist.add(encryptedText);
            qtdTests--;
        }

        decrypt();

        scanner.close();
    }

    private static void decrypt() {

        for (String list: encryptedlist  ) {
            StringBuilder textOne = new StringBuilder( list.substring(0, list.length()/2));
            StringBuilder textTwo = new StringBuilder( list.substring(list.length()/2));
            textOne.reverse();
            textTwo.reverse();
            String result = textOne + textTwo.toString();
            System.out.println(result.toUpperCase());
        }
    }
}
