// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    private int hargaReguler = 200; // deklarasi variabel untuk harga reguler tiket VVIP

    @Override
    public int getHargaReguler() { // method untuk mendapatkan harga reguler tiket VVIP
        return hargaReguler; // mengembalikan harga reguler tiket VVIP
    }

    @Override
    public int getHargaPresale() { // method untuk mendapatkan harga presale tiket VVIP
        // Potongan 20% untuk presale
        return (int) (hargaReguler * 0.8); // Mengembalikan harga presale tiket VVIP setelah potongan
    }

    @Override
    public String toString() { // Method untuk mengonversi objek menjadi string
        return "VVIP"; // mengembalikan string "VVIP"
    }
}
