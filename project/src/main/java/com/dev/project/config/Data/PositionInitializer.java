package com.dev.project.config.Data;

import com.dev.project.entity.Position;
import com.dev.project.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PositionInitializer implements CommandLineRunner {

    @Autowired
    private PositionRepository positionRepository;

    // Thêm khai báo biến positionsInitialized ở đây
    private static boolean positionsInitialized = false;

    @Override
    public void run(String... args) throws Exception {

        // Tạo chức vụ nếu chưa được khởi tạo
        if (!positionsInitialized) {
            initializePositions();
            positionsInitialized = true;
        }
    }

    private void initializePositions() {
        createPositionIfNotExists("Chairperson"); // Chủ tịch
        createPositionIfNotExists("Director"); // Giám đốc
        createPositionIfNotExists("Deputy Director"); // Phó giám đốc
        createPositionIfNotExists("Department Head"); // Trưởng phòng ban
        createPositionIfNotExists("Deputy Department Head"); // Phó phòng ban
        createPositionIfNotExists("Department Staff"); // Nhân viên phòng ban
    }
    

    private void createPositionIfNotExists(String positionName) {
        Position existingPosition = positionRepository.findByPositionName(positionName);

        if (existingPosition == null) {
            Position position = new Position();
            position.setPositionName(positionName);
            positionRepository.save(position);
        }
    }
}
