import Base.Makanan;
import Base.Elektronik;
public class Main {

    public static void main(String[] args) {
      
      Elektronik e1 = new Elektronik("Laptop", 10000000, 2, 24);
      e1.setGaransi(24);
      e1.tampilData();

      Makanan e = new Makanan("Bakmie Goreng", 50000, 300, 30);
        e.setExpired(30);
        e.tampilData();
        
    }
}
