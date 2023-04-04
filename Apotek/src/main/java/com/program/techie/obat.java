public class obat{
    private String namaObat;
    private String keteranganObat;
    private String jenisObat;
    private int hargaJual;
    private int noObat;
    private int stokObat;
    int i = 0;
    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getKeteranganObat() {
        return keteranganObat;
    }

    public void setKeteranganObat(String keteranganObat) {
        this.keteranganObat = keteranganObat;
    }

    public String getJenisObat() {
        return jenisObat;
    }

    public void setJenisObat(String jenisObat) {
        this.jenisObat = jenisObat;
    }
    
    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    public int getNoObat() {
		return noObat;
	}


	public void setNoObat(Short noObat) {
		this.noObat = noObat;
	}



	public int getStokObat() {
		return stokObat;
	}



	public void setStokObat(Short stokObat) {
		this.stokObat = stokObat;
	}

    public obat(String namaObat, String keteranganObat, String jenisObat, int hargaJual, int stokObat) {
    	this.namaObat = namaObat;
        this.keteranganObat = keteranganObat;
        this.jenisObat = jenisObat;
        this.hargaJual = hargaJual;
        this.noObat = i + 1;
        this.stokObat = stokObat;
        
    }

    public void displayObat(){
    	System.out.println(noObat);
        System.out.println(namaObat);
        System.out.println(keteranganObat);
        System.out.println(jenisObat);
        System.out.println(hargaJual);
        System.out.println(stokObat);
    }
}
