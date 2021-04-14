package utp;

public class MainClass {
    public static void main(String[] args) {
        Pegawai pegawaiPerpus = new Pegawai("Edwin Samodra Pratama", "205150600111023");
        
        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);
        
        pegawaiPerpus.menambahPelanggan("Iqbal", "99001110001");
        pegawaiPerpus.menambahPelanggan("Shinomiya", "99001110002");
        pegawaiPerpus.menambahPelanggan("Hibiki", "99001110003");
        pegawaiPerpus.menambahPelanggan("Hachida", "99001110004");
        pegawaiPerpus.menambahPelanggan("Hiruka", "99001110005");
        
        pegawaiPerpus.menambahBuku("Buku1", "Tiancan", 3);
        pegawaiPerpus.menambahBuku("Buku2", "Akasaka", 3);
        pegawaiPerpus.menambahBuku("Buku3", "Chugong", 3);
        pegawaiPerpus.menambahBuku("Buku4", "Chugong", 3);
       
        perpus.pinjam("Iqbal", "Buku1");
//        perpus.pinjam("Iqbal", "Buku2");
        perpus.pinjam("Iqbal", "Buku1");
        
        perpus.kembalikan("Iqbal", "Buku1");
//        perpus.pinjam("Iqbal", "Buku3");
        
        perpus.pinjam("Shinomiya", "Buku1");
//        perpus.pinjam("Shinomiya", "Buku2");
//        perpus.pinjam("Shinomiya", "Buku3");
//        perpus.pinjam("Shinomiya", "Buku4");
        
//        pegawaiPerpus.menambahBuku("Buku1", "Tiancan", 2);
//        perpus.tampilkanDetailBuku("Buku1");
//        perpus.pinjam("Hibiki", "Buku1");
//        perpus.pinjam("Hibiki", "Buku2");
//        perpus.pinjam("Hibiki", "Buku3");
        
//        perpus.pinjam("Hachida", "Buku1");
//        perpus.pinjam("Hachida", "Buku2");
//        perpus.pinjam("Hachida", "Buku3");
        
//        perpus.pinjam("Hiruka", "Buku1");
//        perpus.pinjam("Hiruka", "Buku2");
//        perpus.pinjam("Hiruka", "Buku3");
        
//        System.out.println(Buku.getJumlah());
        
//        pegawaiPerpus.menambahPelanggan("Hayasaka", "99001110009");
//        pegawaiPerpus.menambahPelanggan("Miyuki", "99001100008");
//        pegawaiPerpus.menambahPelanggan("Kei", "990011110077");
//        
//        pegawaiPerpus.menambahBuku("Heavens", "Tiancan", 3);
//        pegawaiPerpus.menambahBuku("Kaguya-sama", "Akasaka", 6);
//        pegawaiPerpus.menambahBuku("Solo Leveling", "Chugong", 1);
//        pegawaiPerpus.menambahBuku("Cara Memasak", "Chugong", 3);
//        
//        perpus.pinjam("Hayasaka", "Overlord");
//        perpus.pinjam("Miyuki", "Solo Leveling");
//        perpus.pinjam("Kei", "Solo Leveling"); // gagal kan cuma 1
////        perpus.pinjam("Hayasaka", "Kaguya-sama");
//        
//        
//        pegawaiPerpus.menambahBuku("Overlord", "Maruyama", 7);
//        pegawaiPerpus.menambahBuku("Kaguya-sama", "Akasaka", 3);
//        pegawaiPerpus.menambahBuku("Solo Leveling", "Chugong", 1);
//        pegawaiPerpus.menambahBuku("Solo Levelinga", "Chugong", 2);
//        pegawaiPerpus.menambahBuku("Solo Levelingb", "Chugong", 3);
//        pegawaiPerpus.menambahBuku("Solo Levelingc", "Chugong", 4);
//        
//        perpus.pinjam("Kei", "Heavens");
//        perpus.pinjam("Miyuki", "Solo Leveling");
//        perpus.pinjam("Kei", "Kaguya-sama");
//        perpus.pinjam("Kei", "Cara Memasak");
//        

//        pegawaiPerpus.menambahPelanggan("Miyuki", "1");
//        

        
        
//        perpus.pinjam("Shinomiya", "Solo Levelingc");
//        
//        
        Pelanggan.tampilkanInfoPelanggan();
        perpus.tampilkanInfoPerpustakaan();
    }
}
