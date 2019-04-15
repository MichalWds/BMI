package com.company.BMI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class BmiCounter {
    private double height;
    private double weight;

    private String a = "Masz niedowagę, przytyj trochę!";
    private String b = "Bardzo dobrze! Masz odpowiednią wagę dla swojego wzrostu!";
    private String c = "Masz lekka nadwagę, poćwicz!";
    private String d = "Niestety jesteś otyły, zrzuć trochę kilogramów!";

    public BmiCounter(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public double getBMI() {

        return this.weight / (this.height * this.height / 10000);
    }

    public String getMessage() {
        if (getBMI() < 18.5) {
            return a;
        } else if (getBMI() <= 24.9) {
            return b;
        } else if (getBMI() <= 29.9) {
            return c;
        } else {
            return d;
        }
    }

    private double getHeight() {
        return height;
    }
    private void setHeight(double height) {
        this.height = height;
    }
    private double getWeight() {
        return weight;
    }
    private void setWeight(double weight) {
        this.weight = weight;
    }


}


