package com.company.singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class single {
    private Integer [] number={1,2,3,4,5,6};
    private List<Integer>list= Arrays.asList(number);
    private static single instance;

    public static single getInstance() {
        if(instance==null){
            instance=new single();
        }
        return instance;
    }

    private single(){
        System.out.println("object created");
        Collections.shuffle(list);
        System.out.println(this.hashCode());
    }
    public void printData(){
        for(Integer i:list){
            System.out.print(i.toString()+" ");
        }
        System.out.println();
    }
}
