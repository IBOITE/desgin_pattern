package com.company.observer;

public class Executor {
    public static void main(String[] args) {
        Student mailik=new Student("mailik");
        Student ibo=new Student("ibo");
        Student abo=new Student("abo");
        Student shadi=new Student("shadi");

        course java=new course("java Course");

        java.subscribe(mailik);
        java.subscribe(ibo);
        java.subscribe(abo);
        java.subscribe(shadi);

        java.unsubscribe(shadi);

        //java.setAvailability(false);
        java.setAvailability(true);

    }
}
