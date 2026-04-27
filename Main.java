import Base.Makanan;
import Base.Elektronik;

public class Main {

    public static void main(String[] args) {
      Elektronik handphone = new Elektronik("Handphone", 9000000, 100, 3, "Iphone");
      Elektronik komputer = new Elektronik("Komputer", 9999999, 100, 3, "Predator");
      Makanan Pisang = new Makanan("Pisang", 3000000.0, 1, "Tiga Hari", "Buah");
      Makanan Melon = new Makanan("Melom", 5000, 100, "tujuh hari", "Makanan");
      // Overriding 
      System.out.println("==========Daftar Produk========");
      handphone.tampilkanInfo();
      komputer.tampilkanInfo();
      Pisang.tampilkanInfo();
      Melon.tampilkanInfo();
      
      //Overloading
      System.out.println("=========Rincian Pajak Elektronik===========");

      //Pajak-1
      double pajakHandphone = handphone.hitungPajak(1);
      double totalHandphone = handphone.hitungHargaSetelahPajak(1);
      System.out.println(" handphone x1 (PPN standart 11%");
      System.out.println("subtotal :    Rp"+ handphone.hitungTotalHarga(1));
      System.out.println("Pajak :   Rp" + pajakHandphone); 
      System.out.println("Total :   "+ totalHandphone);

      // Pajak-2
        double pajakKomputer = komputer.hitungPajak(5, 5    );
        System.out.println("komputer x5(PPN 5%)");
        System.out.println("Subtotal :  Rp"+ komputer.hitungTotalHarga(5));
        System.out.println("Pajak   Rp" + pajakKomputer);
        System.out.println("total :  Rp"+ komputer.hitungHargaSetelahPajak(5));

      //Overloading
      //Diskon1
      System.out.println("n/ =======Rincian Diskon Makanan");
      double diskonPisang = Pisang.hitungDiskon(90, 5);
      System.out.println("Pisang x5(PPN 5%");
      System.out.println("Subtotal : Rp"+   Pisang.hitungTotalHarga(5));
      System.out.println("Diskon    :   Rp"+    Pisang.hitungTotalHarga(5));
      System.out.println("total :   Rp"+ Pisang.hitungHargaSetelahDiskon(5));
      
      //Diskon2
      System.out.println("\nmelon x5(diskon custom 10%");
      System.out.println("Subtotal :    Rp"+ Melon.hitungTotalHarga(10));
      System.out.println("Diskon :  Rp"+ Melon.hitungDiskon(5, 10));
      System.out.println("total :   Rp"+ Melon.hitungHargaSetelahDiskon(10));
    

      //Transaksi
      System.out.println("Transaksi Pembelian");
      handphone.beli(1);
      komputer.beli(5);
      Pisang.beli(5);
      Melon.beli(10);
    }
}
