class konstruktor {
    /*
    constructor : method khusus yang digunakan untuk menginisialisasi objek
    constructor dipanggil ketika objek dibuat
    nama constructor harus sama dengan nama class dan tidak memiliki type return (void atau lainnya)
    secara default Java akan membuatkan constructor tanpa membuat nya secara khusus
    constructor dapat memiliki parameter yang bisa lebih dari 1
    */
    
    int x;
    String y;
    
    //membuat constructor
    public konstruktor(int a, String b) {
    x = a;
    y = b;
    }
    
    public static void main(String[] args) {
    //instan objek
    konstruktor obj = new konstruktor(5, "Elektro"); //objek dibuat sekaligus memanggil konstruktor dan menginisialisasi parameter konstruktor
    System.out.println("x = "+obj.x);
    System.out.println("y = "+obj.y);
    
    }
    
    
    
    
}