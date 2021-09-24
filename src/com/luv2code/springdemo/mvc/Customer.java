package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message = "is REQUIRED field")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is REQUIRED field")
    @Min(value = 0, message = "Have to be more or equals to 0!")
    @Max(value = 10, message = "Have to be less or equals to 10!")
    private Integer yearsInThisShop;

    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "Only 6 characters/digits")
    private String postCode;

    @CourseCode(value = "BLABLA", message = "The secret code should starts with BLABLA")
    private String courseCode;


    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYearsInThisShop() {
        return yearsInThisShop;
    }

    public void setYearsInThisShop(Integer yearsInThisShop) {
        this.yearsInThisShop = yearsInThisShop;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
