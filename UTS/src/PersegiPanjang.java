import java.util.Scanner;

public class PersegiPanjang extends Main{
    public void PersegiPanjang () {
        double luas, keliling, Panjang, Lebar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("Masukkan Panjang");
        Panjang = scan.nextDouble();
        System.out.println("Masukkan Lebar");
        Lebar = scan.nextDouble();

        luas = Panjang*Lebar;
        keliling = 2*Panjang + 2*Lebar;

        System.out.println("Luas Persegi Panjang : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
}
