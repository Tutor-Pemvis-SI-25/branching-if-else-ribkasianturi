// 12S25018 - Ribka Sianturi
// 12s25024 - Veybe Youlanda K M Simanjuntak

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, hasil;

        bil1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("bilangan pertama genap");
        } else {
            System.out.println("bilangan pertama ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("bilangan kedua genap");
        } else {
            System.out.println("bilangan kedua ganjil");
        }
        if (bil1 > bil2) {
            System.out.println("bilangan pertama  lebih besar");
        } else {
            if (bil2 > bil1) {
                System.out.println("bilangan kedua lebih besar");
            } else {
                System.out.println("keduanya sama besar");
            }
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            System.out.println("hasil penjumlahan=" + bil1 * bil2);
        } else {
            if (bil1 % 2 != 0 && bil2 % 2 != 0) {
                System.out.println("hasil perkalian=" + bil1 * bil2);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
