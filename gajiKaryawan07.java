import java.util.Scanner;

public class gajiKaryawan07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamKerja, upahPerjam;
        double persenBonus = 0.1, persenPajak = 0.05;

        jamKerja = sc.nextInt();
        upahPerjam = sc.nextInt();

        double totalGaji = jamKerja*upahPerjam;
        double bonus = persenBonus*totalGaji;
        double pajak = persenPajak*(totalGaji+bonus);
        double gajiBersih = (totalGaji*bonus)-pajak;

        System.out.println("Total gaji = " + totalGaji);
        System.out.println("Bonus = " + bonus);
        System.out.println("Pajak = " + pajak);
        System.out.println("Gaji bersih = " + gajiBersih);

    }
}
