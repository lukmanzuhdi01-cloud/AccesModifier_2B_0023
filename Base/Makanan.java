package Base;

   
public class Makanan extends Produk {
    
    private String expired;
    private String Kategori;

    public Makanan(String nama, double harga, int stok, String expired, String Kategori){
        super(nama, harga, stok);
        this.expired = expired;
        this.Kategori = Kategori;
    }
    public void setExpired(String expired){
        this.expired = expired;
    }
    public String getKategori(){
        return Kategori;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("[Makanan]");
        super.tampilkanInfo();
        System.out.println("expired:    "+ expired);
        System.out.println("Kategori    : "+   Kategori);
        System.out.println("======================================");
    }
    // Versi-1
    public double hitungDiskon(int jumlahBeli){
        if (jumlahBeli >= 10){
        return hitungTotalHarga(jumlahBeli) * 0.05;
    }
        return 0;

    }
    // Versi-2
    public double hitungDiskon(int jumlahBeli, double persenDiskon){
        return hitungTotalHarga(jumlahBeli) * (persenDiskon/100);
    }
    public double hitungHargaSetelahDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }


    
}


