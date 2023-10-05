package com.dev.student_management.controller;

import com.dev.student_management.entity.GiangVien;
import com.dev.student_management.service.GiangVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/giang-vien")
public class GiangVienController {

    @Autowired
    private GiangVienService giangVienService;

    @GetMapping("")
    public String listGiangVien(Model model) {
        List<GiangVien> giangVienList = giangVienService.getAll();
        model.addAttribute("giangVienList", giangVienList);
        return "giang-vien/list";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        GiangVien giangVien = new GiangVien();
        model.addAttribute("giangVien", giangVien);
        return "giang-vien/form";
    }

    @PostMapping("/save")
    public String saveGiangVien(@ModelAttribute("giangVien") GiangVien giangVien) {
        giangVienService.save(giangVien);
        return "redirect:/giang-vien/";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("giangVienId") Long id, Model model) {
        GiangVien giangVien = giangVienService.getByID(id);
        model.addAttribute("giangVien", giangVien);
        return "giang-vien/form";
    }

    @GetMapping("/delete")
    public String deleteGiangVien(@RequestParam("giangVienId") Long id) {
        giangVienService.deleteById(id);
        return "redirect:/giang-vien/";
    }
}
