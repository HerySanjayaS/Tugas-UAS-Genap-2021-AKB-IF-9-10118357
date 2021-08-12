package com.example.uas_akb_10118457_fixxxxxxx;

public class HomeModel {

    //Tanggal   : 10 Agustus 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9

    String alamat,deskripsi,gambar,nama;

    HomeModel()
    {

    }
    public HomeModel(String alamat, String deskripsi, String gambar, String nama) {
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
