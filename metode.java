class metode {
    /*
     * method : blok program yang akan dieksekusi ketika dipanggil dipanggil di
     * dalam fungsi main() method : - memiliki input - memiliki proses - memiliki
     * luaran--> jenis/tipe luaran - return (nilai yang dikeluarkan) --> berbentuk
     * value - return hasil eksekusi membuat method tipekeluaran
     * namamethod(argument/input)
     */

    int duakali(int a) {
        int b = 2 * a;
        return b; // mengeluarkan nilai int
    }

    int perkalianint(int a, int b) {
        int c = a * b;
        return c;
    }

    // method yang return eksekusi hasil
    // bentuk umum: void namamethod(argument/input)
    void tampil3x(int b) {
        int a = 3 * b;
        System.out.println("Hasil 3x = " + a);
    }

    void penjumlahan(int a, int b) {
        int c = a + b;
        System.out.println("Hasil Penjumlahan = " + c);
    }

    void perkalian(int a, int b) {
        int c = a * b;
        System.out.println("Hasil Perkalian = " + c);
    }

    public static void main(String[] args) {
        // memanggil method duakali
        // instansiasi objek dari class
        // namaclass namaobjek = new namaclass()
        metode objek = new metode();
        // memanggil method
        // namaobjek.namametode
        int x = objek.duakali(5);
        System.out.println("x = " + x);

        // memanggil method tampil3x
        objek.tampil3x(10);

        // memanggil fungsi penjumlahan
        objek.penjumlahan(100, 200);

        // membuat method perkalian(a,b) : return int
        // membuat perkalian(a,b) : void
        int c = objek.perkalianint(5, 10);
        System.out.println("hasil perkalian dengan int, C = " + c);
        objek.perkalian(100, 200);

        
    }
}