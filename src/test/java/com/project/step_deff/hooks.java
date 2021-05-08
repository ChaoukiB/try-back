package com.project.step_deff;

import com.project.utilities.Driver;
import org.junit.Before;

import java.util.Date;

public class hooks {

    @Before
    public void test(){

        Driver.getDriver().get("https://www.google.com/");

    }
    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date
        String str = String.format("Current Date/Time : %tc", date );

        System.out.printf(str);
    }
}
