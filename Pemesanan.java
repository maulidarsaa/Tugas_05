// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama; // deklarasi variabel untuk menyimpan nama pembeli
    private String tahap; // deklarasi variabel untuk menyimpan tahap pembelian
    private Tiket tiket; // deklarasi variabel untuk menyimpan jenis tiket
    private int jumlah; // deklarasi variabel untuk menyimpan jumlah tiket

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) { // konstruktor Pemesanan
        this.nama = nama; // menginisialisasi nama pembeli
        this.tahap = tahap; // menginisialisasi tahap pembelian
        this.tiket = tiket; // menginisialisasi jenis tiket
        this.jumlah = jumlah; // menginisialisasi jumlah tiket
    }

    public void cetakNota() { // method untuk mencetak nota pemesanan
        int totalHarga; // deklarasi variabel untuk menyimpan total harga
        if (tahap.equalsIgnoreCase("presale")) { // jika tahap pembelian adalah presale
            totalHarga = tiket.getHargaPresale() * jumlah; // menghitung total harga dengan harga presale
        } else { // jika tahap pembelian adalah reguler
            totalHarga = tiket.getHargaReguler() * jumlah; // menghitung total harga dengan harga reguler
        }

        System.out.println("\n--- Nota Pemesanan ---"); // menampilkan nota pemesanan
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + tiket);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp " + totalHarga + ".0");
    }
}
