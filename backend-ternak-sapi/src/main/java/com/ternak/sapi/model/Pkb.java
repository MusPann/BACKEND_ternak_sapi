package com.ternak.sapi.model;

import com.ternak.sapi.model.audit.UserDateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pkb")
public class Pkb extends UserDateAudit {
    @Id
    private String idKejadian;

    @Lob
    private String tanggalPkb;
    private String lokasi;
    private String namaPeternak;
    
    @ManyToOne
    @JoinColumn(name = "idPeternak", referencedColumnName = "idPeternak")
    private StudyProgram idPeternak;
    
    private String nikPeternak;
    private String idHewan;
    private String spesies;
    private String kategori;
    private String jumlah;
    private String umurKebuntingan;
    private String pemeriksaKebuntingan;

    public Pkb() {
    }

    public Pkb(String idKejadian) {
        this.idKejadian = idKejadian;
    }

    public Pkb( String idKejadian, String tanggalPkb, String lokasi, 
            String namaPeternak, StudyProgram idPeternak, String nikPeternak, String idHewan, 
            String spesies, String jumlah, String kategori, String umurKebuntingan, String pemeriksaKebuntingan) {
        
        this.idKejadian = idKejadian;
        this.tanggalPkb = tanggalPkb;
        this.lokasi = lokasi;
        this.namaPeternak = namaPeternak;
        this.idPeternak = idPeternak;
        this.nikPeternak = nikPeternak;
        this.idHewan = idHewan;
        this.spesies = spesies;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.umurKebuntingan = umurKebuntingan;
        this.pemeriksaKebuntingan = pemeriksaKebuntingan;
    }


    public String getIdKejadian() {
        return idKejadian;
    }

    public void setIdKejadian(String idKejadian) {
        this.idKejadian = idKejadian;
    }

    public StudyProgram getIdPeternak() {
        return idPeternak;
    }

    public void setIdPeternak(StudyProgram idPeternak) {
        this.idPeternak = idPeternak;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getNamaPeternak() {
        return namaPeternak;
    }

    public void setNamaPeternak(String namaPeternak) {
        this.namaPeternak = namaPeternak;
    }

    public String getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(String idHewan) {
        this.idHewan = idHewan;
    }

    public String getNikPeternak() {
        return nikPeternak;
    }

    public void setNikPeternak(String nikPeternak) {
        this.nikPeternak = nikPeternak;
    }

    public String getPemeriksaKebuntingan() {
        return pemeriksaKebuntingan;
    }

    public void setPemeriksaKebuntingan(String pemeriksaKebuntingan) {
        this.pemeriksaKebuntingan = pemeriksaKebuntingan;
    }

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }

    public String getTanggalPkb() {
        return tanggalPkb;
    }

    public void setTanggalPkb(String tanggalPkb) {
        this.tanggalPkb = tanggalPkb;
    }

    public String getUmurKebuntingan() {
        return umurKebuntingan;
    }

    public void setUmurKebuntingan(String umurKebuntingan) {
        this.umurKebuntingan = umurKebuntingan;
    }
}
