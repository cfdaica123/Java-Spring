package com.dev.student_management.controller;

import com.dev.student_management.entity.SinhVien;
import com.dev.student_management.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sinh-vien")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping
    public String listSinhVien(Model model) {
        List<SinhVien> sinhVienList = sinhVienService.getAll();
        model.addAttribute("sinhVienList", sinhVienList);
        return "sinh-vien/list";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        SinhVien sinhVien = new SinhVien();
        model.addAttribute("sinhVien", sinhVien);
        return "sinh-vien/form";
    }

    @PostMapping("/save")
    public String saveSinhVien(@ModelAttribute("sinhVien") SinhVien sinhVien) {
        sinhVienService.save(sinhVien);
        return "redirect:/sinh-vien";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("sinhVienId") Long id, Model model) {
        SinhVien sinhVien = sinhVienService.getByID(id);
        model.addAttribute("sinhVien", sinhVien);
        return "sinh-vien/form";
    }

    @GetMapping("/delete")
    public String deleteSinhVien(@RequestParam("sinhVienId") Long id) {
        sinhVienService.deleteById(id);
        return "redirect:/sinh-vien";
    }
}
