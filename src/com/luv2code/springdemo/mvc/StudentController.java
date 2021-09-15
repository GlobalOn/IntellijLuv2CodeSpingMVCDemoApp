package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        //Create a new student object
        Student student = new Student();
        //Add student object to the model as an attribute
        theModel.addAttribute("student", student);
        return "studentForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        //log the input data
        System.out.println(student.getFirsName());
        return "studentConfirmation";
    }
}
