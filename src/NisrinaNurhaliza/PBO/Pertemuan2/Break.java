package NisrinaNurhaliza.PBO.Pertemuan2;

import java.util.Arrays;

public class Break {

    public static void main(String[] args) {
        int p = 0;
        while (p <= 100) {
            System.out.println("Perulangan ke-" + p);
            if (p == 50) {
                System.out.println("Semangat Nisrina !");
                break;
            }
            p += 10;
        }
    }
}
