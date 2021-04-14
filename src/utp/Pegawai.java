package utp;
import static utp.Perpustakaan.listPelanggan;
import static utp.Perpustakaan.listBuku;

public class Pegawai {
    private String namaPegawai;
    private String nomorPegawai;

    public Pegawai(String namaPegawai, String nomorPegawai) {
        this.namaPegawai = namaPegawai;
        this.nomorPegawai = nomorPegawai;
        System.out.println("\t\t\tPERPUSTAKAAN ABADI\n\n");
        System.out.println("Greetings! selamat membaca dan semoga menikmati!");
        System.out.println("- " + getNamaPegawai().split(" ")[0]);
        System.out.println("==================================================\n");
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
    
    public void tampilkanInfoPegawai() {
        System.out.println("INFORMASI DETAIL PEGAWAI");
        System.out.println("Nama Pegawai : " + getNamaPegawai());
        System.out.println("No Pegawai : " + getNomorPegawai() + "\n");
    }
    
    public void menambahPelanggan(String namaPelanggan, String noPelanggan) {
        // Memasukkan nama dan nomor pelanggan ke dalam variable static listPelanggan
        for (int i = 0; i < listPelanggan.length; i++) {
            if(listPelanggan[i] == null) {
                    listPelanggan[i] = new Pelanggan(namaPelanggan, noPelanggan);
                    break;
            } else {
                if(listPelanggan[i].getNamaPelanggan().equals(namaPelanggan)) {
                    System.out.println("\nMaaf, Pelanggan dengan nama " + namaPelanggan + " sudah terdaftar.\n");
                    break;
                }
            }
        }
    }
    
    public void menambahBuku(String judul, String penulis, int jumlah) {
        // Memasukkan judul, penulis, dan jumlah ke dalam variable static listBuku
        for (int i = 0; i < listBuku.length; i++) {
            if(listBuku[i] == null) {
                    listBuku[i] = new Buku(judul, penulis, jumlah);
                    break;
            } else {
                if(listBuku[i].getJudul().equals(judul)) {
                    listBuku[i].setJumlah(listBuku[i].getJumlah() + jumlah);
                    break;
                }
            }
        }
    }
    
}
