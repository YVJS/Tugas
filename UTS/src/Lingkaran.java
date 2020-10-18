import java.util.Scanner;

public class Lingkaran extends Main{
    public void Lingkaran () {
        double luas, keliling, r;
        double phi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan jari-jari : ");
        r = scan.nextDouble();

        luas = phi * r* r;
        keliling = phi * 2*r;

        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}
