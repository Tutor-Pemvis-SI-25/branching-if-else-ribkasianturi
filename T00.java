import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan1, bilangan2, hasil;

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
            if (bilangan2 > bilangan1) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            System.out.println("hasil penjumlahan=" + bilangan1 * bilangan2);
        } else {
            if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
                System.out.println("hasil perkalian=" + bilangan1 * bilangan2);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
