/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class SmartWatch extends Smartphone{
    private int ukuranLayar;
    private boolean tahanAir;
    
    public SmartWatch (){
        super();
        this.ukuranLayar = ukuranLayar;
        this.tahanAir = tahanAir;
        
    }
    
    public SmartWatch(String merek, int tahunProduksi, int garansi,
       int kapasitasBaterai, int jumlahKamera,
       int ukuranLayar, boolean tahanAir) {
       super(merek, tahunProduksi, garansi, kapasitasBaterai, jumlahKamera);
       this.ukuranLayar = ukuranLayar;
       this.tahanAir = tahanAir;
       
    }
    
    public int getUkuranLayar(){
         return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
         this.ukuranLayar = ukuranLayar;
         
    }
     public boolean getTahanAir(){
         return tahanAir;
    }
    public void setTahanAir(boolean tahanAir){
         this.tahanAir = tahanAir;
    
    }
    
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Ukuran Layar   : " + ukuranLayar + " inch");
        System.out.println("Tahan Air      : " + (tahanAir ? "IYAAA" : "TIDAKK"));
        
    }
}