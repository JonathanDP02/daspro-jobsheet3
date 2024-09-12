import java.util.Scanner;

public class Kafe07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    boolean keanggotaan;
    int jmKopi, jmTeh, jmRoti;
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
    float diskon = 10 / 100f;

    System.out.print("Masukkan keanggotaan (true/false): ");
    keanggotaan = input.nextBoolean();
    System.out.print("Masukkan jumlah pembelian kopi: ");
    jmKopi = input.nextInt();
    System.out.print("Masukkan jumlah pembelian teh: ");
    jmTeh = input.nextInt();
    System.out.print("Masukkan jumlah pembelian roti: ");
    jmRoti = input.nextInt();

    double totalHarga = (jmKopi*hargaKopi) + (jmTeh*hargaTeh) + (jmRoti*hargaRoti);
    double nominalBayar = totalHarga - (diskon*totalHarga);

    System.out.println("Keanggotaab pelanggan " + keanggotaan);
    System.out.println("Item pembelian " + jmKopi + " kopi, " + jmTeh + " teh, " + jmRoti + " roti");
    System.out.println("Nominal bayar Rp " + nominalBayar);


        
    }
}
