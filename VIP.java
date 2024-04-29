// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   private int hargaReguler = 150; // deklarasi variabel untuk harga reguler tiket VIP

   @Override
   public int getHargaReguler() { // method untuk mendapatkan harga reguler tiket VIP
       return hargaReguler; // mengembalikan harga reguler tiket VIP
   }

   @Override
   public int getHargaPresale() { // method untuk mendapatkan harga presale tiket VIP
       // potongan 20% untuk presale
       return (int) (hargaReguler * 0.8); // mengembalikan harga presale tiket VIP setelah potongan
   }

   @Override
   public String toString() { // method untuk mengonversi objek menjadi string
       return "VIP"; // mengembalikan string "VIP"
   }
}
