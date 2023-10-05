package com.dev.student_management.entity;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
public class GiangVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hoTen;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaySinh;

    private String chuyenNganh;

    private String soDienThoai;
    
    private String diaChi;

    @OneToMany(mappedBy = "giangVien", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MonHoc> monHocList;

    // @ManyToMany(mappedBy = "giangVienList", fetch = FetchType.LAZY)
    // private List<SinhVien> sinhVienList;

    // Getter, Setter
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public String getChuyenNganh() {
        return chuyenNganh;
    }
    
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public List<MonHoc> getMonHocList() {
        return monHocList;
    }
    
    public void setMonHocList(List<MonHoc> monHocList) {
        this.monHocList = monHocList;
    }
    
    // public List<SinhVien> getSinhVienList() {
    //     return sinhVienList;
    // }
    
    // public void setSinhVienList(List<SinhVien> sinhVienList) {
    //     this.sinhVienList = sinhVienList;
    // }

    // Constructor
    public GiangVien() {
    }

    @Override
    public String toString() {
        return "GiangVien{" +
            "id=" + id +
            ", hoTen='" + hoTen + '\'' +
            ", chuyenNganh='" + chuyenNganh + '\'' +
            ", ngaySinh=" + ngaySinh +
            ", soDienThoai='" + soDienThoai + '\'' +
            ", diaChi='" + diaChi + '\'' +
            ", monHocList=" + (monHocList != null ? monHocList.size() : "null") +
            // ", sinhVienList=" + (sinhVienList != null ? sinhVienList.size() : "null") +
            '}';
    }
}
