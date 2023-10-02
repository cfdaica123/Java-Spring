package com.dev.project.config.Data;

import com.dev.project.entity.Office;
import com.dev.project.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class OfficeInitializer implements CommandLineRunner {

    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public void run(String... args) throws Exception {
        // Thêm các văn phòng nếu chưa tồn tại
        List<OfficeInfo> officeInfos = Arrays.asList(
                new OfficeInfo("ItCompanyHoChiMinh", "268 Ly Thuong Kiet, Ward 14, District 10, Ho Chi Minh City, Vietnam"),
                new OfficeInfo("ItCompanyDaNang", "54 Nguyen Luong Bang, Hoa Khanh Bac, Lien Chieu, Da Nang 550000, Vietnam"),
                new OfficeInfo("ItCompanyHue", "176 Tran Phu, Ward, Hue City, Thua Thien Hue, Vietnam"),
                new OfficeInfo("ItCompanyHaNoi", "2R3V+XGX, Dong Tam, Hai Ba Trung, Hanoi, Vietnam")
        );

        for (OfficeInfo officeInfo : officeInfos) {
            Office existingOffice = officeRepository.findByOfficeName(officeInfo.officeName);
            if (existingOffice == null) {
                Office office = new Office();
                office.setOfficeName(officeInfo.officeName);
                office.setLocation(officeInfo.location);
                officeRepository.save(office);
            }
        }
    }

    private static class OfficeInfo {
        private final String officeName;
        private final String location;

        public OfficeInfo(String officeName, String location) {
            this.officeName = officeName;
            this.location = location;
        }
    }
}
