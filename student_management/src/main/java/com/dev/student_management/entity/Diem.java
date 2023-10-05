package com.dev.student_management.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Diem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sinh_vien_id")
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "mon_hoc_id")
    private MonHoc monHoc;

    private double diem;

    // Getter, Setter
    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return SinhVien return the sinhVien
     */
    public SinhVien getSinhVien() {
        return sinhVien;
    }

    /**
     * @param sinhVien the sinhVien to set
     */
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    /**
     * @return MonHoc return the monHoc
     */
    public MonHoc getMonHoc() {
        return monHoc;
    }

    /**
     * @param monHoc the monHoc to set
     */
    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    /**
     * @return double return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }

    public Diem (){
        
    }

    @Override
    public String toString() {
        return "Diem{" +
            "id=" + id +
            ", sinhVien=" + sinhVien +
            ", monHoc=" + monHoc +
            ", diem=" + diem +
            '}';
    }
}

