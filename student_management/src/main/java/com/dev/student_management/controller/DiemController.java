package com.dev.student_management.controller;

import com.dev.student_management.entity.Diem;
import com.dev.student_management.service.DiemService;
import com.dev.student_management.service.MonHocService;
import com.dev.student_management.service.SinhVienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/diem")
public class DiemController {

    @Autowired
    private MonHocService monHocService;

    @Autowired
    private SinhVienService sinhVienService;

    @Autowired
    private DiemService diemService;

    @GetMapping("")
    public String listDiem(Model model) {
        List<Diem> diemList = diemService.getAll();
        model.addAttribute("diemList", diemList);
        return "diem/list";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        Diem diem = new Diem();
        // Thêm logic để lấy danh sách môn học, sinh viên, và các thông tin khác nếu cần
        model.addAttribute("monHocList", monHocService.getAll());
        model.addAttribute("sinhVienList", sinhVienService.getAll());
        model.addAttribute("diem", diem);
        return "diem/form";
    }

    @PostMapping("/save")
    public String saveDiem(@ModelAttribute("diem") Diem diem) {
        diemService.save(diem);
        return "redirect:/diem";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("diemId") Long id, Model model) {
        Diem diem = diemService.getByID(id);
        model.addAttribute("diem", diem);
        // Thêm logic để lấy danh sách môn học, sinh viên, và các thông tin khác nếu cần
        model.addAttribute("monHocList", monHocService.getAll());
        model.addAttribute("sinhVienList", sinhVienService.getAll());
        return "diem/form";
    }

    @GetMapping("/delete")
    public String deleteDiem(@RequestParam("diemId") Long id) {
        diemService.deleteById(id);
        return "redirect:/diem";
    }
}
