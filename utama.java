class utama {
    /*
    modifier method static bisa digunakan untuk memanggil method tanpa harus menginisialisasi objek dari kelas yang memiliki method tsb
    modifier method non static bisa dipanggil dengan menginisiasi objek dari kelas tsb */
    static void hitung (int a, int b){
        System.out.println("Hasil hitung = "+ (a+b));
    }
    
    static void hitung2 (int a, int b){
        System.out.println("Hasil hitung = "+ (a+b));
    }

    public static void main(String[] args) {
        hitung(10,20);
        hitung2(20, 20);
    }
}