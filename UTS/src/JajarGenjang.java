import java.util.Scanner;

public class JajarGenjang extends Main{
    public void JajarGendang () {
        double luas, keliling, alas, tinggi, SM;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Jajar Genjang");
        System.out.println("Masukkan Alas : ");
        alas = scan.nextDouble();
        System.out.println("Masukkan Tinggi : ");
        tinggi = scan.nextDouble();
        System.out.println("Masukkan Sisi Miring : ");
        SM = scan.nextDouble();

        luas = alas*tinggi;
        keliling = 2*SM + 2*alas;

        System.out.println("Luas Jajar Genjang : " + luas);
        System.out.println("Keliling Jajar Genjang : " + keliling);
    }
}
