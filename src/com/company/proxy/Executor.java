package com.company.proxy;

import java.util.Arrays;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        List<String> sites= Arrays.asList("Malik","spak","twitter","youtube","facebook");
        InternetServiceprovider isp =new InternetProxy();
        for (String site:sites){
            System.out.println(isp.serveSite(site));
        }
    }
}
