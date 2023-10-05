package com.dev.student_management.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class MonHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tenMonHoc;
    private int soTinChi;

    @OneToMany(mappedBy = "monHoc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Diem> diemList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "giang_vien_id")
    private GiangVien giangVien;

    // Getter, Setter
    public Long getId() {
        return id;
    }
    
    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }
    
    // Getter for tenMonHoc
    public String getTenMonHoc() {
        return tenMonHoc;
    }
    
    // Setter for tenMonHoc
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    
    // Getter for soTinChi
    public int getSoTinChi() {
        return soTinChi;
    }
    
    // Setter for soTinChi
    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    
    // Getter for diemList
    public List<Diem> getDiemList() {
        return diemList;
    }
    
    // Setter for diemList
    public void setDiemList(List<Diem> diemList) {
        this.diemList = diemList;
    }
    
    // Getter for giangVien
    public GiangVien getGiangVien() {
        return giangVien;
    }

    // Constructor
    public MonHoc() {
    }

    @Override
    public String toString() {
        return "MonHoc{" +
            "id=" + id +
            ", tenMonHoc='" + tenMonHoc + '\'' +
            ", soTinChi=" + soTinChi +
            ", diemList=" + (diemList != null ? diemList.size() : "null") +
            ", giangVien=" + giangVien +
            '}';
    }
}
