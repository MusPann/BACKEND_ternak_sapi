package com.ternak.sapi.model;

import com.ternak.sapi.model.audit.UserDateAudit;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "inseminasi")
public class Inseminasi extends UserDateAudit {
    @Id
    private String idInseminasi;

    private String tanggalIB;

    private String lokasi;
    
    @ManyToOne
    @JoinColumn(name = "idPeternak", nullable = false)
    @JsonIgnore
    private Peternak idPeternak;
    @ManyToOne
    @JoinColumn(name = "kodeEartagNasional", nullable = false)
    @JsonIgnore
    private Hewan kodeEartagNasional;
    
    private String ib1;
    private String ib2;
    private String ib3;
    private String ibLain;
    
    private String idPejantan;
    
    private String idPembuatan;
    
    private String bangsaPejantan;
    
    private String produsen;
    
    private String inseminator;

    public Inseminasi() {
    }

    public Inseminasi(String idInseminasi) {
        this.idInseminasi = idInseminasi;
    }

    public Inseminasi(String idInseminasi, String tanggalIB, String lokasi,  Peternak idPeternak,
                      Hewan kodeEartagNasional, String ib1, String ib2, String ib3, String ibLain, 
                      String idPejantan, String idPembuatan, String bangsaPejantan, 
                      String produsen, String inseminator) {
        this.idInseminasi = idInseminasi;
        this.tanggalIB = tanggalIB;
        this.lokasi = lokasi;
        this.idPeternak = idPeternak;
        this.kodeEartagNasional = kodeEartagNasional;
        this.ib1 = ib1;
        this.ib2 = ib2;
        this.ib3 = ib3;
        this.ibLain = ibLain;
        this.idPejantan = idPejantan;
        this.idPembuatan = idPembuatan;
        this.bangsaPejantan = bangsaPejantan;
        this.produsen = produsen;
        this.inseminator = inseminator;
    }

    public String getIdInseminasi() {
        return idInseminasi;
    }

    public void setIdInseminasi(String idInseminasi) {
        this.idInseminasi = idInseminasi;
    }
    
    public String getTanggalIB() {
        return tanggalIB;
    }

    public void setTanggalIB(String tanggalIB) {
        this.tanggalIB = tanggalIB;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    

    public Peternak getIdPeternak() {
        return idPeternak;
    }

    public void setIdPeternak(Peternak idPeternak) {
        this.idPeternak = idPeternak;
    }

    public Hewan getKodeEartagNasional() {
        return kodeEartagNasional;
    }

    public void setKodeEartagNasional(Hewan kodeEartagNasional) {
        this.kodeEartagNasional = kodeEartagNasional;
    }

    public String getIb1() {
        return ib1;
    }

    public void setIb1(String ib1) {
        this.ib1 = ib1;
    }

    public String getIb2() {
        return ib2;
    }

    public void setIb2(String ib2) {
        this.ib2 = ib2;
    }

    public String getIb3() {
        return ib3;
    }

    public void setIb3(String ib3) {
        this.ib3 = ib3;
    }

    public String getIbLain() {
        return ibLain;
    }

    public void setIbLain(String ibLain) {
        this.ibLain = ibLain;
    }

    public String getIdPejantan() {
        return idPejantan;
    }

    public void setIdPejantan(String idPejantan) {
        this.idPejantan = idPejantan;
    }

    public String getIdPembuatan() {
        return idPembuatan;
    }

    public void setIdPembuatan(String idPembuatan) {
        this.idPembuatan = idPembuatan;
    }

    public String getBangsaPejantan() {
        return bangsaPejantan;
    }

    public void setBangsaPejantan(String bangsaPejantan) {
        this.bangsaPejantan = bangsaPejantan;
    }

    public String getProdusen() {
        return produsen;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }

    public String getInseminator() {
        return inseminator;
    }

    public void setInseminator(String inseminator) {
        this.inseminator = inseminator;
    }
    
}
