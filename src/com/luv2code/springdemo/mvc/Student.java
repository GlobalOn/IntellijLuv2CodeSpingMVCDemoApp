package com.luv2code.springdemo.mvc;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {

    private String firsName;
    private String lastName;
    private String country;
    private String programLanguage;
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> programLanguageOptions;
    private String[] operationSystems;

    public Student() {
        //Populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("RU", "Russia");
        countryOptions.put("PL", "Poland");
        countryOptions.put("IS", "Iceland");
        countryOptions.put("US", "United States of America");

        programLanguageOptions = new LinkedHashMap<>();
        programLanguageOptions.put("Java", "Java");
        programLanguageOptions.put("Python", "Python");
        programLanguageOptions.put("C#", "C#");
        programLanguageOptions.put("JavaScript", "JavaScript");
        programLanguageOptions.put("Ruby", "Ruby");
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getCountry() {
        return country;
    }

    public LinkedHashMap<String, String> getProgramLanguageOptions() {
        return programLanguageOptions;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String[] getOperationSystems() {
        return operationSystems;
    }

    public void setOperationSystems(String[] operationSystems) {
        this.operationSystems = operationSystems;
    }

    @Override
    public String toString() {
        return "Student{" +
                "operationSystems=" + Arrays.toString(operationSystems) +
                '}';
    }
}
