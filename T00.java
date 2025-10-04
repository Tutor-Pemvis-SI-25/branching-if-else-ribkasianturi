// 12S25018 - Ribka Sianturi
// 12s25024 - Veybe Youlanda K M Simanjuntak

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan1, bilangan2, hasil;

        bilangan1 = Integer.parseInt(input.nextLine());
        bilangan2 = Integer.parseInt(input.nextLine());
        if (bilangan1 % 2 == 0) {
            System.out.println("bilangan pertama genap");
        } else {
            System.out.println("bilangan pertama ganjil");
        }
        if (bilangan2 % 2 == 0) {
            System.out.println("bilangan kedua genap");
        } else {
            System.out.println("bilangan kedua ganjil");
        }
        if (bilangan1 > bilangan2) {
            System.out.println("bilangan pertama  lebih besar");
        } else {
            if (bilangan2 > bilangan1) {
                System.out.println("bilangan kedua lebih besar");
            } else {
                System.out.println("keduanya sama besar");
            }
        }
        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            System.out.println("hasil penjumlahan=" + bilangan1 * bilangan2);
        } else {
            if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
                System.out.println("hasil perkalian=" + bilangan1 * bilangan2);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
