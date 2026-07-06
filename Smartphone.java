/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class Smartphone extends Elektronik{
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone (){
        super();
        this.kapasitasBaterai = 8000;
        this.jumlahKamera = 3;
        
    }
    
    public Smartphone (int kapasitasBaterai, int jumlahKamera){
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
        
    }
    
    public int getKapasitasBaterai(){
         return kapasitasBaterai;
    }
    public void setKapasitasBaterai(int kapasitasBaterai){
         this.kapasitasBaterai = kapasitasBaterai;
         
    }
    public int getJumlahKamera(){
         return kapasitasBaterai;
    }
    public void setJumlahKamera(int jumlahKamera){
         this.jumlahKamera = jumlahKamera;
         
    }
     
    public Smartphone(String merek, int tahunProduksi, int garansi,
        int kapasitasBaterai, int jumlahKamera) {
        super(merek, tahunProduksi, garansi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
        
    }
    
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " MAH");
        System.out.println("Jumlah Kamera     : " + jumlahKamera + " KAMERA");
    }
}