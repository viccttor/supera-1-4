package br.com.challangeSupera.challangeTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class challangeTwo {
   private static final double[] cash = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
   private static final double[] coin = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
   private static final double[] numCash = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   private static final double[] numCoin = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        if (value >= 0 && value <= Math.pow(10,5)){

            calcCash(value);
            message("nota",numCash ,cash);
            message("moeda", numCoin, coin);

        } else {
            System.out.println("Valor Inválido!");
        }

        scanner.close();
    }



    private static void calcCash(double value) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        while (value != 0) {
            while (value > 1) {
                if (value >= cash[0]){
                    numCash[0] = Math.floor(value / cash[0]);
                    value = Double.parseDouble(df.format(value % cash[0]));
                }
                else if (value >= cash[1]) {
                    numCash[1] = Math.floor(value / cash[1]);
                    value = Double.parseDouble(df.format(value % cash[1]));
                }
                else if (value >= cash[2]) {
                    numCash[2] = Math.floor(value / cash[2]);
                    value = Double.parseDouble(df.format(value % cash[2]));
                }
                else if (value >= cash[3]) {
                    numCash[3] = Math.floor(value / cash[3]);
                    value = Double.parseDouble(df.format(value % cash[3]));
                }
                else if (value >= cash[4]) {
                    numCash[4] = Math.floor(value / cash[4]);
                    value = Double.parseDouble(df.format(value % cash[4]));
                }
                else if (value >= cash[5]) {
                    numCash[5] = value / cash[5];
                    value = Double.parseDouble(df.format(value % cash[5]));
                }
                else if (value < 2) {
                    break;
                }

            }

            if (value >= coin[0]){
                numCoin[0] = Math.floor(value / coin[0]);
                value = Double.parseDouble(df.format(value % coin[0]));
            }
            else if (value >= coin[1]) {
                numCoin[1] = Math.floor(value / coin[1]);
                value = Double.parseDouble(df.format(value % coin[1]));
            }
            else if (value >= coin[2]) {
                numCoin[2] = Math.floor(value / coin[2]);
                value = Double.parseDouble(df.format(value % coin[2]));
            }
            else if (value >= coin[3]) {
                numCoin[3] = Math.floor(value / coin[3]);
                value = Double.parseDouble(df.format(value % coin[3]));
            }
            else if (value >= coin[4]) {
                numCoin[4] = Math.floor(value / coin[4]);
                value = Double.parseDouble(df.format(value % coin[4]));
            }
            else if (value >= coin[5]) {
                numCoin[5] = Math.floor(value / coin[5]);
                value = 0;
            }
        }
    }

    private static void message(String typeCash, double[] qtd, double[] cash) {
        System.out.println(typeCash.toUpperCase());
        for (int i = 0; i < cash.length; i++) {
            System.out.println(String.format("%.0f     %s[s]    de    R$    %.2f",qtd[i],typeCash,cash[i]));
        }
    }

}
