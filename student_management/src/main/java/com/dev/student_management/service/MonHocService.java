package com.dev.student_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.student_management.entity.MonHoc;
import com.dev.student_management.repository.MonHocRepository;

@Service
public class MonHocService implements BaseService<MonHoc, Long>{

    @Autowired
    private MonHocRepository monHocRepository;
    @Override
    public List<MonHoc> getAll() {
        // TODO Auto-generated method stub
        return monHocRepository.findAll();
    }

    @Override
    public void save(MonHoc monHoc) {
        // TODO Auto-generated method stub
        monHocRepository.save(monHoc);
    }

    @Override
    public MonHoc getByID(Long id) {
        // TODO Auto-generated method stub
        Optional<MonHoc> result = monHocRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        monHocRepository.deleteById(id);
    }

    public List<MonHoc> getAllWithGiangVien() {
        return monHocRepository.findAllWithGiangVien();  // Điều này giả sử bạn có một phương thức tương ứng trong repository.
    }
    
}
