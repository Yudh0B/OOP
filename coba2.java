class coba2 {
    public static void main(String[] args) {
        // Operator dalam java
        // operator aritmetika
        // membuat a=b+c
        int a;
        int b;
        int c;
        b = 10;
        c = 20;
        // int a,b,c; deklarasi beberapa variabel dengan tipe sejenis
        a = b + c;
        // tampilkan hasil
        System.out.println("Hasil penjumlahan = " + a);

        a = b * c;
        System.out.println("hasil perkalian = " + a);

        a = b % c;
        System.out.println("hasil modula = " + a);
        /*
         * = operator penugasan += operator penjumlahan rekursi x += 10 --> = x+10
         */
        a += 100;
        System.out.println("a = " + a);

        /*
         * operator pembanding == < > <= >= !=
         */

        System.out.println("bandingkan b == c : " + (b == c));
        System.out.println("bandingkan b != c : " + (b != c));

        String txt = "ABCdgodauhfansiocHJGDAIU";
        int panjang = txt.length();
        System.out.println("Panjang txt = " + panjang);
        String hrfbesar = txt.toUpperCase();
        System.out.println("Huruf besar txt = " + hrfbesar);
        String hrfkecil = txt.toLowerCase();
        System.out.println("Huruf kecil di TXT = " + hrfkecil);
    }// akhir dari fungsi main

}// akhir dari kelas