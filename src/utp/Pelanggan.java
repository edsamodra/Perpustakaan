package utp;
// PR : Menghapus Pelanggan dengan parameter nama
// serta semua buku yang dipinjam oleh pelanggan tersebut otomatis terkembalikan
import static utp.Perpustakaan.listPelanggan;

public class Pelanggan {
    private String namaPelanggan;
    private String noPelanggan;
    private Buku bukuPinjaman[] = new Buku[3];

    public Pelanggan(String namaPelanggan, String noPelanggan) {
        this.namaPelanggan = namaPelanggan;
        this.noPelanggan = noPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNoPelanggan() {
        return noPelanggan;
    }

    public void setNoPelanggan(String noPelanggan) {
        this.noPelanggan = noPelanggan;
    }
    
    public Buku[] tampilBuku() {
        return bukuPinjaman;
    }

    public void tambahBuku(Buku bukuPinjam) {
        // Perulangan untuk mencari judul yang sama terlebih dahulu
        for (int i = 0; i < bukuPinjaman.length; i++) {
            if (bukuPinjaman[i] != null) {
                if (bukuPinjaman[i].getJudul().equals(bukuPinjam.getJudul())) {
                    // Kalo misalnya buku yang dicari sebenarnya udah dipinjam
                    System.out.println("\nMaaf! " + getNamaPelanggan() + " sudah meminjam " + bukuPinjam.getJudul());
                    break;
                }
            } else {
                // Kalo belum ada, peminjaman itu akan berhasil.
                bukuPinjaman[i] = bukuPinjam;
                System.out.println("\nSelamat! " + namaPelanggan + " berhasil meminjam " + bukuPinjam.getJudul());
                break;
            }
        }
    }
    
    public void kembalikanBuku(Buku bukuKembali) {
        for (int i = 0; i < bukuPinjaman.length; i++) {
            if (bukuPinjaman[i] != null) {
                if (bukuPinjaman[i].getJudul().equals(bukuKembali.getJudul())) {
                    bukuPinjaman[i] = null;
                    System.out.println("\nSelamat! Buku " + bukuKembali.getJudul() + " telah berhasil " + getNamaPelanggan() + " kembalikan");
                    break;
                }
            }
        }
    }
    
    public static void tampilkanInfoPelanggan() {
        System.out.println("\nINFORMASI DETAIL PELANGGAN");
        
        if (listPelanggan[0] == null){
            System.out.println(">> Pelanggan tidak Ada");    
        }
        // Perulangan ini, buat nampilin setiap pelanggan
        for (int i = 0; i < listPelanggan.length; i++) {
            int c = 0;
            if (listPelanggan[i] != null) {
                System.out.println("Nama : " + listPelanggan[i].getNamaPelanggan());
                System.out.println("Nomor : " + listPelanggan[i].getNoPelanggan());
                System.out.println("Buku yang dipinjam : ");
                // Yang ini, untuk menampilkan setiap buku yang dipinjam oleh pelanggan.
                for (int j = 0; j < listPelanggan[i].bukuPinjaman.length; j++) {
                    if (listPelanggan[i].bukuPinjaman[j] != null) {
                        System.out.print((j+1) + ". " + listPelanggan[i].bukuPinjaman[j].getJudul());
                    } else {
                        c++;
                    }
                    if (c == 3) {
                        System.out.print(">> Belum meminjam");
                    }
                }
                System.out.println("\n");
            }
        }
    }
    
}
