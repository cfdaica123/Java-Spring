package com.dev.project.config.Data;

import com.dev.project.entity.City;
import com.dev.project.entity.Office;
import com.dev.project.repository.CityRepository;
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

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void run(String... args) throws Exception {
        // Thêm các văn phòng nếu chưa tồn tại
        List<OfficeInfo> officeInfos = Arrays.asList(
                new OfficeInfo("ItCompany", "268 Ly Thuong Kiet, Ward 14, District 10", "Ho Chi Minh"),
                new OfficeInfo("ItCompany", "54 Nguyen Luong Bang, Hoa Khanh Bac, Lien Chieu", "Da Nang"),
                new OfficeInfo("ItCompany", "176 Tran Phu", "Hue"),
                new OfficeInfo("ItCompany", "2R3V+XGX, Dong Tam, Hai Ba Trung", "Ha Noi")
        );

        for (OfficeInfo officeInfo : officeInfos) {
            Office existingOffice = officeRepository.findByOfficeName(officeInfo.officeName);
            if (existingOffice == null) {
                Office office = new Office();
                office.setOfficeName(officeInfo.officeName);
                office.setLocation(officeInfo.location);

                // Lấy thông tin thành phố từ tên thành phố
                City city = cityRepository.findByCityName(officeInfo.cityName);
                office.setCity(city);

                officeRepository.save(office);
            }
        }
    }

    private static class OfficeInfo {
        private final String officeName;
        private final String location;
        private final String cityName;

        public OfficeInfo(String officeName, String location, String cityName) {
            this.officeName = officeName + cityName;
            this.location = location;
            this.cityName = cityName;
        }
    }
}
