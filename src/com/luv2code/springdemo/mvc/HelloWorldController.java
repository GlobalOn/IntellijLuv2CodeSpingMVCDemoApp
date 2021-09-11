package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
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

    //Reading data from a form and adding data to a model
    @RequestMapping("/helloPageFormProcessingV3")
    public String doHelloPageProcessingFormV3(@RequestParam("studentName") String theName,
                                              Model model) {
        //Convert that data to Upper case parameter
        theName = theName.toUpperCase();
        //Create a message
        String message = "Hey my Friend from V3! " + theName + "!";
        //Add message to the model
        model.addAttribute("message", message);
        return "helloPageFormProcessing";
    }

}
