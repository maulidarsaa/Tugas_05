import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!"); // menampilkan pesan selamat datang

        System.out.print("Masukkan nama pembeli: "); // meminta input nama pembeli
        String nama = scanner.nextLine(); // membaca input nama pembeli

        System.out.println("\nPilih tahap pembelian:"); // menampilkan pesan untuk memilih tahap pembelian
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): "); // meminta input tahap pembelian
        int pilihanTahapPembelian = scanner.nextInt(); // membaca input tahap pembelian

        String tahap; // deklarasi variabel untuk menyimpan tahap pembelian
        if (pilihanTahapPembelian == 1) { // jika memilih presale
            tahap = "Presale"; // akan disetting tahap pembelian menjadi presale
        } else if (pilihanTahapPembelian == 2) { // jika memilih reguler
            tahap = "Reguler"; // akan disetting tahap pembelian menjadi reguler
        } else { // jika input tidak valid 
            System.out.println("Input tidak valid!"); // menampilkan pesan input tidak valid
            return; // keluar dari method main
        }

        Tiket tiket; // deklarasi variabel untuk menyimpan jenis tiket
        if (tahap.equalsIgnoreCase("presale")) { // jika tahap pembelian adalah presale
            System.out.println("\nPilih jenis tiket:"); // menampilkan pesan untuk memilih jenis tiket
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): "); // meminta input jenis tiket
            int pilihanPresale = scanner.nextInt(); // membaca input jenis tiket presale

            if (pilihanPresale == 1) { // jika memilih tiket VIP
                tiket = new VIP(); // akan membuat objek tiket VIP
            } else if (pilihanPresale == 2) { // jika memilih tiket VVIP
                tiket = new VVIP(); // akan membuat objek tiket VVIP
            } else { // jika input tidak valid
                System.out.println("Input tidak valid!"); // menampilkan pesan input tidak valid
                return; // keluar dari method main
            }
        } else { // jika tahap pembelian adalah reguler
            System.out.println("\nPilih jenis tiket:"); // menampilkan pesan untuk memilih jenis tiket
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): "); // meminta input jenis tiket
            int pilihanReguler = scanner.nextInt(); // membaca input jenis tiket reguler

            if (pilihanReguler == 1) { // jika memilih tiket Festival
                tiket = new Festival(); // akan membuat objek tiket Festival
            } else if (pilihanReguler == 2) { // jika memilih tiket VIP
                tiket = new VIP(); // akan membuat objek tiket VIP
            } else if (pilihanReguler == 3) { // jika memilih tiket VVIP
                tiket = new VVIP(); // akan membuat objek tiket VVIP
            } else { // jika input tidak valid
                System.out.println("Input tidak valid!"); // menampilkan pesan input tidak valid
                return; // keluar dari method main
            }
        }

        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: "); // Meminta input jumlah tiket
        int jumlah = scanner.nextInt(); // Membaca input jumlah tiket

        Pemesanan pesanan = new Pemesanan(nama, tahap, tiket, jumlah); // membuat objek pesanan
        pesanan.cetakNota(); // memanggil method cetakNota
    }
}
