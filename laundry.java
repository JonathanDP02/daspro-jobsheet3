import java.util.Scanner;

public class laundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beratLaundry;

        System.out.print("Berat Laundry:  ");
        beratLaundry = sc.nextInt();

        double jumlahBiaya = beratLaundry*2000;

        System.out.println("Jumlah biaya yang harus dibayarkan; Rp" + jumlahBiaya);
        


    }
    
}
