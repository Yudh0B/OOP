/*Access specifier untuk sebuah method : --> untuk menentukan sebuah method boleh diakses atau tidak di kelas turunannya
Jika dalam folder yang sama     
    - tidak memiliki specifier --> dikelas turunan bisa dipanggil
    - public -->dikelas turunan dapat diakses
    - private --> dikelas turunan tidak bisa dipanggil
    - protected --> di kelas turunan bisa dipanggil

Jika dalam folder yang berbeda   
    - tidak memiliki specifier --> dikelas turunan bisa dipanggil
    - public -->dikelas turunan dapat diakses
    - private --> dikelas turunan tidak bisa dipanggil
    - protected --> di kelas turunan bisa dipanggil
Inheritance/pewarisan 
     
*/

class induk {
    void cetak (){
        System.out.println("Haloooo saya induk");
    }
}

class anak extends induk {
    void cetak2 (){
        System.out.println("Hello Juga....");
    }
}

class anak2 extends induk {
    void cetak3() {
        System.out.println("Saya anak ke-2");
    }
}

class cucu1 extends anak {
    void cetakcucu1(){
        System.out.println("Saya cucu dari anak ke-1");
    }
}

class PBO {
    public static void main(String[] args) {
        //membuat objek anak
        anak objanak = new anak();
        anak2 objanak2 = new anak2();
        cucu1 objCucu1 = new cucu1();
        objanak.cetak(); //memanggil fungsi hasil penurunan
        objanak.cetak2(); //memanggil fungsi yang dimiliki kelas anak
        objanak2.cetak();
        objanak2.cetak3();
        objCucu1.cetakcucu1();
        objCucu1.cetak2();
        objCucu1.cetak();
    }
}
