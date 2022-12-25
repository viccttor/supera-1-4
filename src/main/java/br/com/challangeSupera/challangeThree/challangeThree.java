package br.com.challangeSupera.challangeThree;

import java.util.Scanner;

public class challangeThree {
    static int qtdTarget = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.nextLine();
        String array = scanner.nextLine();

        pairsToArray(target, stringToArray(size, array));
        System.out.println(qtdTarget);

        scanner.close();
    }


    private static int[] stringToArray(int sizeArray, String string) {

        String temporaryString = string.replace(" ", "");
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = Integer.parseInt(temporaryString.substring(i,i+1));
        }

        return array;
    }

    private static void pairsToArray(int target, int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length; j++) {
                int qtd = array[i+1] - array[j];
                if (qtd == target) {
                    qtdTarget++;
                }
            }
        }
    }

}
