package tubes;

import java.util.Scanner;



public class stok{
    private Short noObat;
    private String namaObat;
    private String keteranganObat;
    private Short stokObat;
    private int hargaJual;

    public stok(Short noObat, String namaObat, String keteranganObat,Short stokObat, int hargaJual){
        this.noObat = noObat;
        this.namaObat = namaObat;
        this.keteranganObat = keteranganObat;
        this.stokObat = stokObat;
        this.hargaJual = hargaJual;
    }

    public void setNoObat(Short noObat) {
        this.noObat = noObat;
    }
    public int getNoObat() {
        return noObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }
    public String getNamaObat() {
        return namaObat;
    }

    public void setKeteranganObat(String keteranganObat) {
        this.keteranganObat = keteranganObat;
    }
    public String getKeteranganObat() {
        return keteranganObat;
    }

    public void setStokObat(Short stokObat) {
        this.stokObat = stokObat;
    }
    public int getStokObat() {
        return stokObat;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
    public int getHargaJual() {
        return hargaJual;
    }

    Scanner scan = new Scanner(System.in);

    public void tambahObat(int noObat, String namaObat, String keteranganObat, int stokObat, int hargaJual){
        
    }
    public void menambahkanStok(String namaObat, int stokObat){
        
    }
    public void SearchObat(String namaObat){

    }
}
