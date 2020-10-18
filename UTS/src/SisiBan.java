import java.util.Scanner;

public class SisiBan extends Main{
    public void SisiBan () {
        double luas, keliling, radius;
        int js, pj;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Sisi Banyak");
        System.out.println("Masukkan Jumlah Sisi");
        js = Scan.nextInt();
        System.out.println("Masukkan Panjang Sisi");
        pj = Scan.nextInt();
        System.out.println("Masukkan Radius");
        radius = Scan.nextDouble();
        double rad = 360/js;
        luas = js * radius*radius * Math.sin(Math.toRadians(rad));
        keliling = js * pj;

        System.out.println("Luas Bangun Sisi " + js + " : " + luas);
        System.out.println("Keliling Banugn Sisi" + js + " : " + keliling);
    }

}
