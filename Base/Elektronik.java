package Base;

public class Elektronik extends Produk {
    
    private int masaGaransi;
    private String Merk;
    private static final double PPN = 0.11;

    public Elektronik(String nama, double harga, int stok, int masaGaransi, String Merk){
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
        this.Merk = Merk;
    }

    public String getMerk(){
        return Merk;
    }

    public void setGaransi(int masaGaransi){
        this.masaGaransi = masaGaransi;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("[Merk]");
        super.tampilkanInfo();
        System.out.println("Masa garansi:   "+ masaGaransi);
        System.out.println("Merk    : "+    Merk);
    }
    //Overloading
    public double hitungPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) * PPN;
    }    
    // versi 2
    public double hitungPajak(int jumlahBeli, double persenPajak){
        return hitungTotalHarga(jumlahBeli) + (persenPajak/100);
    }

    public double hitungHargaSetelahPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) * hitungPajak(jumlahBeli);
    }


}
