package com.company.singleton;

import com.company.singleton.single;

public class Main {

    public static void main(String[] args) {
        single sin=single.getInstance();
        sin.printData();
        single sin1=single.getInstance();
        sin1.printData();
    }
}
