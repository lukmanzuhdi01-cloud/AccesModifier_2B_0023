package Base;

public class Produk {
    private String nama;
    String kategori;
    protected double harga;
    public int stok;

    //Construktor
    public Produk(String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }
    
    public void tampilkanInfo(){
        System.out.println("Produk  :"+ nama);
        System.out.println("Kategori:"+ kategori);
        System.out.println("Harga   :"+ harga);
        System.out.println("Stok    :"+ stok);
        System.out.println("=======================");
    }


    



}
