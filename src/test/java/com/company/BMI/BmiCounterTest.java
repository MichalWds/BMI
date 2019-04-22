package com.company.BMI;

import org.junit.Assert;
import org.junit.Test;

public class BmiCounterTest {

    private BmiCounter SUT = new BmiCounter(100, 40);

    @Test
    public void test_right_message_about_BMI() throws Exception {

        //given
        String name = null;

        //when
        String result = SUT.getMessage();

        //then
        Assert.assertEquals("Niestety jesteś otyły, zrzuć trochę kilogramów!", result);
    }

//    @Test
//    public void test_value_of_BMI() throws Exception {
//
//        //given
//        Double value;
//
//        //when
//        Double result = SUT.getBMI();
//
//        Assert.assertEquals(java.util.Optional.of(40), result);
//
//    }
}



