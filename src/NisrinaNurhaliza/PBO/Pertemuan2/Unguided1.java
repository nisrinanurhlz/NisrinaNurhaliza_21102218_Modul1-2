package NisrinaNurhaliza.PBO.Pertemuan2;

import java.util.Arrays;
import java.util.Scanner;

public class Unguided1 {
    public static void main(String[] args) {

        System.out.println("Nama : Nisrina Nurhaliza");
        System.out.println("NIM  : 21102218");

        Scanner input = new Scanner (System.in);

        System.out.println("=================================");
        System.out.println("PROGRAM MENENTUKAN BILANGAN GENAP");
        System.out.println("=================================");

        System.out.print("Masukkan Batas Bilangan : ");
        int bilangan = input.nextInt();

        for (int i = 1; i <=bilangan; i++) {
            if (i%2==0) {
                System.out.println("Bilangan Genap : " +i);
            }
            input.close();
        }
    }
}




