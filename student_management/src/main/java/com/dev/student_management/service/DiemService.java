package com.dev.student_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.dev.student_management.entity.Diem;
import com.dev.student_management.repository.DiemRepository;

@Service
public class DiemService implements BaseService<Diem, Long> {

    @Autowired
    private DiemRepository diemRepository;

    @Override
    public List<Diem> getAll() {
        return diemRepository.findAll();
    }

    @Override
    public void save(Diem diem) {
        diemRepository.save(diem);
    }

    @Override
    public Diem getByID(Long id) {
        Optional<Diem> result = diemRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        diemRepository.deleteById(id);
    }
}
