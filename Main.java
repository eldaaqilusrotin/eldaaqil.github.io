package com.company;
//absensi perpustakaan

//Anggota
class Anggota{
    //property
    String nama;
    String alamat;
    int usia;
    int id;
    Absensi absensi;

    //method
    void mengisiAbsensi(Absensi absensi){
        this.absensi = absensi;



    }
    //constructor
    Anggota(String nama, String alamat, int usia, int id){
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.id = id;
    }

    void displayAnggota(){
        System.out.println("Nama Anggota : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("ID Anggota : " + id);
        absensi.mengisiAbsensi();
    }


}


//Class Absensi
class Absensi{
    String hari;
    String status;


    //constructor
    Absensi(String hari, String status){
        this.hari = hari;
        this.status = status;
    }
    //method
    void mengisiAbsensi(){
        System.out.println("pada hari : " + hari);
        System.out.println(status );
    }
}

public class Main {

    public static void main(String[] args) {
        Anggota Susi = new Anggota("Susi Susanti", "Bandar Jaya Timur", 20, 918);

        Absensi kehadiran = new Absensi ("selasa", "Berhasil melakukan absensi");
        Susi.mengisiAbsensi(kehadiran);
        Susi.displayAnggota();
    }
}
