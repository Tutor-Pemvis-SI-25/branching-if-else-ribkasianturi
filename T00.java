// 12S25018 - Ribka Sianturi

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan1, bilangan2, tambah, kali;

        bilangan1 = Integer.parseInt(input.nextLine());
        bilangan2 = Integer.parseInt(input.nextLine());
        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (bilangan2 % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (bilangan1 > bilangan2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (bilangan1 < bilangan2) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (bilangan1 % 2 == 0) {
            if (bilangan2 % 2 == 0) {
                tambah = bilangan1 + bilangan2;
                System.out.println("hasil penjumlahan: " + tambah);
            } else {
                System.out.println("Berbeda jenis");
            }
        } else {
            if (bilangan2 % 2 != 0) {
                kali = bilangan1 * bilangan2;
                System.out.println("hasil perkalian:" + kali);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
