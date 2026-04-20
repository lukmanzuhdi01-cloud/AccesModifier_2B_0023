package Base;

public class Elektronik extends Produk {
    
    private int masaGaransi;

    public Elektronik(String nama, double harga, int stok, int masaGaransi){
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }
    public void setGaransi(int masaGaransi){
        this.masaGaransi = masaGaransi;
    }

    public void tampilData(){
        super.tampilkanInfo();
        System.out.println("Masa garansi:   "+ masaGaransi);
    }
    

}
