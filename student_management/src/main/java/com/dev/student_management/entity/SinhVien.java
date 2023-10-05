package com.dev.student_management.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hoTen;
    private LocalDate ngaySinh;
    private String gioiTinh;
    private String lop;
    private double diemTB;

    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Diem> diemList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
      name = "sinh_vien_giang_vien", 
      joinColumns = @JoinColumn(name = "sinh_vien_id"), 
      inverseJoinColumns = @JoinColumn(name = "giang_vien_id"))
    private List<GiangVien> giangVienList;


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
    
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public String getGioiTinh() {
        return gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getLop() {
        return lop;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public double getDiemTB() {
        return diemTB;
    }
    
    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public List<Diem> getDiemList() {
        return diemList;
    }

    public void setDiemList(List<Diem> diemList) {
        this.diemList = diemList;
    }

    // Constructor
    public SinhVien() {
    }
    @Override
    public String toString() {
        return "SinhVien{" +
            "id=" + id +
            ", hoTen='" + hoTen + '\'' +
            ", ngaySinh=" + ngaySinh +
            ", gioiTinh='" + gioiTinh + '\'' +
            ", lop='" + lop + '\'' +
            ", diemTB=" + diemTB +
            ", diemList=" + diemList +
            ", giangVienList=" + giangVienList +
            '}';
    }
}


