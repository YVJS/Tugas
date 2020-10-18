import java.util.Scanner;

public class Trapesium extends Main{
        public void Trapesium () {
            double luas, keliling, sisipendek, sisipanjang, tinggi, SM;
            Scanner scan = new Scanner(System.in);
            System.out.println("Menghitung Luas dan Keliling Trapesium");
            System.out.println("Masukkan Sisi Pendek : ");
            sisipendek = scan.nextDouble();
            System.out.println("Masukkan Sisi Panjang : ");
            sisipanjang = scan.nextDouble();
            System.out.println("Masukkan Tinggi : ");
            tinggi = scan.nextDouble();
            System.out.println("Panjang Miring : ");
            SM = scan.nextDouble();

            luas = (sisipendek+sisipanjang)*tinggi/2;
            keliling = sisipanjang + sisipendek + 2*SM;

            System.out.println("Luas Trapesium : " + luas);
            System.out.println("Keliling Trapesium : " + keliling);
        }

    public void Trapesium2 () {
        double luas, keliling, sisipendek, sisipanjang, tinggi, SM;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Trapesium");
        System.out.println("Masukkan Sisi Pendek : ");
        sisipendek = scan.nextDouble();
        System.out.println("Masukkan Sisi Panjang : ");
        sisipanjang = scan.nextDouble();
        System.out.println("Masukkan Tinggi : ");
        tinggi = scan.nextDouble();
        System.out.println("Panjang Miring : ");
        SM = scan.nextDouble();

        luas = (sisipendek+sisipanjang)*tinggi/2;
        keliling = sisipanjang + sisipendek + SM +tinggi;

        System.out.println("Luas Trapesium : " + luas);
        System.out.println("Keliling Trapesium : " + keliling);
    }
}
