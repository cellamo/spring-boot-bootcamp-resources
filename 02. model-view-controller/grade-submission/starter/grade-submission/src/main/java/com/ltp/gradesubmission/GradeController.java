package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    List<Grade> studentGrades = Arrays.asList(
        new Grade("Harry", "Potions", "C-"),
        new Grade("Hermonie", "Aritchmancy", "B+"),
        new Grade("Zafer", "Software", "A+")
    );

    @GetMapping("/grades")
    public String getGrades(Model model) {
        
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    @GetMapping("/form")
    public String getForms() {

        return "form";
    }

}
