class aljabar {
    // penjumlahan : void
    void penjumlahan(int a, int b) {
        System.out.println("Hasil Penjumlahan = " + (a + b));
    }

    // perkalian : int
    int perkalian(int a, int b) {
        return a * b;
    }
}// akhir kelas aljabar

class aljabar2 {
    // pengurangan : void
    void pengurangan(int a, int b) {
        System.out.println("Hasil pengurangan = " + (a - b));
    }

    // pembagian : double
    float pembagian(int a, int b) {
        return a / b;
    }

}// akhir kelas aljabar2

class implementasi_aljabar {
    public static void main(String[] args) {
        // menginstansiasi kelas aljabar
        aljabar objekAljabar = new aljabar();
        aljabar2 objekAljabar2 = new aljabar2();
        // memanggil class
        objekAljabar.penjumlahan(3, 5);
        int c = objekAljabar.perkalian(10, 10);
        System.out.println("Hasil Perkalian Adalah = " + c);
        objekAljabar2.pengurangan(30, 40);
        float d = objekAljabar2.pembagian(10, 3);
        System.out.println("Hasil Pembagian adalah = " + d);
    }
}