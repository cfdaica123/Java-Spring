package com.dev.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.project.entity.User;
import com.dev.project.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void generateUsername(User user) {
        if (user.getEmployee() != null) {
            String firstName = user.getEmployee().getFirstName();
            String lastName = user.getEmployee().getLastName();

            if (firstName != null && lastName != null) {
                // Lấy chữ cái đầu tiên của họ và tên
                String firstCharFirstName = firstName.substring(0, 1).toLowerCase();
                String firstCharLastName = lastName.substring(0, 1).toLowerCase();

                // Tạo username theo quy tắc
                String username = firstCharFirstName + firstCharLastName + "_" + lastName.toLowerCase();

                // Kiểm tra xem username đã tồn tại chưa
                Optional<User> existingUserOptional = userRepository.findByUsername(username);
                User existingUser = existingUserOptional.orElse(null);

                if (existingUser != null) {
                    // Nếu tồn tại, cập nhật thông tin cho user hiện tại
                    User userToUpdate = existingUser;
                    userToUpdate.setEmployee(user.getEmployee());
                    userToUpdate.setRoles(user.getRoles());
                    // Cập nhật thông tin khác nếu cần
                    userRepository.save(userToUpdate);
                } else {
                    // Nếu không tồn tại, tạo mới
                    userRepository.save(user);
                }
            }
        }
    }
}

