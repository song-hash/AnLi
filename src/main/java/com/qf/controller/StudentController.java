package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/stulist")
    public String getStudentList(Model model){
        List<Student> list = studentService.getStudentList();
        model.addAttribute("stulist",list);
        return "studentlist";
    }
}
