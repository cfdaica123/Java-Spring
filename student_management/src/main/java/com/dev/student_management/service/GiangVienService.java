package com.dev.student_management.service;

import com.dev.student_management.entity.GiangVien;
import com.dev.student_management.entity.SinhVien;
import com.dev.student_management.repository.GiangVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiangVienService implements BaseService<GiangVien, Long>{

    @Autowired
    private GiangVienRepository giangVienRepository;

    @Override
    public List<GiangVien> getAll() {
        // TODO Auto-generated method stub
        return giangVienRepository.findAll();
    }

    @Override
    public void save(GiangVien giangVien) {
        // TODO Auto-generated method stub
        giangVienRepository.save(giangVien);
    }

    @Override
    public GiangVien getByID(Long id) {
        // TODO Auto-generated method stub
        Optional<GiangVien> result = giangVienRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        giangVienRepository.deleteById(id);
    }

    
}
