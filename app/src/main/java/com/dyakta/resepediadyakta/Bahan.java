package com.dyakta.resepediadyakta;

public class Bahan {
    String nama_bahan, tgl;

    public Bahan(String nama_bahan, String tgl) {
        this.nama_bahan = nama_bahan;
        this.tgl = tgl;
    }

    public Bahan() {
    }

    public String getNama_bahan() {
        return nama_bahan;
    }

    public void setNama_bahan(String nama_bahan) {
        this.nama_bahan = nama_bahan;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
}
