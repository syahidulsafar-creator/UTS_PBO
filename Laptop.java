/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.PBO;

/**
 *
 * @author USER
 */
public class Laptop extends Elektronik{
    private int ukuranLayar;
    private int kapasitasRAM;

    public Laptop() {
        super();
        this.ukuranLayar = 14;
        this.kapasitasRAM = 16;
        
    }

    public Laptop(String merek, int tahunProduksi, int garansi,
        int ukuranLayar, int kapasitasRAM) {
        super(merek, tahunProduksi, garansi);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasRAM = kapasitasRAM;
        
    }

     public int getUkuranLayar() {
         return ukuranLayar; 
     }
    public void setUkuranLayar(int ukuranLayar) { 
        this.ukuranLayar = ukuranLayar; 
        
    }
    public int getKapasitasRAM() { 
        return kapasitasRAM; 
    }
    public void setKapasitasRAM(int kapasitasRAM) { 
        this.kapasitasRAM = kapasitasRAM; 
        
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Ukuran Layar   : " + ukuranLayar + " INCH");
        System.out.println("Kapasitas RAM  : " + kapasitasRAM + " GB");
        
    }
}