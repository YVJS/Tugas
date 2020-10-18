import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program Menghitung Bangun");
        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Volume");
        System.out.println("Pilihan : ");
        Scanner Scan = new Scanner(System.in);
        int a = Scan.nextInt();

        switch (a) {
            case 1 :
                System.out.println("Program Menghitung Luas & Keliling Bangun Datar");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Trapesium");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Sisi Lebih dari 4");
                System.out.println("7. Lingkaran");
                System.out.println("Pilihan : ");
                int b = Scan.nextInt();
                switch (b){
                    case 1 :
                        Persegi P = new Persegi();
                        P.Persegi();
                        break;
                    case 2 :
                        PersegiPanjang PP = new PersegiPanjang();
                        PP.PersegiPanjang();
                        break;
                    case 3 :
                        System.out.println("Pilih Jenis Segitiga");
                        System.out.println("1. Sama Kaki");
                        System.out.println("2. Sama Sisi");
                        System.out.println("3. Siku siku");
                        System.out.println("4. Sembarang");
                        System.out.println("Pilihan : ");
                        int c = Scan.nextInt();
                        Segitiga S = new Segitiga();
                        switch (c) {
                            case 1:
                                S.SegitigaSamakaki();
                                break;
                            case 2:
                                S.SegitigaSisi();
                                break;
                            case 3:
                                S.SegitigaSiku();
                                break;
                            case 4:
                                S.SegitigaSembarang();
                                break;
                            default:
                                System.out.println("Pilihan Tidak Ada");
                        }
                    case 4 :
                        Trapesium T = new Trapesium();
                        System.out.println("Pilih Jenis Trapesium");
                        System.out.println("Trapesium Sama Kaki");
                        System.out.println("Trapesium Siku-siku");
                        System.out.println("Pilihan : ");
                        int d = Scan.nextInt();
                        switch (d) {
                            case 1 :
                                T.Trapesium();
                                break;
                            case 2 :
                                T.Trapesium2();
                                break;
                            default:
                                System.out.println("Pilihan Tidak Ada");
                        }
                            break;
                    case 5 :
                        JajarGenjang JG = new JajarGenjang();
                        JG.JajarGendang();
                        break;
                    case 6 :
                        SisiBan SB = new SisiBan();
                        SB.SisiBan();
                        break;

                    case 7 :
                        Lingkaran L = new Lingkaran();
                        L.Lingkaran();
                        break;
                    default:
                        System.out.println("Pilihan Tidak Ada");
                }
                break;
                case 2 :
                    BangunRuang BR = new BangunRuang();
                    System.out.println("Program Menghitung Volume Bangun Ruang");
                    System.out.println("1. Kubus");
                    System.out.println("2. Balok");
                    System.out.println("3. Limas Persegi");
                    System.out.println("4. Prisma Segitiga");
                    System.out.println("5. Tabung");
                    System.out.println("Pilihan : ");
                    int e = Scan.nextInt();
                    switch (e){
                        case 1 :
                            BR.Kubus();
                            break;
                        case 2 :
                            BR.Balok();
                            break;

                        case 3 :
                            BR.Limas();
                            break;

                        case 4 :
                            BR.Prisma();
                            break;

                        case 5 :
                            BR.Tabung();
                            break;
                        default:
                            System.out.println("Pilihan Tidak Ada");
                    }
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }


    }


}
