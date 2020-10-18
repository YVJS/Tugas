import java.util.Scanner;

public class BangunRuang extends Main{
    public void Kubus () {
        double sisi,volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan sisi : ");
        sisi = scan.nextDouble();

        volume = sisi * sisi * sisi;

        System.out.println("Volume : " + volume);
    }
    public void Balok () {
        double p,l,t,volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan panjang : ");
        p = scan.nextDouble();
        System.out.println("Masukkan lebar : ");
        l = scan.nextDouble();
        System.out.println("Masukkan tinggi : ");
        t = scan.nextDouble();

        volume = p * l * t;

        System.out.println("Volume : " + volume);
    }

    public void Tabung () {
        double r,t,volume;
        double phi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan jari-jari : ");
        r = scan.nextDouble();
        System.out.println("Masukkan tinggi : ");
        t = scan.nextDouble();

        volume = phi*r*r*t;

        System.out.println("Volume : " + volume);
    }

    public void Prisma () {
        double alas,tinggi,t,volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan alas segitiga : ");
        alas = scan.nextDouble();
        System.out.println("Masukkan tinggi segitiga : ");
        tinggi = scan.nextDouble();
        System.out.println("Masukkan tinggi : ");
        t = scan.nextDouble();

        volume = (alas+tinggi)/2*t;

        System.out.println("Volume : " + volume);
    }
    public void Limas () {
        double sisi,t,volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan sisi : ");
        sisi = scan.nextDouble();
        System.out.println("Masukkan tinggi : ");
        t = scan.nextDouble();

        volume = sisi*sisi*t/3;

        System.out.println("Volume : " + volume);
    }
}
