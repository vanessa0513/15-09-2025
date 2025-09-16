import java.util.Scanner;

public class PerulanganBelanjaan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int counter = 1;
        String namaBarang;
        int hargaBarang;
        int totaBelanjaan = 0;
        String jawab;
        boolean kodisi = true;

        while (kodisi) {
            System.out.print("Masukkan nama barang ke-" + counter + ": ");
            namaBarang = input.next();
            System.out.print("Masukkan harga barang: ");
            hargaBarang = input.nextInt();
            totaBelanjaan += hargaBarang;

            System.out.print("Apakah ingin menambah barang lagi? (ya/tidak): ");
            jawab = input.next();

            if (jawab.equalsIgnoreCase("ya")) {
                counter++;
            } else {
                kodisi = false;
            }
        }

        System.out.println("Total belanjaan: " + totaBelanjaan);
    }
    
}