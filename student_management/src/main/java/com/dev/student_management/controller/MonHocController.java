package com.dev.student_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.student_management.entity.GiangVien;
import com.dev.student_management.entity.MonHoc;
import com.dev.student_management.service.GiangVienService;
import com.dev.student_management.service.MonHocService;



@Controller
@RequestMapping("/mon-hoc")
public class MonHocController {

    @Autowired
    private MonHocService monHocService;

    @Autowired
    private GiangVienService giangVienService;

    @GetMapping("")
    public String listMonHoc(Model model) {
        List<MonHoc> monHocList = monHocService.getAll();
        model.addAttribute("monHocList", monHocList);
        return "mon-hoc/list";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        MonHoc monHoc = new MonHoc();
        List<GiangVien> giangVienList = giangVienService.getAll();
        model.addAttribute("monHoc", monHoc);
        model.addAttribute("giangVienList", giangVienList);
        return "mon-hoc/form";
    }

    @PostMapping("/save")
    public String saveMonHoc(@ModelAttribute("monHoc") MonHoc monHoc) {
        // Lấy giangVien từ giangVienId
        GiangVien giangVien = giangVienService.getByID(monHoc.getGiangVien().getId());
        monHoc.setGiangVien(giangVien);

        monHocService.save(monHoc);
        return "redirect:/mon-hoc";
    }



    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("monHocId") Long id, Model model) {
        MonHoc monHoc = monHocService.getByID(id);
        List<GiangVien> giangVienList = giangVienService.getAll();
        model.addAttribute("monHoc", monHoc);
        model.addAttribute("giangVienList", giangVienList);
        return "mon-hoc/form";
    }



    @GetMapping("/delete")
    public String deleteMonHoc(@RequestParam("monHocId") Long id) {
        monHocService.deleteById(id);
        return "redirect:/mon-hoc";
    }
}

