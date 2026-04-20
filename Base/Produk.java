package Base;

public class Produk {
    private String nama;
    private double harga;
    private int stok;

    //Construktor
    public Produk(String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String getNama(){
        return nama;
    }
    public double getHaarga(){
        return harga;
    }
    public int getStock(){
        return stok;
    }

    
    public void tampilkanInfo(){
        System.out.println("Produk  :"+ nama);
        System.out.println("Harga   :"+ harga);
        System.out.println("Stok    :"+ stok);
        System.out.println("=======================");
    }


    



}
