package utp;
// PR : Menghapus Buku dengan parameter judul
public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    public Buku(String judul, String penulis, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public void tampilkanBuku() {
        System.out.println("\nINFORMASI DETAIL BUKU");
        System.out.println("Judul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
        System.out.println("Jumlah\t: " + this.jumlah + "\n");
    }
}
