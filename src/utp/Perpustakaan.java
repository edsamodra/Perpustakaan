package utp;

public class Perpustakaan {
    private Pegawai pegawaiPerpus;
    static Buku listBuku[] = new Buku[100];
    static Pelanggan listPelanggan[] = new Pelanggan[20];

    public Perpustakaan(Pegawai pegawaiPerpus) {
        this.pegawaiPerpus = pegawaiPerpus;
    }

    public Buku cariBuku(String judulBuku) {
        Buku t = null;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null) {
                if(listBuku[i].getJudul().equals(judulBuku)) {
                    t = listBuku[i];
                    break;
                }
            }
        }
        return t;
    }
    
    public void pinjam(String namaPelanggan, String judulBuku) {
        Buku hasilCariBuku = cariBuku(judulBuku);
        
        if(hasilCariBuku == null) System.out.println("Maaf, buku " + judulBuku + " tidak ada.");
        else {
            if (hasilCariBuku.getJumlah() > 0) {
                
                // Perulangan mencari nama pelanggan yang sama kayak yang ada di params
                for (Pelanggan listPelanggan1 : listPelanggan) {
                    if (listPelanggan1 != null) {
                        if (listPelanggan1.getNamaPelanggan().equals(namaPelanggan)) {
                            
                            // kalo misal udah nemu, maka panggil method tambahBuku
                            // Cermati juga method tambah buku
                            listPelanggan1.tambahBuku(hasilCariBuku);
                            
                            // Kalo udah bisa tambah buku, otomatis buku yang di perpus berkurang 1
                            for (Buku listBuku1 : listBuku) {
                                if (listBuku1 != null) {
                                    int jumlah = listBuku1.getJumlah();
                                    if (listBuku1.getJudul().equals(judulBuku)) {
                                        listBuku1.setJumlah(jumlah - 1);
                                        break;
                                    }
                                }
                            }
                            
                            // Jangan lupa kasih break.
                            break;
                        }
                    }
                }
            } 
        }
    }
    
    public void kembalikan(String namaPelanggan, String judulBuku) {
        Buku hasilCariBuku = cariBuku(judulBuku);
        
        if(hasilCariBuku == null) System.out.println("Maaf, Anda belum meminjam buku " + judulBuku);
        else {
            for (Pelanggan listPelanggan1 : listPelanggan) {
                if (listPelanggan1 != null) {
                    if (listPelanggan1.getNamaPelanggan().equals(namaPelanggan)) {
                        Buku bukuku[] = listPelanggan1.tampilBuku();
                        for (Buku bukuku1 : bukuku) {
                            if (bukuku != null) {
                                if (bukuku1.getJudul().equals(judulBuku)) {
                                    listPelanggan1.kembalikanBuku(hasilCariBuku);
                                    break;
                                }
                            }
                        }
                        for (Buku listBuku1 : listBuku) {
                            if (listBuku1 != null) {
                                int jumlah = listBuku1.getJumlah();
                                if (listBuku1.getJudul().equals(judulBuku)) {
                                    listBuku1.setJumlah(jumlah + 1);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public void tampilkanInfoPerpustakaan() {
        System.out.println("\nINFORMASI PERPUSTAKAAN");
        System.out.println("Nama Pegawai : " + pegawaiPerpus.getNamaPegawai());
        System.out.println("Nomor Pegawai : " + pegawaiPerpus.getNomorPegawai());
        System.out.println();
        
        System.out.println("Buku yang ada di Perpustakaan ini :");
        for (int i = 0; i < listBuku.length; i++) {
            if(listBuku[i] != null) System.out.println((i+1) + ". " + listBuku[i].getJudul());
            if (listBuku[0] == null) {
                System.out.println(">> Belum ada buku yang terdaftar");
                break;
            }
        }
        
        System.out.println();
        
        System.out.println("Pelanggan yang terdaftar :");
        for (int i = 0; i < listPelanggan.length; i++) {
            if(listPelanggan[i] != null) System.out.println((i+1) + ". " + listPelanggan[i].getNamaPelanggan());
            if (listPelanggan[0] == null) {
                System.out.println(">> Belum ada pelanggan yang terdaftar");
                break;
            }
        }
        
        System.out.println();
    }
    
    public void tampilkanDetailBuku(String judulBuku) {
        for (Buku listBuku1 : listBuku) {
            if (listBuku1 != null) {
                if(listBuku1.getJudul().equals(judulBuku)) listBuku1.tampilkanBuku();
            }
        }
    }
    
}
