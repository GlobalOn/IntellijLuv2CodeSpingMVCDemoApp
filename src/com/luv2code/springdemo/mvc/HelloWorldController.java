package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/helloPage")
    public String doHelloPage() {
        return "helloWorldPage";
    }

    @RequestMapping("/helloPageFormProcessing")
    public String doHelloPageProcessingForm() {
        return "helloPageFormProcessing";
    }


    //Reading data from a form and adding data to a model
    @RequestMapping("/helloPageFormProcessingV2")
    public String doHelloPageProcessingFormV2(HttpServletRequest httpRequest, Model model) {

        //Read the request parameter from HTML form
        String name = httpRequest.getParameter("studentName");
        //Convert that data to Upper case parameter
        name = name.toUpperCase();
        //Create a message
        String message = "Yo " + name + "!";
        //Add message to the model
        model.addAttribute("message", message);
        return "helloPageFormProcessing";
    }
}
