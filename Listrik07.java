import java.util.Scanner;

public class Listrik07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tarif_per_kwh = 1500.0;

        System.out.print("Masukkan jml penggunaan listruk (kwh): ");
        int penggunaan = input.nextInt();

        double tagihan = penggunaan*tarif_per_kwh;

        System.out.println("Total tagihan anda: Rp " + tagihan);

    if (penggunaan > 500) {
        System.out.println("Penggunaan anda melebihi 500 kwh");
    }
    else {
        System.out.println("Penggunaan anda tidak melebihi 500 kwh");
    }

    }
    
}
