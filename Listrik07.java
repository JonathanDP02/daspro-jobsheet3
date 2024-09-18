import java.util.Scanner;

public class Listrik07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlListrik, tarif, batas = 500;
        boolean statusTagihan;

        System.out.print("Penggunaan listrik (dalam kwh) = ");
        jmlListrik = sc.nextInt();

        tarif = jmlListrik*1500;
        statusTagihan = jmlListrik > batas;

        System.err.println("Jumlah tagihan: Rp" + tarif );
        System.out.println("Status tagihan melibihi batas 500 kwh: " + statusTagihan);
        System.out.println("Jumlah tagihan : Rp" + tarif);

    }
    
}
