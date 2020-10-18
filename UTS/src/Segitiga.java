import java.util.Scanner;

public class Segitiga extends Main{
    public void SegitigaSembarang () {
        double luas, keliling, alas, tinggi,sisia,sisib,sisic;

        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Segitiga");
        System.out.println("Masukkan Alas : ");
        alas = scan.nextDouble();
        System.out.println("Masukkan Tinggi  : ");
        tinggi = scan.nextDouble();
        System.out.println("Masukkan Sisi A : ");
        sisia = scan.nextDouble();
        System.out.println("Masukkan Sisi B : ");
        sisib = scan.nextDouble();
        System.out.println("Masukkan Sisi C : ");
        sisic = scan.nextDouble();

        luas=(alas+tinggi)/2;
        keliling= sisia+sisib+sisic;

        System.out.println("Luas Segitiga : " + luas);
        System.out.println("Keliling Segitiga : " + keliling);
    }

    public void SegitigaSamakaki () {
        double luas, keliling, alas, tinggi,SM;

        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Segitiga");
        System.out.println("Masukkan Alas : ");
        alas = scan.nextDouble();
        System.out.println("Masukkan Tinggi  : ");
        tinggi = scan.nextDouble();
        System.out.println("Masukkan Sisi Miring : ");
        SM = scan.nextDouble();

        luas=(alas+tinggi)/2;
        keliling= 2*SM + alas;

        System.out.println("Luas Segitiga : " + luas);
        System.out.println("Keliling Segitiga : " + keliling);
    }

    public void SegitigaSisi () {
        double luas, keliling, alas, tinggi,SM;

        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Segitiga");
        System.out.println("Masukkan Alas : ");
        alas = scan.nextDouble();
        System.out.println("Masukkan Tinggi  : ");
        tinggi = scan.nextDouble();

        luas=(alas+tinggi)/2;
        keliling= 3*alas;

        System.out.println("Luas Segitiga : " + luas);
        System.out.println("Keliling Segitiga : " + keliling);
    }

    public void SegitigaSiku () {
        double luas, keliling, alas, tinggi,SM;

        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Segitiga");
        System.out.println("Masukkan Alas : ");
        alas = scan.nextDouble();
        System.out.println("Masukkan Tinggi  : ");
        tinggi = scan.nextDouble();
        System.out.println("Masukkan Sisi Miring : ");
        SM = scan.nextDouble();

        luas=(alas+tinggi)/2;
        keliling= alas+tinggi+SM;

        System.out.println("Luas Segitiga : " + luas);
        System.out.println("Keliling Segitiga : " + keliling);
    }
}
