import java.util.Scanner;

public class Persegi extends Main{
    public void Persegi () {
        double luas, keliling, sisi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Persegi");
        System.out.println("Masukkan Sisi");
        sisi = scan.nextDouble();
        luas = sisi*sisi;
        keliling = 4*sisi;

        System.out.println("Luas Persegi : " + luas);
        System.out.println("Keliling Persegi : " + keliling);
    }
}
