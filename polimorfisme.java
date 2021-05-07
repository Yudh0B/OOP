/*
Sifat OO :

Inheritance / pewarisan
Membuat super class (induk) dan sub class (turunan) dengan keyword extends
Access modifier menentukan turun dari sebuah class
Enkapsulasi  menyembunyikan detail dari objek, metode:
Mendeklarasikan class / atribut sebagai private
Menggunakan metode get dan set untuk mengakses dan mengupdate nilai dari private variable
Metode get me-return nilai variable, metode set untuk menentukan nilai variable

Tujuan enkapsulasi :

Membuat akses control class / atribut / method lebih baik
Atribut class bisa dibuat read-only (hanya menggunakan metode get saja) atau write-only (hanya menggunakan metode set saja)
Fleksibilitas untuk programmer dapat mengubah satu bagian program tanpa harus mempengaruhi bagian program lain
Menambah security data


Polimorfisme : banyak bentuk, menjelaskan atribut atau metode dari class yang bisa memiliki detail yang beda
Tugas buat program java untuk menjelaskan i... by Maman Somantri

Maman Somantri16:28
Tugas buat program java untuk menjelaskan inheritance, enkapsulasi dan polimorfisme yang lebih kompleks
*/

class Orang {
    private String nama;
    
    //menggunakan metode get : nama method nya getNamaAtribut
    public String getNama(){
    return nama;
    }
    
    //menggunakan metode set : nama methodnya setNamaAtribut
    public void setNama(String namabaru) {
    this.nama = namabaru;
    }
    
    public void karakterOrg() {
    System.out.println("Penyabar ...");
    }
    }
    
    
    
    class subOrang1 extends Orang {
    public void karakterOrg() {
    System.out.println("Pemarah ...");
    }
    
    }
    
    
    
    public class getset {
    public static void main(String[] args) {
    Orang obj = new Orang();
    //obj.nama = "Iwan"; // error
    obj.setNama("Iwan");
    System.out.println("Nama : "+obj.getNama());
    subOrang1 obj1 = new subOrang1();
    obj1.karakterOrg();
    
    }
    
    
    
    }