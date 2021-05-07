class fmath {
    public static void main(String[] args) {
        /*
         * percabangan : - Pemilihan / seleksi / kondiosional - perulangan / loop
         * Kondisional : - menggunakan operator logic ( <,>,<=, >=, !=, ==) untuk
         * menentukan kondisi - bentuk umum : if (kondisi) { pernyataan1; }
         */
        // contoh if ()
        int x = 40;
        int y = 30;

        if (x > y) {
            System.out.println("Nilai x lebih dari y");
        } else {
            System.out.println("Nilai y lebih besar dari x");
        }
        // kondisional bertingkat
        // jika nilai d>0 maka akar persamaan real dan beda
        // jika nilai d=0 maka akar persamaan real dan sama
        // jika nilai d<0 maka akar persamaan imajiner

        // input a,b,c
        int a, b, c, D;
        a = 20;
        b = 90;
        c = 22;
        // rumus diskriminan
        D = (b * b) - (4 * a * c);
        // menampilkan diskriminan
        System.out.println("Hasil diskriminan = " + D);
        // membuat kondisional
        if (D > 0) {
            System.out.println("akar persamaan real dan beda");
        } else if (D == 0) {
            System.out.println("akar persamaan real dan sama");
        } else {
            System.out.println("akar persamaan imajiner");
        }

        int gol;
        gol = 2;
        if (gol == 1) {
            System.out.println("Golongan Gaji = 1, gaji = 1000000");
        } else if (gol == 2) {
            System.out.println("Golongan Gaji = 2, gaji = 2000000");
        } else if (gol == 3) {
            System.out.println("Golongan Gaji = 3, gaji = 3000000");
        } else if (gol == 4) {
            System.out.println("Golongan Gaji = 4, gaji = 4000000");
        } else {
            System.out.println("Golongan Gaji Salah");
        }

        // bentuk switch case (alternatif else if)
        // membuat konversi tabel gaji
        /*
         * gol gaji 1 1000000 2 2000000 3 3000000 4 4000000
         */
        /*
         * SWITCH CASE untuk kondisi satu opsi, tidak cocok jika kondisi memiliki bbrp
         * opsi bentuk umum: switch (kondisi) { case 'opsi1' : pernyataan1; breakl case
         * 'opsi2' : pernyataan2; break; default : pernyataan lain; break; }
         */
        // input golongan
        int golongan = 3;
        int gaji;
        switch (golongan) {
            case 1:
                gaji = 1000000;
                break;
            case 2:
                gaji = 2000000;
                break;
            case 3:
                gaji = 3000000;
                break;
            case 4:
                gaji = 4000000;
                break;
            default: {
                gaji = 0;
                System.out.println("Golongan gaji salah");
            }
        }
        System.out.println("Gaji = " + gaji);

        /*
         * konversi skor nilai skor > 80 nilai A skor : >70 s.d 80 nilai B skor : >55
         * s.d 70 nilai C skor : =>40 s.d 55 nilai D skor < 40 nilai E
         */

        int nilai;
        nilai = 10;
        if (nilai > 80) {
            System.out.println("Nilai = A");
        } else if (nilai > 70) {
            System.out.println("Nilai = B");
        } else if (nilai > 55) {
            System.out.println("Nilai = C");
        } else if (nilai > 40) {
            System.out.println("Nilai = D");
        } else if (nilai <= 40) {
            System.out.println("Nilai = E");
        } else {
            System.out.println("Salah Menginput Nilai");
        }
    }

}
