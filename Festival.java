// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    private int hargaReguler = 100; // deklarasi variabel untuk harga reguler tiket festival

    @Override
    public int getHargaReguler() { // method untuk mendapatkan harga reguler tiket festival
        return hargaReguler; // mengembalikan harga reguler tiket festival
    }

    @Override
    public int getHargaPresale() { // method untuk mendapatkan harga presale tiket festival
        // tidak ada presale untuk tiket festival
        return hargaReguler; // mengembalikan harga reguler tiket festival
    }

    @Override
    public String toString() { // method untuk mengonversi objek menjadi string
        return "Festival"; // mengembalikan string "Festival"
    }
}
