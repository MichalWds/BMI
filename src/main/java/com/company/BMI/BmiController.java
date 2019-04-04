package com.company.BMI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class BmiController {


    DecimalFormat df = new DecimalFormat("##");

    @GetMapping("/bmi")
    public String getParam(

    ) {
        return "bmi";
    }

    @GetMapping("/result")
    public String getResult(@RequestParam Double height,
                            @RequestParam Double weight,
                            DecimalFormat df,
                            ModelMap map) {


        BmiCounter bmiCounter = new BmiCounter(height, weight);



        map.put("yourBMI", df.format(bmiCounter.getBMI()) );

        map.put("yourBM", bmiCounter.getMessage());

        map.put("bmi",bmiCounter.getBMI());

        return "result";
    }


}
