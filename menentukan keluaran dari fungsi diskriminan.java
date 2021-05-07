class diskriminan {
    public static void main(String[] args) {
        // menginput nilai
        int a, b, c, D;
        a = 20;
        b = 31;
        c = 22;
        // rumus diskriminan
        D = (b * b) - (4 * a * c);
        // menampilkan diskriminan
        System.out.println("Hasil diskriminan = " + D);
        // membuat kondisional
        if (D > 0) {
            System.out.println("akar persamaan real");
        } else {
            System.out.println("akar persamaan imajiner");
        }

    }
}
