package com.dev.student_management.service;

import com.dev.student_management.entity.SinhVien;
import com.dev.student_management.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SinhVienService implements BaseService<SinhVien, Long> {

    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Override
    public List<SinhVien> getAll() {
        return sinhVienRepository.findAll();
    }

    @Override
    public void save(SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
    }

    @Override
    public SinhVien getByID(Long id) {
        Optional<SinhVien> result = sinhVienRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        sinhVienRepository.deleteById(id);
    }
}
