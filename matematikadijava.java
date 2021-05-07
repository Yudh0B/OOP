class matematika {
    public static void main(String[] args) {
        /*
         * Java Math sebuah class instan yang berisi fungsi - fungsi matematika
         */

        double x;
        double y;
        x = 10.34f;
        y = Math.sqrt(x);
        System.out.println("Akar x = " + y);
        /* fungsi lain yang terdapat pada java math antara lain : */
        System.out.println(Math.max(2, 90)); // berguna untuk mencari nilai yang lebih besar dari antara dua nilai
        System.out.println(Math.max(x, y)); // dapat juga digunakan untuk membandingkan variabel yang bernilai
        System.out.println(Math.min(2, 90)); // kebalikan dari math.max
        System.out.println(Math.abs(-x)); // fungsi absolut pada matematika yang akan memberikan nilai positif
        int angkaacak = (int) (Math.random() * 77); // untuk mendapat nilai random antara 0 - angka tertentu
        System.out.println(angkaacak);

    }
}