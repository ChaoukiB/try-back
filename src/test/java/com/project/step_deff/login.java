package com.project.step_deff;

import com.project.pages.dashboard_page;
import com.project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class login extends dashboard_page{

    public static void main(String[] args) {
        String str = "chaouki";
        String[] arr = new String[3];
        arr[0] = "0";
        arr[1] = "2";
        arr[2] = "2";
        int num = 5 ^ 3;
        System.out.println(num);
        boolean g = str.matches(".*[a-z].*");
        System.out.println(g);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "2") {
                System.out.println("passed");
            }
        }

//        dashboard_page obj = new dashboard_page();
//        Driver.getDriver().get("https://www.google.com/");
//        obj.login("kk","j");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("");

        ArrayList<String> list = new ArrayList<>();

        List<WebElement> elementList = driver.findElements(By.xpath(""));

        Arrays.asList(elementList);
        Collections.sort(list);

    }






        //************************
        public static boolean isArmstrong(int num) {

            String number = String.valueOf(num);
            int power = number.length();
            int sum = 0;

            for(int i=0; i < number.length(); i++) {

                int digit = Integer.parseInt(""+ number.charAt(i));
                sum += Math.pow(digit, power);

            }

            return sum == num;

        }
    public static boolean isArmstrong2(int num) {
        int digits = num;
        int sum = 0;
        int power = String.valueOf(num).length();

        // 1
        // num % 10 --> last digit

        while(digits != 0){

            int each = digits % 10;
            digits /= 10;

            sum += Math.pow(each, power);
        }
        return sum == num;
    }


}
