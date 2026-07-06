/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS.PBO;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LAB-SI-PC
 */
public class ElektronikDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Elektronik> daftar = new ArrayList<>();
        boolean lanjut = true;

        System.out.println("======ELEKTRONIK======");

        while (lanjut) {
            System.out.println("\n===MENU===");
            System.out.println("1.Elektronik");
            System.out.println("2.Laptop");
            System.out.println("3.Gaming");
            System.out.println("4.Smartphone");
            System.out.println("5.SmartWatch");
            System.out.println("6.Tampilkan Semuanyaa");
            System.out.println("7.KELUAR");
            System.out.print("PILIHAN : ");

            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Merek: "); String m1 = sc.nextLine();
                    System.out.print("Tahun Produksi: "); int t1 = sc.nextInt();
                    System.out.print("Garansi (tahun): "); int g1 = sc.nextInt(); sc.nextLine();
                    daftar.add(new Elektronik(m1, t1, g1));
                    System.out.println("Elektronik ditambahkan!!");
                    break;

                case 2:
                    System.out.print("Merek: "); String m2 = sc.nextLine();
                    System.out.print("Tahun Produksi: "); int t2 = sc.nextInt();
                    System.out.print("Garansi (tahun): "); int g2 = sc.nextInt();
                    System.out.print("Ukuran Layar (inch): "); int l2 = sc.nextInt();
                    System.out.print("Kapasitas RAM (GB): "); int r2 = sc.nextInt(); sc.nextLine();
                    daftar.add(new Laptop(m2, t2, g2, l2, r2));
                    System.out.println("Laptop ditambahkan!!");
                    break;

                case 3:
                    System.out.print("Merek: "); String m3 = sc.nextLine();
                    System.out.print("Tahun Produksi: "); int t3 = sc.nextInt();
                    System.out.print("Garansi (tahun): "); int g3 = sc.nextInt();
                    System.out.print("Ukuran Layar (inch): "); int l3 = sc.nextInt();
                    System.out.print("Kapasitas RAM (GB): "); int r3 = sc.nextInt(); sc.nextLine();
                    System.out.print("Kartu Grafis: "); String gpu = sc.nextLine();
                    System.out.print("Refresh Rate (Hz): "); int rr = sc.nextInt(); sc.nextLine();
                    daftar.add(new Gaming(m3, t3, g3, l3, r3, gpu, rr));
                    System.out.println("Gaming ditambahkan!!");
                    break;

                case 4:
                    System.out.print("Merek: "); String m4 = sc.nextLine();
                    System.out.print("Tahun Produksi: "); int t4 = sc.nextInt();
                    System.out.print("Garansi (tahun): "); int g4 = sc.nextInt();
                    System.out.print("Kapasitas Baterai (mAh): "); int b4 = sc.nextInt();
                    System.out.print("Jumlah Kamera: "); int k4 = sc.nextInt(); sc.nextLine();
                    daftar.add(new Smartphone(m4, t4, g4, b4, k4));
                    System.out.println("Smartphone ditambahkan!!");
                    break;

                case 5:
                    System.out.print("Merek: "); String m5 = sc.nextLine();
                    System.out.print("Tahun Produksi: "); int t5 = sc.nextInt();
                    System.out.print("Garansi (tahun): "); int g5 = sc.nextInt();
                    System.out.print("Kapasitas Baterai (mAh): "); int b5 = sc.nextInt();
                    System.out.print("Jumlah Kamera: "); int k5 = sc.nextInt();
                    System.out.print("Ukuran Layar (inch): "); int l5 = sc.nextInt();
                    System.out.print("Tahan Air (1=Ya, 0=Tidak): "); int ta = sc.nextInt(); sc.nextLine();
                    daftar.add(new SmartWatch(m5, t5, g5, b5, k5, l5, ta == 1));
                    System.out.println("SmartWatch ditambahkan!!");
                    break;

                case 6:
                    if (daftar.isEmpty()) {
                        System.out.println("Daftar kosong!!");
                    } else {
                        for (int i = 0; i < daftar.size(); i++) {
                            System.out.println("\n[" + (i + 1) + "] " +
                                    daftar.get(i).getClass().getSimpleName());
                            System.out.println("====================");
                            daftar.get(i).cetak();
                        }
                    }
                    break;

                case 0:
                    System.out.println("PROGRAM SELESAII");
                    lanjut = false;
                    break;

                default:
                    System.out.println("PILIAN TIDAK VALID!!");
                    break;
                    
            }
        }
        sc.close();
    }
}